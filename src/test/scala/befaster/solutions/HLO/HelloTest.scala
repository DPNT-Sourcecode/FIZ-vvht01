package befaster.solutions.HLO

import befaster.solutions.SUM.Sum
import org.scalatest.{FlatSpec, Matchers}

class HelloTest  extends FlatSpec with Matchers {

  it should "test hello world" in {
    Hello.hello("anjan") shouldBe "Hello, anjan!"
  }

}
