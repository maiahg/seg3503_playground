defmodule Grades.Calculator do
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    Enum.random(0..100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    arr = ["EIN", "F", "E", "D", "D+", "C", "C+", "B", "B+", "A-", "A", "A+"]
    Enum.random(arr)
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    Enum.random(0..10)
  end

end

