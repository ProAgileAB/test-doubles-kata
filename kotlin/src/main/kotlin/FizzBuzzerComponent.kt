class FizzBuzzerComponent(private val fizzBuzzer: FizzBuzzer) {
    fun print(): String {
        return buildString {
            for (i in 1..100) {
                    append("${fizzBuzzer.fizzBuzz(i)}\n")
            }
        }
    }
}

