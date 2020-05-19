import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wsa.WindowSlidingAlgorithm;

import static org.assertj.core.api.Assertions.assertThat;

public class WindowSlidingAlgorithmUnitTest {
    private WindowSlidingAlgorithm algo;

    @BeforeEach
    void init() {
        this.algo = new WindowSlidingAlgorithm();
    }

    @Test
    void shouldReturnNullWhenGivenEmptyArray() {
        assertThat(this.algo.findMaxSumOfSubArray(new int[]{}, 3))
                .isNull();
    }

    @Test
    void shouldReturnNullWhenGivenArrayIsNull() {
        assertThat(this.algo.findMaxSumOfSubArray(null, 3))
                .isNull();
    }

    @Test
    void shouldReturnMaxSumWhenGivenArrayHaveProperValue() {
        assertThat(this.algo.findMaxSumOfSubArray(new int[]{4, 5, 3, 2, 6, 8}, 3))
                .isEqualTo(16);
    }

}
