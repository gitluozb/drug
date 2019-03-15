package com.jk.pojo;

import java.util.Date;

public class Rate {
    private Integer drugId;
    private Integer subRate;
    private Integer sumScore;
    private String rateMsg;
    private Date rateTime;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getSubRate() {
        return subRate;
    }

    public void setSubRate(Integer subRate) {
        this.subRate = subRate;
    }

    public Integer getSumScore() {
        return sumScore;
    }

    public void setSumScore(Integer sumScore) {
        this.sumScore = sumScore;
    }

    public String getRateMsg() {
        return rateMsg;
    }

    public void setRateMsg(String rateMsg) {
        this.rateMsg = rateMsg;
    }

    public Date getRateTime() {
        return rateTime;
    }

    public void setRateTime(Date rateTime) {
        this.rateTime = rateTime;
    }
}
