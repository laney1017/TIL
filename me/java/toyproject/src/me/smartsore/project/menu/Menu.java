package me.smartsore.project.menu;

import java.util.Scanner;

public class Menu {   // 실행 시 제일 처음 메인 메뉴화면
    public static Scanner scanner = new Scanner(System.in);

    public static Menu menu;

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public static Menu printMenu() {
        ParameterMenu parameterMenu = new ParameterMenu();
        CustomerMenu customerMenu = new CustomerMenu();
        ClassificationMenu classificationMenu = new ClassificationMenu();

        while (true) {
            System.out.println("=======메뉴=======");
            System.out.println(" 1. 분류 기준 ");
            System.out.println(" 2. 고객 정보");
            System.out.println(" 3. 고객 분류");
            System.out.println(" 4. 종료");
            System.out.println("=================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());

            if (input == 1) {
                return new ParameterMenu();
            } else if (input == 2) {
                return new CustomerMenu();
            } else if ( input == 3) {
                return new ClassificationMenu();
            } else if ( input == 4) {
                System.out.println("프로그램 종료");
            }
        }
    }
}
