package com.jk.pojo;

public class OrderForm {
    //订单id
    private Integer orderFormId;
    //药品名称
    private String drugName;
    //药品采购价
    private Double drugPurchasePrice;
    //药品数量
    private Integer drugNumber;
    //订单状态
    private Integer orderFromStatus;
    //药品图片
    private String drugImg;

    //订单号
    private String orderFromNumber;

    public Integer getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(Integer orderFormId) {
        this.orderFormId = orderFormId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Double getDrugPurchasePrice() {
        return drugPurchasePrice;
    }

    public void setDrugPurchasePrice(Double drugPurchasePrice) {
        this.drugPurchasePrice = drugPurchasePrice;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public Integer getOrderFromStatus() {
        return orderFromStatus;
    }

    public void setOrderFromStatus(Integer orderFromStatus) {
        this.orderFromStatus = orderFromStatus;
    }

    public String getOrderFromNumber() {
        return orderFromNumber;
    }

    public void setOrderFromNumber(String orderFromNumber) {
        this.orderFromNumber = orderFromNumber;
    }
}
