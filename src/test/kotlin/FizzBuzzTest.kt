import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `that returns all numbers from 1 to 10`() {
        assertThat(sut.fizzBuzz(10))
            .isEqualTo("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]")
    }
}