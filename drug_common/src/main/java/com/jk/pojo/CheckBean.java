package com.jk.pojo;

import java.util.Date;

public class CheckBean {

    private Integer id;

    private Integer ObjectId;

    private  Integer checkStatus;

    private  Integer checkUserId;

    private  Integer settlementOrderId;  //订单商品号

    private  Double settlementAmountReceivable; //应收金额

    private Date checkDate;

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjectId() {
        return ObjectId;
    }

    public void setObjectId(Integer objectId) {
        ObjectId = objectId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getSettlementOrderId() {
        return settlementOrderId;
    }

    public void setSettlementOrderId(Integer settlementOrderId) {
        this.settlementOrderId = settlementOrderId;
    }

    public Double getSettlementAmountReceivable() {
        return settlementAmountReceivable;
    }

    public void setSettlementAmountReceivable(Double settlementAmountReceivable) {
        this.settlementAmountReceivable = settlementAmountReceivable;
    }
}
