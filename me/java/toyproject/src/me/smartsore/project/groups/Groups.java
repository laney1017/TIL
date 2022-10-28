package me.smartsore.project.groups;

import java.util.Scanner;

public class Groups {
    public Group[] groups;

    public Groups(Group[] groups) {
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void viewParameter() {
        System.out.println(groups.toString());
    }
    public void updateParameter() {
        while (true) {
            System.out.println("1. GENERAL ");
            System.out.println("2. VIP ");
            System.out.println("3. VVIP ");
            System.out.println("4. 뒤로가기 ");
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

}

