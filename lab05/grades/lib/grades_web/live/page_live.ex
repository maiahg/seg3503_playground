defmodule GradesWeb.PageLive do
  use GradesWeb, :live_view
  alias Grades.Calculator

  @impl true
  def mount(_params, _session, socket) do
    socket
    |> assign_grades()
    |> my_reply(:ok)
  end

  @impl true
  def handle_event("calculate", fields, socket) do
    grades = %{
      homework: lookup(fields, "h", socket.assigns[:num_homeworks], &parse_mark/1),
      labs: lookup(fields, "l", socket.assigns[:num_labs], &parse_mark/1),
      midterm: parse_mark(fields["midterm"]),
      final: parse_mark(fields["final"])
    }

    socket
    |> assign(:grades, grades)
    |> assign(:letter_grade, Calculator.letter_grade(grades))
    |> assign(:percentage_grade, Calculator.percentage_grade(grades))
    |> assign(:numeric_grade, Calculator.numeric_grade(grades))
    |> my_reply(:noreply)
  end

  defp assign_grades(socket) do
    grades = %{homework: [], labs: [], midterm: nil, final: nil}

    socket
    |> assign(:num_homeworks, 4)
    |> assign(:num_labs, 6)
    |> assign(:grades, grades)
    |> assign(:letter_grade, "--")
    |> assign(:percentage_grade, "--")
    |> assign(:numeric_grade, "--")
  end

  defp lookup(fields, prefix, num, transform) do
    Enum.map(1..num, fn n -> transform.(fields["#{prefix}#{n}"]) end)
  end

  defp parse_mark(nil), do: 0

  defp parse_mark(mark) do
    case mark |> String.trim() |> Float.parse() do
      {number, ""} when number > 1 -> number / 100
      {number, ""} -> number
      _ -> 0
    end
  end

  defp my_reply(socket, ok), do: {ok, socket}
end
