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

    public Customer(String name, String userID, int spentTime, int totalPay){
        ++AUTO_GENERATOR;
        this.serialNo = String.format("%04d", AUTO_GENERATOR);  // 10진수4자리형식
        this.name = name;
        this.userID = userID;
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
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