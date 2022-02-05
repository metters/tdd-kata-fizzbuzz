import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `that returns all numbers from 1 to 15 including 'Fizz', 'Buzz', and 'FizzBuzz`() {
        assertThat(sut.fizzBuzz(15))
            .isEqualTo("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]")
    }
}