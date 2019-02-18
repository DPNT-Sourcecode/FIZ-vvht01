package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String =
    if (number % 3== 0) "fizz"
    else if (number % 5 == 0) "buzz"
    else ""
}


