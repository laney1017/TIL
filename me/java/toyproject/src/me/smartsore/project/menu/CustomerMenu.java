package me.smartsore.project.menu;

import me.smartsore.project.customers.Customer;
import me.smartsore.project.customers.Customers;
import me.smartsore.project.groups.Group;
import me.smartsore.project.groups.Groups;

import java.lang.reflect.Parameter;
import java.util.Scanner;

//분류기준 메뉴
public class CustomerMenu extends Menu{
    private static CustomerMenu customerMenu;
    private final Groups allgroups = Groups.getInstance();
    private final Customers allCustomers = Customers.getInstance();

    @Override
    public void showCustomerMenu() {
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
        }
    }

    @Override
    public void chooseCustomerMenu(int input, Groups groups, Customers customers, Scanner scanner) {
        while (true) {
            if (input == 1) {
                setCustomerData();
            } else if (input == 2) {
                viewCustomerData();
            } else if ( input == 3) {
                updateCustomerData();
            } else if ( input == 4) {
                deleteCustomerData();
            } else if ( input == 5) {
                System.out.println("뒤로가기");
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }

    public void setCustomerData() {
        while (true) {
            int input = chooseCustomerMenu();
            if (input == 1) {
                setCustomerName(customer);
            } else if (input == 2) {
                setCustomerUserId(customer);
            } else if ( input == 3) {
                setCustomerSpentTime(customer);
            } else if ( input == 4) {
                setCustomerTotalPay(customer)
            } else if ( input == 5) {
                System.out.println("뒤로가기");
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
            customer.setGroup(allGroups.findGroupFor(customer));
            allCustomers.add(customer);
        }
    }

    public int setCustomerMenu() {
        while (true) {
            System.out.println("=======================");
            System.out.println("1. 고객 이름");
            System.out.println("2. 고객 ID");
            System.out.println("3. 고객 이용 시간");
            System.out.println("4. 고객 사용 금액");
            System.out.println("3. 뒤로가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
        }
    }

    public void setCustomerName(Customer customer) {
        System.out.println("고객 이름을 입력해주세요.");
        String input = Menu.scanner.next();
    }

    public void setCustomerUserId(Customer customer) {
        System.out.println("고객 ID를 입력해주세요.");
        String input = Menu.scanner.next();
    }

    public void setCustomerSpentTime(Customer customer) {
        System.out.println("고객 이용 시간을 입력해주세요.");
        int input = Integer.parseInt(Menu.scanner.next());
    }

    public void setCustomerTotalPay(Customer customer) {
        System.out.println("고객 사용 금액을 입력해주세요.");
        int input = Integer.parseInt(Menu.scanner.next());
    }

    public void viewCustomerData() {
        for (int i = 0; i < customers.length(); ++i) {
            Customer customer = customers(i);
            if (customer != null) {
                System.out.println("No. " + (i + 1) + " => " + customer);
            } else {
                System.out.println("null");
            }
        }
    }

    public void updateCustomerData() {
        while (true) {
            int input = setCustomerMenu();
            if (input == 1) {
                setCustomerName(customer);
            } else if (input == 2) {
                setCustomerUserId(customer);
            } else if ( input == 3) {
                setCustomerSpentTime(customer);
            } else if ( input == 4) {
                setCustomerTotalPay(customer);
            } else if ( input == 5) {
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
            Group grp = allGroups.findGroupFor(customer);
        }
    }

    public void deleteCustomerData() {
        while (true) {
           viewCustomerData();

        }
    }

}
