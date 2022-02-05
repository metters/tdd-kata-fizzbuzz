import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `that returns all numbers from 1 to 10 including 'Fizz'`() {
        assertThat(sut.fizzBuzz(10))
            .isEqualTo("[1, 2, Fizz, 4, 5, Fizz, 7, 8, Fizz, 10]")
    }
}