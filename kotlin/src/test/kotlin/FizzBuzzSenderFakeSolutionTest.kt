import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzSenderFakeSolutionTest {
    
    val list = buildList {
        add("offset") // this is so that line one is index one
        FizzBuzzSender().print(::add)
    }
    
    @Test
    internal fun `normal numbers are converted to strings`() {
        assertEquals("1", list[1])
        assertEquals("2", list[2])
    }
    
    @Test
    internal fun `numbers divisible by 3 are converted to Fizz`() {
        assertEquals("Fizz", list[3])
        assertEquals("Fizz", list[6])
    }
    
    @Test
    internal fun `numbers divisible by 5 are converted to Bizz`() {
        assertEquals("Buzz", list[5])
        assertEquals("Buzz", list[10])
    }
    
    @Test
    internal fun `numbers divisible by 15 are converted to FizzBizz`() {
        assertEquals("FizzBuzz", list[15])
        assertEquals("FizzBuzz", list[30])
    }
}