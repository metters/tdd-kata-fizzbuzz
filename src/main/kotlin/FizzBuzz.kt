class FizzBuzz {

    fun fizzBuzz(input: Int): String {
        return (1..input)
            .map {
                when {
                    it % 15 == 0 -> "FizzBuzz"
                    it % 3 == 0 -> "Fizz"
                    it % 5 == 0 -> "Buzz"
                    else -> it
                }
            }
            .toString()
    }

}