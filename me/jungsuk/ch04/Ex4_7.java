package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();   // 화면을 통해 입력받은 숫자를 user에 저장
        int com = (int) (Math.random() * 3) + 1;  // 1,2,3 중 하나가 com에 저장됨

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");

        switch (user - com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case -2: case 1:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
//              break;            // 마지막 문장이므로 break를 사용할 필요가 없다.
        }
    }
}

// 실행결과 1
//가위(1),바위(2),보(3) 중 하나를 입력하세요.>1
//당신은 1입니다.
//컴은 2입니다.
//당신이 졌습니다.

// 실행결과 2
//가위(1),바위(2),보(3) 중 하나를 입력하세요.>3
//당신은 3입니다.
//컴은 3입니다.
//비겼습니다.
