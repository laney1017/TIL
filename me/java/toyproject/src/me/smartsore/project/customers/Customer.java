package me.smartsore.project.customers;


import java.util.Objects;

public class Customer {
    private String serialNo;
    private String name;
    private String userID;
    private int spentTime;
    private int totalPay;
    private static int AUTO_GENERATOR = 0;

    public Customer() {
        ++AUTO_GENERATOR;
        this.serialNo = String.format("%04d", AUTO_GENERATOR);  // 10진수4자리형식
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serialNo = " + serialNo +
                ", name = " + name +
                ", userID = " + userID +
                ", spentTime = " + spentTime +
                ", totalPay = " + totalPay + '}';
    }
}