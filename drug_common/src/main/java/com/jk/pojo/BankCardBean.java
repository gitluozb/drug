package com.jk.pojo;

public class BankCardBean {

    private Integer id;

    private String  depositBank;    //开户银行：

    private String  bankCardNumber; //银行卡号：

    private Integer  applyPassword; //支付密码：

    private String  cardholder; //持卡人

    private String  cardType;   //卡类型

    private String  phoneNumeber; //手机号

    private String misage;

    public String getMisage() {
        return misage;
    }

    public void setMisage(String misage) {
        this.misage = misage;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPhoneNumeber() {
        return phoneNumeber;
    }

    public void setPhoneNumeber(String phoneNumeber) {
        this.phoneNumeber = phoneNumeber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public Integer getApplyPassword() {
        return applyPassword;
    }

    public void setApplyPassword(Integer applyPassword) {
        this.applyPassword = applyPassword;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }
}
