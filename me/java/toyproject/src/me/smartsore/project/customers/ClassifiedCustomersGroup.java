package customers;

import groups.GroupType;
import menu.OrderType;
import menu.comparator.*;

import java.util.Arrays;

// ClassifiedCustomers 가 그룹으로 묶여 1개로 관리 -> 싱글톤패턴(객체가 무조건 1개, static)

public class ClassifiedCustomersGroup {
    private static ClassifiedCustomersGroup classifiedCustomersGroup;

    private ClassifiedCustomers[] classifiedCustomers;

    public ClassifiedCustomersGroup() {
        classifiedCustomers = new ClassifiedCustomers[GroupType.values().length];
        for (int i = 0; i < classifiedCustomers.length; i++) {
            classifiedCustomers[i] = new ClassifiedCustomers();
        }
    }

    public static ClassifiedCustomersGroup getInstance() {
        if (classifiedCustomersGroup == null) {
            classifiedCustomersGroup = new ClassifiedCustomersGroup();
        }
        return classifiedCustomersGroup;
    }

    public static ClassifiedCustomersGroup getClassifiedCustomersGroup() {
        return classifiedCustomersGroup;
    }

    public static void setClassifiedCustomersGroup(ClassifiedCustomersGroup classifiedCustomersGroup) {
        ClassifiedCustomersGroup.classifiedCustomersGroup = classifiedCustomersGroup;
    }

    public ClassifiedCustomers[] getClassifiedCustomers() {
        return classifiedCustomers;
    }

    public void setClassifiedCustomers(ClassifiedCustomers[] classifiedCustomers) {
        this.classifiedCustomers = classifiedCustomers;
    }

    public ClassifiedCustomers get(int i) {
        return classifiedCustomers[i];
    }

    public void set(int i, ClassifiedCustomers customers) {
        classifiedCustomers[i] = customers;
    }

    public int length() {
        return GroupType.values().length;
    }

    public void print() {
        for (int i = 0; i < classifiedCustomers.length; i++) {
            System.out.println("==============================");
            System.out.println("Group : " + classifiedCustomers[i].getGroup().getType());
            System.out.println("==============================");

            if (classifiedCustomers[i] == null || classifiedCustomers[i].isEmpty()) {
                System.out.println("Null.");
                continue;
            }
            classifiedCustomers[i].print();
            System.out.println("==============================\n");
        }

    }


    public void sortByName(OrderType orderType) {
        if (orderType != null && !orderType.equals("")) {
            for (int i = 0; i < classifiedCustomersGroup.length(); ++i) {
                Customer[] customers = classifiedCustomersGroup.get(i).getCustomers();
                if (orderType == OrderType.ASCENDING) {
                    Arrays.sort(customers);
                } else {
                    Arrays.sort(customers, new CompByNameDesc());
                }
                classifiedCustomersGroup.get(i).setCustomers(customers);
            }
        }
    }

    public void sortedBySpentTime(OrderType orderType) {
        if (orderType != null && !orderType.equals("")) {
            for (int i = 0; i < classifiedCustomersGroup.length(); ++i) {
                Customer[] customers = classifiedCustomersGroup.get(i).getCustomers();
                if (orderType == OrderType.ASCENDING) {
                    Arrays.sort(customers, new CompByTimeAsc());
                } else {
                    Arrays.sort(customers, new CompByTimeDesc());
                }

                classifiedCustomersGroup.get(i).setCustomers(customers);
            }
        }
    }

    public void sortedByTotalPay(OrderType orderType) {
        if (orderType != null && !orderType.equals("")) {
            for (int i = 0; i < classifiedCustomersGroup.length(); ++i) {
                Customer[] customers = classifiedCustomersGroup.get(i).getCustomers();
                if (orderType == OrderType.ASCENDING) {
                    Arrays.sort(customers, new CompByPayAsc());
                } else {
                    Arrays.sort(customers, new CompByPayDesc());
                }
                classifiedCustomersGroup.get(i).setCustomers(customers);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassifiedCustomersGroup that = (ClassifiedCustomersGroup) o;
        return Arrays.equals(classifiedCustomers, that.classifiedCustomers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(classifiedCustomers);
    }

    @Override
    public String toString() {
        return "ClassifiedCustomersGroup{" +
                "classifiedCustomers=" + Arrays.toString(classifiedCustomers) +
                '}';
    }
}