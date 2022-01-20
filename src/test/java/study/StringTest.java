package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
    @DisplayName("1을 , 로 split 한다")
    void splitTest2() {
        String text = "1";
        String[] split = text.split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    @DisplayName("(1,2) 값이 주어졌을 때 ()제거")
    void substring() {
        String text = "(1,2)";
        String substring = text.substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("chartAt()으로 특정문자열을 가저온다")
    void charAtTest() {
        String text = "abc";
        assertThat(text.charAt(0)).isEqualTo('a');
        assertThat(text.charAt(1)).isEqualTo('b');
        assertThat(text.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("chartAt()으로 특정문자열 가져온다 범위초과.")
    void charAtTestwithOutBoundException() {
        String text = "abc";
        assertThatThrownBy(() -> {
            text.charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}