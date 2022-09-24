package me.day03.practice;

import java.util.Scanner;

/* 간단한 계산기
        - 사용자에게 두 `정수` 와 연산자 `문자` 를 입력받아 사칙연산 프로그램을 작성하시오.
        - 연산자 종류: `+, -, *, /, %`
        - 만약 입력받은 문자가 연산자가 아니라면 `연산자가 유효하지 않습니다` 를 출력하시오. */
public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        String sign;

        System.out.println("첫번째 정수를 입력하세요.");
        num1 = scanner.nextInt();
        System.out.println("두번째 정수를 입력하세요.");
        num2 = scanner.nextInt();
        System.out.println("연산자를 입력하세요.");
        sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("연산자가 유효하지 않습니다");
        }

    }
}
