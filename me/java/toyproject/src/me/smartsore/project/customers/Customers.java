package me.smartsore.project.customers;

import me.smartsore.project.menu.Menu;

import java.util.Arrays;
import java.util.*;

// Customer 모든 정보를 담고 있는 그룹으로 묶여 1개로 관리 -> 싱글톤패턴(객체가 무조건 1개, static)
public class Customers {
    public Customer[] customers;
    Scanner scanner = new Scanner(System.in);

    public Customers() {
        this.customers = new Customer[10];
    }

    public Customers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    // CustomerMeu의 고객정보 반영
    public void addCustomerData() {
        int count = 0; // 추가할 인원
        System.out.print("고객정보를 추가할 인원 : ");

        String input = scanner.next();
        Customer[] customers = inputcustomer(count);
    }

    public Customer[] inputcustomer(int count) {
        Customer[] customers = new Customer[count];
        String name = "";
        String userID = "";
        int spentTime = 0;
        int totalPay = 0;

        while (true) {
            System.out.println("name = ");
            name = scanner.next();
            System.out.println("userID = ");
            userID = scanner.next();
            System.out.println("spentTime = ");
            int spentTime = Integer.parseInt(scanner.next());
            System.out.println("totalPay = ");
            int totalPay = Integer.parseInt(scanner.next());
        }
    }

    public void viewCustomerData() {
        System.out.println(customers.toString());
    }

    public void updateCustomerData() {
        System.out.print("수정할 고객의 userID : ");
        String inputID = scanner.next();
        if (customer.getCustomerId().equals(inputID)) {
            while (true) {
                System.out.println("1. name ");
                System.out.println("2. userID ");
                System.out.println("3. spentTime ");
                System.out.println("4. totalPay ");
                System.out.println("5. 뒤로가기 ");
                int input = Integer.parseInt(scanner.next());

                if (input == 1) {
                    System.out.print("update name : ");
                    String newName = scanner.next();
                } else if (input == 2) {
                    System.out.print("update userID : ");
                    String newID = scanner.next();
                } else if (input == 3) {
                    System.out.print("update spentTime : ");
                    int spentTime = Integer.parseInt(scanner.next());
                } else if (input == 4) {
                    System.out.print("update totalPay : ");
                    int totalPay = Integer.parseInt(scanner.next());
                } else if (input == 5) {
                    return;
                } else {
                    System.out.println("유효하지 않은 선택입니다.");
                }

            }
        }
    }

    public void deleteCustomerData() {
        System.out.print("삭제할 고객의 userID : ");
        String inputID = scanner.next();
        Customer[] tmp = new Customer[this.customers.length-1];
        if (customer.getCustomerId().equals(inputID)) {
            while (true) {
                System.out.println("1. 삭제 ");
                System.out.println("2. 뒤로가기 ");
                int input = Integer.parseInt(scanner.next());

                if (input == 1) {
                    System.out.println("삭제완료");
                    this.customers = tmp;
                } else if (input == 5) {
                        return;
                } else {
                    System.out.println("유효하지 않은 선택입니다.");
                }
            }
        }
    }
}
