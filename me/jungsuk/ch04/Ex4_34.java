package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_34 {
    public static void main(String[] args) {
        int menu =0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println(" (1) square");
            System.out.println(" (2) square root");
            System.out.println(" (3) log");
            System.out.print("원하는 메쥬(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();      // 화면에 입력받은 내용을 tmp에 저장
            menu = Integer.parseInt(tmp);         // 입력받은 문자열(tmp)을 숫자로 변환

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            for (;;) {
                System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>");
                tmp = scanner.nextLine();       // 화면에서 입력받은 내용을 tmp에 저장
                num = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

                if (num == 0)
                    break;            // 계산 종료. for문을 벗어난다.
                if (num == 99)
                    break outer;      // 전체 종료. for문과 while문을 모두 벗어난다.

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }
        }
    }
}
// 메뉴를 선택하면 해당 연산을 반복적으로 수행할 수 있는 방법
/* 무한 반복문인 while문 안에 또 다른 무한 반복문 for문이 중첩된 구조
   while문 -> 메뉴를 반복해서 선택
   for문 -> 선택된 메뉴의 작업을 반복
 */
// 실행결과
// (1) square
// (2) square root
// (3) log
//원하는 메쥬(1~3)를 선택하세요. (종료:0)>1
//계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>2
//result=4
//계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>3
//result=9
//계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>0
// (1) square
// (2) square root
// (3) log
//원하는 메쥬(1~3)를 선택하세요. (종료:0)>2
//계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>4
//result=2.0
//계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)>99