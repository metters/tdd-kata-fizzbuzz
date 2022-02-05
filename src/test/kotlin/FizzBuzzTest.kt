import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `that returns all numbers from 1 to 10 including 'Fizz'`() {
        assertThat(sut.fizzBuzz(10))
            .isEqualTo("[1, 2, Fizz, 4, 5, Fizz, 7, 8, Fizz, 10]")
    }

    @Test
    fun `that '3' is converted to 'Fizz'`() {
        assertThat(sut.fizzBuzz(3))
            .isEqualTo("[1, 2, Fizz]")
    }

    @Test
    fun `that '3' and '6' are converted to 'Fizz'`() {
        assertThat(sut.fizzBuzz(6))
            .isEqualTo("[1, 2, Fizz, 4, 5, Fizz]")
    }
}