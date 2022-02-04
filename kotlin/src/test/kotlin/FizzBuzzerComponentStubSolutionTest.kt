import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FizzBuzzerComponentStubSolutionTest {
    @Test
    internal fun `it uses the dependency`() {
        val sut = FizzBuzzerComponent(FizzBuzzer { "test data " + it })
        val ret = sut.print()
        assertEquals(101, ret.lines().size)
    }
}