package com.programmers;

public class SimpleCalculator {
    /* 사칙연산 구현
    multiply
    minus
    divide
    reminder
     */
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        try{
            return num1 / num2;
        }catch (Exception e) {
            System.out.println("올바른 피연산자 아니여서 나눗셈을 할 수 없습니다");
            return 0;
        }
    }
    public int reminder(int num1, int num2){
        try{
            return num1 % num2;
        }catch (Exception e) {
            System.out.println("올바른 피연산자 아니여서 나머지를 구할 수 없습니다");
            return 0;
        }
    }
}
