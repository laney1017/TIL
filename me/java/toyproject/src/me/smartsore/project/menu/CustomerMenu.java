package me.smartsore.project.menu;

import java.util.Scanner;

//고객정보 메뉴
public class CustomerMenu extends Menu{
    static Scanner scanner = new Scanner(System.in);

    public void showCustomerMenu(){
        while (true) {
            System.out.println("========고객 정보========");
            System.out.println("1. 고객 정보 추가");
            System.out.println("2. 고객 정보 확인");
            System.out.println("3. 고객 정보 수정");
            System.out.println("4. 고객 정보 삭제");
            System.out.println("5. 이전메뉴로 돌아가기");
            System.out.println("=======================");
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
