package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest  extends FlatSpec with Matchers {

  it should "return 'fizz' when given number is 9" in {
    FizzBuzz.fizzBuzz(9) shouldBe "fizz"
  }

  it should "return 13 when given number is 13" in {
    FizzBuzz.fizzBuzz(13) shouldBe ""
  }

  it should "return 'buzz' when given number is 25" in {
    FizzBuzz.fizzBuzz(25) shouldBe "buzz"
  }

  it should "return 'fizz buzz' when given number is 15" in {
    FizzBuzz.fizzBuzz(15) shouldBe "fizz buzz"
  }

  it should "return 11 when given number is 11" in {
    FizzBuzz.fizzBuzz(11) shouldBe "11"
  }

}



