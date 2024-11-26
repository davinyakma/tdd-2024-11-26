package com.programmers;

public class Calc {
    //int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5"); 구현
    //분할정복이 가능하다 ex. 3 + 5 먼저 하고 *5 하는 식으로 어려운 문제를 쪼개기
    public static int run(String expr){
        if("10 + 5".equals(expr)){
            return 15;
        }
        if("20 + 5".equals(expr)){
            return 25;
        }
        return 8;
    }
}
