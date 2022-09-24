package me.day03.practice;

import sun.print.SunMinMaxPage;

import java.util.Scanner;

/* 사용자한테 국어 / 수학 / 영어 성적을 입력받아 평균이 70점 이상이면 `합격` 이라고 출력하시오.
        - 성적은 `실수값`으로 가정
        - 성적은 0이상 100점 이하가 올 수 있음
        - 만약 세 과목 중 하나라도 성적 유효범위에 해당하지 않으면 `성적이 유효하지 않습니다` 를 출력하시오. */

public class Practice01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double kor, math, eng;

        System.out.println("국어 점수를 입력하세요.");
        kor = scanner.nextDouble();
        System.out.println("수학 점수를 입력하세요.");
        math = scanner.nextDouble();
        System.out.println("영어 점수를 입력하세요.");
        eng = scanner.nextDouble();

        Double sum = kor + math + eng;
        Double avr = sum / 3.0;

        if (0.0 <= kor && kor <= 100.0 && 0.0 <= math && math <= 100.0 && 0.0 <= eng && eng <= 100.0) {
            if (avr >= 70.0) {
                System.out.println("합격입니다");
            } else if (avr < 70.0) {
                System.out.println("불합격입니다");
            }
        } else {
            System.out.println("성적이 유효하지 않습니다");
        }

    }
}
