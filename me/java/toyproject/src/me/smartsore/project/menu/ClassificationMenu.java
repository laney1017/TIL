package me.smartsore.project.menu;

import me.smartsore.project.customers.ClassificationCustomers;

import java.util.Scanner;

//고객분류 메뉴
public class ClassificationMenu extends Menu{
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void showClassificationMenu(ClassificationCustomers classificationCustomers) {
        while (true) {
            System.out.println("=========고객 분류=========");
            System.out.println("1. 그룹별 분류");
            System.out.println("2. 그룹별 분류 : 이름순");
            System.out.println("3. 그룹별 분류 : 이용시간순");
            System.out.println("4. 그룹별 분류 : 결제금액순");
            System.out.println("5. 뒤로가기");
            System.out.println("=========================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
            if (input == 1) {
                classificationCustomers.show();
            } else if (input == 2 || input ==3 || input ==4) {
                classificationCustomers.sort();
            } else if ( input == 5) {
                System.out.println("뒤로가기");
                return;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }
}
