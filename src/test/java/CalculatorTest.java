import lesson01.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public static void main(String[] args) {

        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '+';
        assert (9 == Calculator.calculation(firstOperand,secondOperand,operator));

        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(3);
        assertThat(Calculator.calculation(firstOperand,secondOperand,operator)).isEqualTo(3);

        assertThatThrownBy(() -> Calculator.calculation(1,0,'_'))
                .isInstanceOf(IllegalStateException.class);
    }
    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        Assertions.assertEquals(5, 2 + 3);
    }
    @Test
    @Disabled
    public void testMethod() {
        // этот тест не будет запущен
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testMethod(int argument) {
        assertTrue(argument > 0);
    }

}
