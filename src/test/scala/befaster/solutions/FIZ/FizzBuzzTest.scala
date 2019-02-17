package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest  extends FlatSpec with Matchers {

  it should "retrun 'fizz' when given number is 9" in {
    FizzBuzz.fizzBuzz(9) shouldBe "fizz"
  }

  it should "retrun '' when given number is 0" in {
    FizzBuzz.fizzBuzz(8) shouldBe ""
  }

  it should "retrun 'buzz' when given number is 25" in {
    FizzBuzz.fizzBuzz(25) shouldBe "buzz"
  }

}

