package com.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("1 + 2 = 3") //설명
    public void testPlus() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs); //expected, actual을 매개변수로 받는다.
    }
}
