package com.jk.pojo;

public class Customer {

    private Integer id;
    private String customerName;
    private String customerQq;
    private String customerStatus;
    private String customerOrder;
    private String customerTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerQq() {
        return customerQq;
    }

    public void setCustomerQq(String customerQq) {
        this.customerQq = customerQq;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(String customerOrder) {
        this.customerOrder = customerOrder;
    }

    public String getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(String customerTime) {
        this.customerTime = customerTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerQq='" + customerQq + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                ", customerOrder='" + customerOrder + '\'' +
                ", customerTime='" + customerTime + '\'' +
                '}';
    }
}
