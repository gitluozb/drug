package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SettlementHistoryBean {

    private  Integer  id;       //主键

    private  Integer mediId;    //商品编号

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applyTime;     //结算申请时间

    private  Double payAmount;  //结算金额

    private  Date  applyoverTime;   //结算时间

    private  Integer  applyStatus;  //结算状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMediId() {
        return mediId;
    }

    public void setMediId(Integer mediId) {
        this.mediId = mediId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Date getApplyoverTime() {
        return applyoverTime;
    }

    public void setApplyoverTime(Date applyoverTime) {
        this.applyoverTime = applyoverTime;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }
}
