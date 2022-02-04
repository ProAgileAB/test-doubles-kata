import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzSenderMockSolutionTest {

    @Test
    internal fun `normal numbers are converted to strings`() {
        var call = 0
        FizzBuzzSender().print {
            call++
            if (call == 1 && it != "1") throw Exception("invalid argument: expected 1 got ${it}")
            if (call == 2 && it != "2") throw Exception("invalid argument: expected 2 got ${it}")
        }
    }
    
    @Test
    internal fun `numbers divisible by 3 are converted to Fizz`() {
        FizzBuzzSender().print {
            if (it in listOf("3", "6")) throw Exception("invalid argument ${it} should be Fizz")
        }
    }
    
    @Test
    internal fun `numbers divisible by 5 are converted to Bizz`() {
        FizzBuzzSender().print {
            if (it in listOf("5", "10")) throw Exception("invalid argument ${it} should be Buzz")
        }
    }
    
    @Test
    internal fun `numbers divisible by 15 are converted to FizzBizz`() {
        FizzBuzzSender().print {
            if (it in listOf("15", "30")) throw Exception("invalid argument ${it} should be FizzBuzz")
        }
    }
}