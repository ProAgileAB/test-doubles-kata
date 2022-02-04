class RemoteFizzBuzzer: FizzBuzzer {
    override fun fizzBuzz(i: Int): String {
        Thread.sleep(100) // simulate database access
        return when {
            i % 15 == 0 -> "FizzBuzz"
            i % 5 == 0 -> "Buzz"
            i % 3 == 0 -> "Fizz"
            else -> "$i"
        }
    }
}