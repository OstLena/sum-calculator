import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumWithArgumentOne() {
        int result = sumCalculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    void sumWithArgumentThree() {
        int result = sumCalculator.sum(3);
        assertEquals(6, result);
    }

    @Test
    void sumWithArgumentZero() {

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
        assertEquals("Error, argument cannot be 0", thrown.getMessage());
    }
}