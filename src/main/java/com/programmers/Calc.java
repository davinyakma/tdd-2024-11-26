package com.programmers;

public class Calc {
    //int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5"); 구현
    //분할정복이 가능하다 ex. 3 + 5 먼저 하고 *5 하는 식으로 어려운 문제를 쪼개기
    public static int run(String expr){
        String[] exprBits = expr.split(" \\+ ");
        // \\뒤에 문자 붙으면 그 자체를 기호로 인식한다. 문자열 안에서 문자말고 기호로 인식하기 위함.
        // '+'기호를 기준으로 나누는 것이기 때문에 왼쪽 오른쪽 두 그룹이 나옴.

        int num1 = Integer.parseInt(exprBits[0]);
        int num2 = Integer.parseInt(exprBits[1]);

        return num1 + num2;
    }
}
