package com.jk.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Drug {
    //药品表id
    private Integer drugId;
    //药品名称
    private String drugName;
    //药品采购价
    private BigDecimal drugPurchasePrice;
    //药品规格
    private String drugSpecifications;
    //药品有效期限
    private String drugExpiryDate;
    //药品数量
    private Integer drugNumber;
    //药品生产厂家id
    private Integer drugManufacturerId;
    //药品图片
    private String drugImg;

    //药品厂家名称
    private String drugManufacturersName;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
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

    public String getDrugSpecifications() {
        return drugSpecifications;
    }

    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications;
    }

    public String getDrugExpiryDate() {
        return drugExpiryDate;
    }

    public void setDrugExpiryDate(String drugExpiryDate) {
        this.drugExpiryDate = drugExpiryDate;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }



    public Integer getDrugManufacturerId() {
        return drugManufacturerId;
    }

    public void setDrugManufacturerId(Integer drugManufacturerId) {
        this.drugManufacturerId = drugManufacturerId;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public String getDrugManufacturersName() {
        return drugManufacturersName;
    }

    public void setDrugManufacturersName(String drugManufacturersName) {
        this.drugManufacturersName = drugManufacturersName;
    }
}
