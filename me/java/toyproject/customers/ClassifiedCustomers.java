package customers;

import groups.Group;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

// NONE Customers = {}, GENERAL Customers = {},VIP Customers = {}, VVIP Customers = {}, .... ->묶어서 관리하기 위해 ClassifiedCustomersGroup생성

public class ClassifiedCustomers extends Customers {
    protected Group group;

    public ClassifiedCustomers() {
    }

    public ClassifiedCustomers(Group group) { this.group = group; }

    public Group getGroup() { return group; }

    public void setGroup(Group group) { this.group = group; }

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassifiedCustomers that = (ClassifiedCustomers) o;
        return group.equals(that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        return "ClassifiedCustomers{" +
                "group=" + group +
                ", allGroups=" + allGroups +
                ", count=" + count +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}