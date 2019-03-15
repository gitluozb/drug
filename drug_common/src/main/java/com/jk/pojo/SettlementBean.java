package com.jk.pojo;

public class SettlementBean {

    private Integer id;     //主键

    private  Integer settlementOrderId;  //订单商品号

    private  String  settlementMediName;    //商品名称

    private  String  settlementMediSpecifications; //规格

    private  Integer settlementEnterpriseId;    //采购企业ID

    private  String settlementEnterpriseName; //采购企业名称 展示使用

    private  Double settlementMediPrice;    //单价

    private  Double settlementFactPayment;  //实结货款

    private  Double settlementPromotion;    //促销

    private  Double settlementPromoteCommission;    //推广佣金

    private  Double settlementAmountReceivable; //应收金额

    private  Integer settlementPayStatus;   //结算状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSettlementOrderId() {
        return settlementOrderId;
    }

    public void setSettlementOrderId(Integer settlementOrderId) {
        this.settlementOrderId = settlementOrderId;
    }

    public String getSettlementMediName() {
        return settlementMediName;
    }

    public void setSettlementMediName(String settlementMediName) {
        this.settlementMediName = settlementMediName;
    }

    public String getSettlementMediSpecifications() {
        return settlementMediSpecifications;
    }

    public void setSettlementMediSpecifications(String settlementMediSpecifications) {
        this.settlementMediSpecifications = settlementMediSpecifications;
    }

    public Integer getSettlementEnterpriseId() {
        return settlementEnterpriseId;
    }

    public void setSettlementEnterpriseId(Integer settlementEnterpriseId) {
        this.settlementEnterpriseId = settlementEnterpriseId;
    }

    public String getSettlementEnterpriseName() {
        return settlementEnterpriseName;
    }

    public void setSettlementEnterpriseName(String settlementEnterpriseName) {
        this.settlementEnterpriseName = settlementEnterpriseName;
    }

    public Double getSettlementMediPrice() {
        return settlementMediPrice;
    }

    public void setSettlementMediPrice(Double settlementMediPrice) {
        this.settlementMediPrice = settlementMediPrice;
    }

    public Double getSettlementFactPayment() {
        return settlementFactPayment;
    }

    public void setSettlementFactPayment(Double settlementFactPayment) {
        this.settlementFactPayment = settlementFactPayment;
    }

    public Double getSettlementPromotion() {
        return settlementPromotion;
    }

    public void setSettlementPromotion(Double settlementPromotion) {
        this.settlementPromotion = settlementPromotion;
    }

    public Double getSettlementPromoteCommission() {
        return settlementPromoteCommission;
    }

    public void setSettlementPromoteCommission(Double settlementPromoteCommission) {
        this.settlementPromoteCommission = settlementPromoteCommission;
    }

    public Double getSettlementAmountReceivable() {
        return settlementAmountReceivable;
    }

    public void setSettlementAmountReceivable(Double settlementAmountReceivable) {
        this.settlementAmountReceivable = settlementAmountReceivable;
    }

    public Integer getSettlementPayStatus() {
        return settlementPayStatus;
    }

    public void setSettlementPayStatus(Integer settlementPayStatus) {
        this.settlementPayStatus = settlementPayStatus;
    }
}


