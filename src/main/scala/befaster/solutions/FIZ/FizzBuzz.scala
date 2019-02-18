package befaster.solutions.FIZ

import befaster.runner.SolutionNotImplementedException

object FizzBuzz {
  def fizzBuzz(number: Int): String = {

    val pattern3 = "[3]"
    val pattern5 = "[5]"

    if (number % 3 == 0 && number % 5 == 0) "fizz buzz"
    else if (number % 3 == 0 ||  pattern3.matches(number.toString) == true) "fizz"
    else if (number % 5 == 0  || pattern5.matches(number.toString) == true) "buzz"
    else number.toString
  }

}




