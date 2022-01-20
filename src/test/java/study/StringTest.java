package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    @DisplayName("replace 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2를 , 로 split 한다")
    void splitTest1() {
        String text = "1,2";
        String[] split = text.split(",");
        assertThat(split).contains("1").contains("2");
    }

    @Test
    @DisplayName("1을 , 로 spliat 한다")
    void splitTest2() {
        String text = "1";
        String[] split = text.split(",");
        assertThat(split).containsExactly("1");
    }

}