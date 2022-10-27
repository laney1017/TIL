package me.smartsore.project.customers;

import java.util.Arrays;

// Customer 모든 정보를 담고 있는 그룹으로 묶여 1개로 관리 -> 싱글톤패턴(객체가 무조건 1개, static)
public class Customers {

    public Customer[] customers;
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
}