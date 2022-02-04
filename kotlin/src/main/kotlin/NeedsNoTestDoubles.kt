class FizzBuzzReturnsString {
    fun print(): String {
        return buildString {
            for (i in 1..100) {
                when {
                    i % 15 == 0 -> append("FizzBuzz\n")
                    i % 5 == 0 -> append("Buzz\n")
                    i % 3 == 0 -> append("Fizz\n")
                    else -> append("${i}\n")
                }
            }
        }
    }
}

fun fizzBuzzLogic(i: Int): String = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Buzz"
    i % 3 == 0 -> "Fizz"
    else -> "${i}"
}
