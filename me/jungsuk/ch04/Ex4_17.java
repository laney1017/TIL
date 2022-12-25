package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);     // 입력받은 문자열 (tmp)을 숫자로 변환

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 사용자로부터 라인의 수를 입력받아 삼각형 모양의 별을 출력하는 방법
/* for(int j=1;j<=1;j++) {System.out.print("*");} System.out.println();
   for(int j=1;j<=2;j++) {System.out.print("*");} System.out.println();
   ...
 */
// 실행결과
//*
//**
//***
//****
//*****
//******
//*******
//********
//*********
//**********