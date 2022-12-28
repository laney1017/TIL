package me.jungsuk.ch05;

import java.util.Scanner;

public class Ex5_23 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"},        // words[0][0], words[0][1]
                {"computer","컴퓨터"},   // words[1][0], words[1][1]
                {"integer","정수"}       // words[2][0], words[2][1]
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);  // words[i][0]은 문제

            String tmp = scanner.nextLine();    // 입력받은 답은 tmp에 저장한다.

            if (tmp.equals(words[i][1])) {      //  입력받은 답 tmp와 정답 words[i][1]이 같은지 비교한다.
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);   // words[i][1]은 정답
            }
        }
    }
}
/* 단어맞추기 : 영단어를 보여주고 단어의 뜻을 맞추는 방법
words[i][0]은 문제이고 이것을 화면에 보여준다.
입력받은 답은 tmp에 저장한다.
equals()로 tmp와 정답 words[i][1]이 같은지 비교한다.
 */

// 실행결과
//Q1. chair의 뜻은?dmlwk
//틀렸습니다. 정답은 의자입니다.
//
//Q2. computer의 뜻은?컴퓨터
//정답입니다.
//
//Q3. integer의 뜻은?정수
//정답입니다.