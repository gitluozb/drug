package com.jk.pojo;

import java.math.BigDecimal;

public class ShoppingTrolley {
    //购物车id
    private Integer shoppingTrolleyId;
    //药品名称
    private String drugName;
    //药品采购价
    private BigDecimal drugPurchasePrice;
    //药品数量
    private Integer drugNumber;
    //药品图片
    private String drugImg;

    public Integer getShoppingTrolleyId() {
        return shoppingTrolleyId;
    }

    public void setShoppingTrolleyId(Integer shoppingTrolleyId) {
        this.shoppingTrolleyId = shoppingTrolleyId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public BigDecimal getDrugPurchasePrice() {
        return drugPurchasePrice;
    }

    public void setDrugPurchasePrice(BigDecimal drugPurchasePrice) {
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
}
