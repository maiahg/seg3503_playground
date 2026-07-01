defmodule GradesWeb.PageLiveTest do
  use GradesWeb.ConnCase

  import Phoenix.LiveViewTest

  test "disconnected and connected render", %{conn: conn} do
    {:ok, page_live, disconnected_html} = live(conn, "/")
    assert disconnected_html =~ "Grades"
    assert render(page_live) =~ "Grades"
  end

  test "submitting an empty grades form does not crash", %{conn: conn} do
    {:ok, page_live, _html} = live(conn, "/")

    html =
      page_live
      |> form("form", %{
        "h1" => "",
        "h2" => "",
        "h3" => "",
        "h4" => "",
        "midterm" => "",
        "final" => "",
        "l1" => "",
        "l2" => "",
        "l3" => "",
        "l4" => "",
        "l5" => "",
        "l6" => ""
      })
      |> render_submit()

    assert html =~ "Final Grade"
  end
end
