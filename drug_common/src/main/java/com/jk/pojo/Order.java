package com.jk.pojo;


import java.util.Date;

public class Order {
    private String orderId;
    private Integer drugId;
    private String drugName;
    private Date quitTime;
    private Integer drugCount;
    private String applayName;
    private Integer drugMoney;
    private Integer drugState;

    private String startTime;

    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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

    public Date getQuitTime() {
        return quitTime;
    }

    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }

    public Integer getDrugCount() {
        return drugCount;
    }

    public void setDrugCount(Integer drugCount) {
        this.drugCount = drugCount;
    }

    public String getApplayName() {
        return applayName;
    }

    public void setApplayName(String applayName) {
        this.applayName = applayName;
    }

    public Integer getDrugMoney() {
        return drugMoney;
    }

    public void setDrugMoney(Integer drugMoney) {
        this.drugMoney = drugMoney;
    }

    public Integer getDrugState() {
        return drugState;
    }

    public void setDrugState(Integer drugState) {
        this.drugState = drugState;
    }
}
