package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        int input;

        System.out.print("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        if (input != 0) {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
//          괄호를 생략했기 때문에 위의 조건식에 속하는 문장은 윗문장 한문장이다.
//          아래문장은 위의 조건식에 속하지 않기 떄문에 항상 출력된다.
            System.out.printf("입력하신 숫자는 %d입니다.", input);
        }
    }
}
// 실행결과 1
//숫자를 하나 입력하세요.>3
//입력하신 숫자는 0이 아닙니다.
//입력하신 숫자는 3입니다.

//실행결과 2
//숫자를 하나 입력하세요.>0
//입력하신 숫자는 0입니다.
//입력하신 숫자는 0입니다.