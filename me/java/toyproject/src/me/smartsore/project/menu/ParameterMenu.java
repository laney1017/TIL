package me.smartsore.project.menu;

import me.smartsore.project.groups.Groups;

import java.util.Scanner;

//분류기준 메뉴
public class ParameterMenu extends Menu{
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void showParameterMenu(Groups groups) {
        while (true) {
            System.out.println("========분류 기준========");
            System.out.println("1. 분류 기준 확인");
            System.out.println("2. 분류 기준 수정");
            System.out.println("3. 뒤로가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
            if (input == 1) {
                groups.viewParameter();
            } else if ( input == 2) {
                groups.updateParameter();
            } else if ( input == 3) {
                System.out.println("뒤로가기");
                return;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }
}
