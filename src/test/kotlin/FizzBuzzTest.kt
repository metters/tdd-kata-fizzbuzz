import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `that returns all numbers from 1 to 10 including 'Fizz' and 'Buzz'`() {
        assertThat(sut.fizzBuzz(10))
            .isEqualTo("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]")
    }

    @Test
    fun `that numbers divisible by 15 are converted to 'FizzBuzz`() {
        assertThat(sut.fizzBuzz(15)).endsWith("FizzBuzz]")
    }
}