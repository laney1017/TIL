package me.smartsore.project.menu;

import me.smartsore.project.customers.Customers;
import me.smartsore.project.groups.Group;
import me.smartsore.project.groups.Groups;

import java.lang.reflect.Parameter;
import java.util.Scanner;

//분류기준 메뉴
public class ParameterMenu extends Menu{
    private static ParameterMenu parameterMenu;
    private final Groups allgroups = Groups.getInstance();
    private final Customers allCustomers = Customers.getInstance();

    @Override
    public void showParameterMenu() {
        while (true) {
            System.out.println("========분류 기준========");
            System.out.println("1. 분류 기준 설정");
            System.out.println("2. 분류 기준 확인");
            System.out.println("3. 분류 기준 수정");
            System.out.println("4. 뒤로가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
        }
    }

    @Override
    public void chooseParameterMenu(int input, Groups groups, Customers customers, Scanner scanner) {
        while (true) {
            if (input == 1) {
                setParameter();
            } else if (input == 2) {
                viewParameter();
            } else if ( input == 3) {
                updateParameter();
            } else if ( input == 4) {
                System.out.println("뒤로가기");
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }

    public void setParameter() {
        while (true) {
            int input = setParameterMenu();
            if (input == 1) {
                setParameterMinimumSpentTime(param);
            } else if (input == 2) {
                setParameterMinimumTotalPay(param);
            } else if ( input == 3) {
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
            allGroups.add(new Group(groupType, param));
            allCustomers.refresh(allGroups);
        }
    }

    public int setParameterMenu() {
        while (true) {
            System.out.println("=======================");
            System.out.println("1. 기준이 될 이용시간");
            System.out.println("2. 기준이 될 사용금액");
            System.out.println("3. 뒤로가기");
            System.out.println("=======================");
            System.out.print(" 메뉴선택 : ");

            int input = Integer.parseInt(scanner.next());
        }
    }

    public void setParameterMinimumSpentTime(Parameter param) {
        System.out.println("이용시간을 입력해주세요.");
        int input = Integer.parseInt(scanner.next());
    }

    public void setParameterMinimumTotalPay(Parameter param) {
        System.out.println("사용금액을 입력해주세요.");
        int input = Integer.parseInt(scanner.next());
    }

    public void viewParameter() {
        while (true) {
            String strGroup = chooseGroup().toUpperCase();
            Group grp = allGroups.find(groupType);
            System.out.println(grp);
        }
    }

    public void updateParameter() {
        while (true) {
            int input = setParameterMenu();
            if (input == 1) {
                setParameterMinimumSpentTime(param);
            } else if (input == 2) {
                setParameterMinimumTotalPay(param);
            } else if ( input == 3) {
                break;
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
            allGroups.add(new Group(groupType, param));
            allCustomers.refresh(allGroups);
        }
    }

}
