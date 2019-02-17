package befaster.solutions.FIZ

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest  extends FlatSpec with Matchers {

  it should "retrun fizz" in {
    //Hello.hello("anjan") shouldBe "Hello, anjan!"
    FizzBuzz.fizzBuzz(9) shouldBe "fizz"
  }

}

