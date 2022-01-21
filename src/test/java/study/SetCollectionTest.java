package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SetCollectionTest {
    private Set<Integer> numbres;

    @BeforeEach
    void setUp() {
        numbres = new HashSet<>();
        numbres.add(1);
        numbres.add(2);
        numbres.add(3);
        numbres.add(4);
        numbres.add(5);
    }

    @Test
    @DisplayName("Set의 Size를 구한다")
    void size() {
        assertThat(numbres.size()).isEqualTo(5);
    }

}
