import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzSenderSpySolutionTest {
    
    fun spy(): Pair<List<String>, (String) -> Unit> {
        val calls = mutableListOf("offset")
        return  calls to {calls.add(it); Unit}
    }
    
    
    @Test
    internal fun `normal numbers are converted to strings`() {
        val (calls, send) = spy()
        FizzBuzzSender().print(send)
        assertEquals("1", calls[1])
        assertEquals("2", calls[2])
    }
    
    @Test
    internal fun `numbers divisible by 3 are converted to Fizz`() {
        val (calls, send) = spy()
        FizzBuzzSender().print(send)
        assertEquals("Fizz", calls[3])
        assertEquals("Fizz", calls[6])
    }
    
    @Test
    internal fun `numbers divisible by 5 are converted to Bizz`() {
        val (calls, send) = spy()
        FizzBuzzSender().print(send)
        assertEquals("Buzz", calls[5])
        assertEquals("Buzz", calls[10])
    }
    
    @Test
    internal fun `numbers divisible by 15 are converted to FizzBizz`() {
        val (calls, send) = spy()
        FizzBuzzSender().print(send)
        assertEquals("FizzBuzz", calls[15])
        assertEquals("FizzBuzz", calls[30])
    }
}