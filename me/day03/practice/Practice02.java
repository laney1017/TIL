package me.day03.practice;

import java.util.Scanner;

// 사용자에게 입력받은 영문자가 소문자라면 대문자로 변경하는 프로그램을 작성하시오.  (메서드 없이)
// 만약 입력받은 문자가 영문자가 아니라면 `영문자가 유효하지 않습니다` 를 출력하시오.
public class Practice02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        char ch = scanner.next().charAt(0);

        if ((97 <= ch && ch <= 122) || (65 <= ch && ch <= 90)) {
            if (97 <= ch && ch <= 122) {
                System.out.println(ch-=32);
            }
        } else {
            System.out.println("영문자가 유효하지 않습니다");
        }
    }
}
