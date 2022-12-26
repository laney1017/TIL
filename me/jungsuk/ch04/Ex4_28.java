package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) +1;     // 1~100사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
// Math.random()을 이용해서 1과 100사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출떄가지 반복하는 방법
// input이 변수 answer의 값과 다른 동안 반복하다가 두 값이 같으면 반복을 벗어난다.

// 실행결과
//1과 100사이의 정수를 입력하세요.>50
//더 큰 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>60
//더 큰 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>70
//더 큰 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>80
//더 작은 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>75
//더 작은 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>73
//더 큰 수로 다시 시도해보세요.
//1과 100사이의 정수를 입력하세요.>74
//정답입니다.