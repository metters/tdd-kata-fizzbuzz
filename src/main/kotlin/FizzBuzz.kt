class FizzBuzz {

    fun fizzBuzz(input: Int): String {
        return (1..input)
            .map { if (it == 3) "Fizz" else it }
            .toString()
    }

}