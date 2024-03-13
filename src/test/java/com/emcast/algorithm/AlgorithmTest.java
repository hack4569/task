package com.emcast.algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class AlgorithmTest {

    @Test
    void 문자_검사_테스트() {
        //given
        String test1 = "[[]]";
        String test2 = "[[[]";

        //when
        CheckString stringTest = new CheckString();
        boolean result1 = stringTest.checkString(test1);
        boolean result2 = stringTest.checkString(test2);

        //then
        Assertions.assertThat(result1).isEqualTo(true);
        Assertions.assertThat(result2).isEqualTo(false);
    }
}
