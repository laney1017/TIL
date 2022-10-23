package me.smartsore.project.menu;

import java.util.Scanner;

//분류기준 메뉴
public class ParameterMenu extends Menu{
    static Scanner scanner = new Scanner(System.in);

    public void showParameterMenu() {
        while (true) {
            System.out.println("========분류 기준========");
            System.out.println("1. 분류 기준 설정");
            System.out.println("2. 분류 기준 확인");
            System.out.println("3. 분류 기준 수정");
            System.out.println("4. 이전메뉴로 돌아가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());

        }
    }
}
