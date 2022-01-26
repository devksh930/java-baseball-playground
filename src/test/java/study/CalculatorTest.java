package study;

import calculator.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    @DisplayName("더하기 테스트")
    void addTest() {
        int add = stringCalculator.add(1, 2);
        assertThat(add).isEqualTo(1 + 2);
    }

    @Test
    @DisplayName("빼기 테스트")
    void subTest() {
        int subtract = stringCalculator.subtract(3, 2);
        assertThat(subtract).isEqualTo(3 - 2);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void multiplyTest() {
        int multiply = stringCalculator.multiply(4, 4);
        assertThat(multiply).isEqualTo(4 * 4);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divideTest() {
        int divide = stringCalculator.divide(4, 2);
        assertThat(divide).isEqualTo(4 / 2);
    }

    @ParameterizedTest
    @CsvSource(value = {"+:true", "-:true", "*:true", "/:true", "'#':false"}, delimiter = ':')
    @DisplayName("연산자 확인테스트")
    void operatorTest(String input, boolean expected) {
        assertThat(stringCalculator.isOperator(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("연산 테스트")
    void Calc() {
        int calc = stringCalculator.Calc("2 + 3 * 4 / 2");
        assertThat(calc).isEqualTo(10);
    }
}
