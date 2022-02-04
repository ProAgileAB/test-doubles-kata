class FizzBuzzerComponent(val fizzBuzzer: FizzBuzzer) {
    fun print(): String {
        return buildString {
            for (i in 1..100) {
                    append("${fizzBuzzer.fizzBuzz(i)}\n")
            }
        }
    }
}

class FizzBuzzer {
    fun fizzBuzz(i: Int): String {
        Thread.sleep(100) // simulate database access
        return when {
            i % 15 == 0 -> "FizzBuzz"
            i % 5 == 0 -> "Buzz"
            i % 3 == 0 -> "Fizz"
            else -> "${i}"
        }
    }
}
