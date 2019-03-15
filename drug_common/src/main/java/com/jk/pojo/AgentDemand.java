package com.jk.pojo;


public class AgentDemand {

    /** 主键Id */
    private Integer agentId ;
    /** 产品名称 */
    private String agentDrugName ;
    /**
     * 产品类型 按监管分类 类别id：
     */
    private Integer agentDrugTypeBySupervise;
    /**
     * 产品类型 按成分分类 类别id：
     */
    private Integer agentDrugTypeByElement;
    /**
     * 产品类型 按剂型分类 类别id：
     */
    private Integer agentDrugTypeByDosageForm;
    /**
     * 产品类型 按监管分类 类别名称：
     */
    private String agentDrugTypeNameBySupervise;
    /**
     * 产品类型 按成分分类 类别名称：
     */
    private String agentDrugTypeNameByElement;
    /**
     * 产品类型 按剂型分类 类别名称：
     */
    private String agentDrugTypeNameByDosageForm;

    /** 产品通用名称 */
    private String agentDrugGenericName ;
    /** 生产厂家 */
    private String agentDrugManufacturer ;
    /** 产品品牌 */
    private String agentDrugBrand ;
    /**
     * 代理区域 省级id
     */
    private Integer agentDemandAreaProvince;
    /**
     * 代理区域 市级id
     */
    private Integer agentDemandAreaCity ;
    /**
     * 代理区域 区县级id
     */
    private Integer agentDemandAreaCounty;
    /**
     * 代理区域 区县级名称
     */
    private String agentDemandAreaCountyName;
    /**
     * 代理区域 市级名称
     */
    private String agentDemandAreaCityName;
    /**
     * 代理区域 省级名称
     */
    private String agentDemandAreaProvinceName;
    /** 销售渠道 */
    private String agentDistributionChannel ;
    /** 信息有效期 */
    private Integer agentMessageExpiring ;
    /** 产品图片 */
    private String agentDrugImg ;
    /** 审核人 */
    private Integer checkUserId ;
    /** 审核状态 */
    private Integer checkStatus ;
    /** 需求简要描述 */
    private String agentDemandDescription ;
    /** 联系人 */
    private String agentContactPerson ;
    /** 联系电话 */
    private String agentContactPhone ;
    /** 联系地址 */
    private String agentContactAddress ;

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentDrugName() {
        return agentDrugName;
    }

    public void setAgentDrugName(String agentDrugName) {
        this.agentDrugName = agentDrugName;
    }

    public String getAgentDrugGenericName() {
        return agentDrugGenericName;
    }

    public void setAgentDrugGenericName(String agentDrugGenericName) {
        this.agentDrugGenericName = agentDrugGenericName;
    }

    public String getAgentDrugManufacturer() {
        return agentDrugManufacturer;
    }

    public void setAgentDrugManufacturer(String agentDrugManufacturer) {
        this.agentDrugManufacturer = agentDrugManufacturer;
    }

    public String getAgentDrugBrand() {
        return agentDrugBrand;
    }

    public void setAgentDrugBrand(String agentDrugBrand) {
        this.agentDrugBrand = agentDrugBrand;
    }

    public String getAgentDistributionChannel() {
        return agentDistributionChannel;
    }

    public void setAgentDistributionChannel(String agentDistributionChannel) {
        this.agentDistributionChannel = agentDistributionChannel;
    }

    public Integer getAgentMessageExpiring() {
        return agentMessageExpiring;
    }

    public void setAgentMessageExpiring(Integer agentMessageExpiring) {
        this.agentMessageExpiring = agentMessageExpiring;
    }

    public String getAgentDrugImg() {
        return agentDrugImg;
    }

    public void setAgentDrugImg(String agentDrugImg) {
        this.agentDrugImg = agentDrugImg;
    }

    public String getAgentDemandDescription() {
        return agentDemandDescription;
    }

    public void setAgentDemandDescription(String agentDemandDescription) {
        this.agentDemandDescription = agentDemandDescription;
    }

    public String getAgentContactPerson() {
        return agentContactPerson;
    }

    public void setAgentContactPerson(String agentContactPerson) {
        this.agentContactPerson = agentContactPerson;
    }

    public String getAgentContactPhone() {
        return agentContactPhone;
    }

    public void setAgentContactPhone(String agentContactPhone) {
        this.agentContactPhone = agentContactPhone;
    }

    public String getAgentContactAddress() {
        return agentContactAddress;
    }

    public void setAgentContactAddress(String agentContactAddress) {
        this.agentContactAddress = agentContactAddress;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public Integer getAgentDrugTypeBySupervise() {
        return agentDrugTypeBySupervise;
    }

    public void setAgentDrugTypeBySupervise(Integer agentDrugTypeBySupervise) {
        this.agentDrugTypeBySupervise = agentDrugTypeBySupervise;
    }

    public Integer getAgentDrugTypeByElement() {
        return agentDrugTypeByElement;
    }

    public void setAgentDrugTypeByElement(Integer agentDrugTypeByElement) {
        this.agentDrugTypeByElement = agentDrugTypeByElement;
    }

    public Integer getAgentDrugTypeByDosageForm() {
        return agentDrugTypeByDosageForm;
    }

    public void setAgentDrugTypeByDosageForm(Integer agentDrugTypeByDosageForm) {
        this.agentDrugTypeByDosageForm = agentDrugTypeByDosageForm;
    }

    public String getAgentDrugTypeNameBySupervise() {
        return agentDrugTypeNameBySupervise;
    }

    public void setAgentDrugTypeNameBySupervise(String agentDrugTypeNameBySupervise) {
        this.agentDrugTypeNameBySupervise = agentDrugTypeNameBySupervise;
    }

    public String getAgentDrugTypeNameByElement() {
        return agentDrugTypeNameByElement;
    }

    public void setAgentDrugTypeNameByElement(String agentDrugTypeNameByElement) {
        this.agentDrugTypeNameByElement = agentDrugTypeNameByElement;
    }

    public String getAgentDrugTypeNameByDosageForm() {
        return agentDrugTypeNameByDosageForm;
    }

    public void setAgentDrugTypeNameByDosageForm(String agentDrugTypeNameByDosageForm) {
        this.agentDrugTypeNameByDosageForm = agentDrugTypeNameByDosageForm;
    }

    public Integer getAgentDemandAreaProvince() {
        return agentDemandAreaProvince;
    }

    public void setAgentDemandAreaProvince(Integer agentDemandAreaProvince) {
        this.agentDemandAreaProvince = agentDemandAreaProvince;
    }

    public Integer getAgentDemandAreaCity() {
        return agentDemandAreaCity;
    }

    public void setAgentDemandAreaCity(Integer agentDemandAreaCity) {
        this.agentDemandAreaCity = agentDemandAreaCity;
    }

    public Integer getAgentDemandAreaCounty() {
        return agentDemandAreaCounty;
    }

    public void setAgentDemandAreaCounty(Integer agentDemandAreaCounty) {
        this.agentDemandAreaCounty = agentDemandAreaCounty;
    }

    public String getAgentDemandAreaCountyName() {
        return agentDemandAreaCountyName;
    }

    public void setAgentDemandAreaCountyName(String agentDemandAreaCountyName) {
        this.agentDemandAreaCountyName = agentDemandAreaCountyName;
    }

    public String getAgentDemandAreaCityName() {
        return agentDemandAreaCityName;
    }

    public void setAgentDemandAreaCityName(String agentDemandAreaCityName) {
        this.agentDemandAreaCityName = agentDemandAreaCityName;
    }

    public String getAgentDemandAreaProvinceName() {
        return agentDemandAreaProvinceName;
    }

    public void setAgentDemandAreaProvinceName(String agentDemandAreaProvinceName) {
        this.agentDemandAreaProvinceName = agentDemandAreaProvinceName;
    }
}
