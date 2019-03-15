package com.jk.pojo;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -4135628649032061314L;
    /** 主键ID */
    private Integer id ;
    /** 收货人 */
    private String consignee ;
    /** 所在省 */
    private String province ;
    private String provinceName;
    /** 详细地址 */
    private String detailAddress ;
    /** 邮编 */
    private String zipCode ;
    /** 电话 */
    private Integer phone ;
    /** 所在市 */
    private String city ;
    private String cityName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", consignee='" + consignee + '\'' +
                ", province='" + province + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
