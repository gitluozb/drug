package com.jk.pojo;

public class Goods{
    /** 主键ID */
    private Integer id ;
    /** 商品名称 */
    private String goodsName ;
    /** 商品货号 */
    private String goodsCode ;
    /** 商品规格 */
    private String goodsSpec ;
    /** 生产厂家 */
    private String manufacturer ;
    /** 批准文号 */
    private String approvalNumber ;
    /** 供应价格 */
    private Double supplyPrice ;
    /** 库存 */
    private Integer stock ;
    /** 商品状态 */
    private Integer goodsStatus ;
    /** 审核状态 */
    private Integer auditStatus ;
    /** 发布时间 */
    private String releaseTime ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Double getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(Double supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsSpec='" + goodsSpec + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", supplyPrice=" + supplyPrice +
                ", stock=" + stock +
                ", goodsStatus=" + goodsStatus +
                ", auditStatus=" + auditStatus +
                ", releaseTime='" + releaseTime + '\'' +
                '}';
    }
}
