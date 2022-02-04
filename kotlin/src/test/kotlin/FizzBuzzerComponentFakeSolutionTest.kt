import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FizzBuzzerComponentFakeSolutionTest {
    @Test
    internal fun `it uses the dependency`() {
        val sut = FizzBuzzerComponent {
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 5 == 0 -> "Buzz"
                it % 3 == 0 -> "Fizz"
                else -> "${it}"
            }
        }
        val ret = sut.print()
        assertEquals(101, ret.lines().size)
    }
}