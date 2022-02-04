class FizzBuzzSender {
    fun print(send: (String) -> Unit) {
        for (i in 1..100) {
            when {
                i % 15 == 0 -> send("FizzBuzz")
                i % 5 == 0 -> send("Buzz")
                i % 3 == 0 -> send("Fizz")
                else -> send("${i}")
            }
        }
    }
}
