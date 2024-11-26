package com.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("1 + 2 = 3") //설명
    public void t1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        //assertEquals(3, rs); //같은 것임. 아래 코드가 더 보기편한것 같음.
        assertThat(rs).isEqualTo(3); //rs가 3과 똑같을 것을 단정적으로 말한다.
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("2 + 10 = 12") //설명
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("20 + 10 = 30") //설명
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("10 - 5 = 5") //설명
    public void t4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(10, 5);

        assertThat(rs).isEqualTo(5);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("2 * 5 = 10") //설명
    public void t5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(2, 5);

        assertThat(rs).isEqualTo(10);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("20 / 5 = 4") //설명
    public void t6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(20, 5);

        assertThat(rs).isEqualTo(4);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("15 % 3 = 0") //설명
    public void t7() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.reminder(15, 3);

        assertThat(rs).isEqualTo(0);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("2 / 0 = 0") //설명
    public void t8() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(2, 0); //ArithmeticException 에러 처리 필요함

        assertThat(rs).isEqualTo(0);
    }
    @Test //아래의 테스트가 독립적으로 실행이 가능하다.
    @DisplayName("2 % 0 = 0") //설명
    public void t9() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.reminder(2, 0); //ArithmeticException 에러 처리 필요함

        assertThat(rs).isEqualTo(0);
    }
}
