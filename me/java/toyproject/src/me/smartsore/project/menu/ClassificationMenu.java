package me.smartsore.project.menu;

import java.util.Scanner;

//고객분류 메뉴
public class ClassificationMenu extends Menu{
    static Scanner scanner = new Scanner(System.in);

    public void showClassificationMenu() {
        while (true) {
            System.out.println("=========고객 분류=========");
            System.out.println("1. 그룹별 분류");
            System.out.println("2. 그룹별 분류 : 이름순");
            System.out.println("3. 그룹별 분류 : 이용시간순");
            System.out.println("4. 그룹별 분류 : 결제금액순");
            System.out.println("5. 이전메뉴로 돌아가기");
            System.out.println("=========================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
            switch (input) {
                case 1 :

                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 5 :
                    System.out.println(" 메인화면으로 돌아갑니다. ");
                    return;
                default:
                    System.out.println(" 잘못된 입력입니다. ");
                    break;
            }
        }
    }
}
