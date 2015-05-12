package samples
import org.scalatest.Assertions
import scala.collection.mutable.Stack
import org.junit.Test

class SukhSuite extends Assertions {

  @Test def stackShouldPopValuesIinLastInFirstOutOrder() {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }
  
}