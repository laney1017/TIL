package me.jungsuk.ch04;

import java.util.Scanner;

public class Ex4_32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" (1) square");
            System.out.println(" (2) square root");
            System.out.println(" (3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();      // 화면에서 입력받은 내용을 tmp에 저장
            menu = Integer.parseInt(tmp);         // 입력받은 문자열(tmp)을 숫자로 변환

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
        }
    }
}
// 메뉴를 보여주고 선택하게 하는 방법
/* 메뉴를 잘못 선택한 경우 > continue문으로 다시 메뉴를 보여주고
   종료(0)를 선택한 경우 > break믄으로 반복을 벗어나 프로그램을 종료시킨다.
 */
// 실행결과
//  (1) square
// (2) square root
// (3) log
//원하는 메뉴(1~3)를 선택하세요. (종료:0)>4
//메뉴를 잘못 선택하셨습니다. (종료는 0)
// (1) square
// (2) square root
// (3) log
//원하는 메뉴(1~3)를 선택하세요. (종료:0)>1
//선택하신 메뉴는 1번입니다.
// (1) square
// (2) square root
// (3) log
//원하는 메뉴(1~3)를 선택하세요. (종료:0)>0
//프로그램을 종료합니다.