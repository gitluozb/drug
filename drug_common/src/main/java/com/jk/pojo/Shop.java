package com.jk.pojo;

public class Shop {

    private Integer id;
    private String shopName;
    private String shopContact;
    private String shopCall;
    private String shopLogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopContact() {
        return shopContact;
    }

    public void setShopContact(String shopContact) {
        this.shopContact = shopContact;
    }

    public String getShopCall() {
        return shopCall;
    }

    public void setShopCall(String shopCall) {
        this.shopCall = shopCall;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", shopContact='" + shopContact + '\'' +
                ", shopCall='" + shopCall + '\'' +
                ", shopLogo='" + shopLogo + '\'' +
                '}';
    }
}
