package me.smartsore.project.menu;

import me.smartsore.project.customers.Customer;
import me.smartsore.project.customers.Customers;
import me.smartsore.project.groups.Group;
import me.smartsore.project.groups.Groups;

import java.lang.reflect.Parameter;
import java.util.Scanner;

//분류기준 메뉴
public class CustomerMenu extends Menu{
    @Override
    public void showCustomerMenu(Customers customers) {
        while (true) {
            System.out.println("========고객정보========");
            System.out.println("1. 고객 정보 추가");
            System.out.println("2. 고객 정보 확인");
            System.out.println("3. 고객 정보 수정");
            System.out.println("4. 고객 정보 삭제");
            System.out.println("5. 뒤로가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());

            if (input == 1) {
                customers.addCustomerData();
            } else if (input == 2) {
                customers.viewCustomerData();
            } else if (input == 3) {
                customers.updateCustomerData();
            } else if (input == 4) {
                customers.deleteCustomerData();
            } else if (input == 5) {
                System.out.println("뒤로가기");
                return;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }
}
