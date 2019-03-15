package com.jk.pojo;

public class Investment {

    /** 主键ID */
    private Integer id ;
    /** 所属分类 */
    private Integer category ;
    private String categoryName;
    private Integer categoryCenter;
    private String categoryCenterName;
    private Integer categoryMin;
    private String categoryMinName;
    /** 招商标题 */
    private String title ;
    /** 过期时间 */
    private String overdueTime ;
    /** 招商省区 */
    private Integer province ;
    private String provinceName;
    /** 投资额度 */
    private Double investmentQuota ;
    /** 需交保证金 */
    private Double bond ;
    /** 商品名称 */
    private String goodsName ;
    /** 规格 */
    private String goodsSpec ;
    /** 国药准字 */
    private String characters ;
    /** 生产厂家 */
    private String manufacturer ;
    /** 商品编号 */
    private Integer goodsId ;
    /** 招商市区 */
    private Integer city ;
    private String cityName;
    /** 件装数 */
    private Integer packageNumber ;
    /** 商标 */
    private String trademark ;
    /** 医保类型 */
    private Integer type ;
    /** 招商图片 */
    private String investmentImg ;
    /** 招商详细说明 */
    private String detail ;
    /** 基药目录 */
    private Integer catalog ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryCenter() {
        return categoryCenter;
    }

    public void setCategoryCenter(Integer categoryCenter) {
        this.categoryCenter = categoryCenter;
    }

    public String getCategoryCenterName() {
        return categoryCenterName;
    }

    public void setCategoryCenterName(String categoryCenterName) {
        this.categoryCenterName = categoryCenterName;
    }

    public Integer getCategoryMin() {
        return categoryMin;
    }

    public void setCategoryMin(Integer categoryMin) {
        this.categoryMin = categoryMin;
    }

    public String getCategoryMinName() {
        return categoryMinName;
    }

    public void setCategoryMinName(String categoryMinName) {
        this.categoryMinName = categoryMinName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Double getInvestmentQuota() {
        return investmentQuota;
    }

    public void setInvestmentQuota(Double investmentQuota) {
        this.investmentQuota = investmentQuota;
    }

    public Double getBond() {
        return bond;
    }

    public void setBond(Double bond) {
        this.bond = bond;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getInvestmentImg() {
        return investmentImg;
    }

    public void setInvestmentImg(String investmentImg) {
        this.investmentImg = investmentImg;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", category=" + category +
                ", categoryName='" + categoryName + '\'' +
                ", categoryCenter=" + categoryCenter +
                ", categoryCenterName='" + categoryCenterName + '\'' +
                ", categoryMin=" + categoryMin +
                ", categoryMinName='" + categoryMinName + '\'' +
                ", title='" + title + '\'' +
                ", overdueTime='" + overdueTime + '\'' +
                ", province=" + province +
                ", provinceName='" + provinceName + '\'' +
                ", investmentQuota=" + investmentQuota +
                ", bond=" + bond +
                ", goodsName='" + goodsName + '\'' +
                ", goodsSpec='" + goodsSpec + '\'' +
                ", characters='" + characters + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", goodsId=" + goodsId +
                ", city=" + city +
                ", cityName='" + cityName + '\'' +
                ", packageNumber=" + packageNumber +
                ", trademark='" + trademark + '\'' +
                ", type=" + type +
                ", investmentImg='" + investmentImg + '\'' +
                ", detail='" + detail + '\'' +
                ", catalog=" + catalog +
                '}';
    }
}
