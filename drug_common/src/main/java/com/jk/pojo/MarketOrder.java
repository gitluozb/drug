package com.jk.pojo;

public class MarketOrder {

    private Integer id ;
    /** 采购商品 */
    private String purchaseProducts ;
    /** 图片 */
    private String image ;
    /** 下单时间 */
    private String orderTime ;
    /** 支付时间 */
    private String patTime ;
    /** 采购商 */
    private String purchaser ;
    /** 采购数量 */
    private String purchaseAmount ;
    /** 推广商品 */
    private String swag ;
    /** 活动商品 */
    private String promotionOfGoods ;
    /** 实收款 */
    private Double fundsReceived ;
    /** 订单状态 */
    private Integer orderStatus ;
    /** 批准文号 */
    private String approvalNumber ;
    /** 商品规格 */
    private String specificationOfGoods ;
    /** 发货数量 */
    private String quantityShipped ;
    /** 单价 */
    private Double unitPrice ;
    /** 合计 */
    private Double total ;
    /** 发货时间 */
    private String deliveryTime ;
    /** 发票类型 */
    private String invoiceType ;
    /** 采购企业 */
    private String purchasingEnterprise ;
    /** 发票状态 */
    private Integer invoiceStatus ;
    /** 发票内容 */
    private String invoiceContents ;
    /** 发票金额 */
    private Double invoiceAmount ;
    /** 订单号 */
    private String orderNumber ;
    /** 退货单号 */
    private String returnNumber ;
    /** 退货时间 */
    private String returnTime ;
    /** 申请人 */
    private String proposer ;
    /** 退货金额 */
    private Double refundAmount ;
    /** 退货状态 */
    private Integer returnStatus ;
    /** 开票人 */
    private String invoiceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseProducts() {
        return purchaseProducts;
    }

    public void setPurchaseProducts(String purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPatTime() {
        return patTime;
    }

    public void setPatTime(String patTime) {
        this.patTime = patTime;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getSwag() {
        return swag;
    }

    public void setSwag(String swag) {
        this.swag = swag;
    }

    public String getPromotionOfGoods() {
        return promotionOfGoods;
    }

    public void setPromotionOfGoods(String promotionOfGoods) {
        this.promotionOfGoods = promotionOfGoods;
    }

    public Double getFundsReceived() {
        return fundsReceived;
    }

    public void setFundsReceived(Double fundsReceived) {
        this.fundsReceived = fundsReceived;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getSpecificationOfGoods() {
        return specificationOfGoods;
    }

    public void setSpecificationOfGoods(String specificationOfGoods) {
        this.specificationOfGoods = specificationOfGoods;
    }

    public String getQuantityShipped() {
        return quantityShipped;
    }

    public void setQuantityShipped(String quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getPurchasingEnterprise() {
        return purchasingEnterprise;
    }

    public void setPurchasingEnterprise(String purchasingEnterprise) {
        this.purchasingEnterprise = purchasingEnterprise;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceContents() {
        return invoiceContents;
    }

    public void setInvoiceContents(String invoiceContents) {
        this.invoiceContents = invoiceContents;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(String returnNumber) {
        this.returnNumber = returnNumber;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    @Override
    public String toString() {
        return "MarketOrder{" +
                "id=" + id +
                ", purchaseProducts='" + purchaseProducts + '\'' +
                ", image='" + image + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", patTime='" + patTime + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", purchaseAmount='" + purchaseAmount + '\'' +
                ", swag='" + swag + '\'' +
                ", promotionOfGoods='" + promotionOfGoods + '\'' +
                ", fundsReceived=" + fundsReceived +
                ", orderStatus=" + orderStatus +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", specificationOfGoods='" + specificationOfGoods + '\'' +
                ", quantityShipped='" + quantityShipped + '\'' +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", invoiceType='" + invoiceType + '\'' +
                ", purchasingEnterprise='" + purchasingEnterprise + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                ", invoiceContents='" + invoiceContents + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                ", orderNumber='" + orderNumber + '\'' +
                ", returnNumber='" + returnNumber + '\'' +
                ", returnTime='" + returnTime + '\'' +
                ", proposer='" + proposer + '\'' +
                ", refundAmount=" + refundAmount +
                ", returnStatus=" + returnStatus +
                ", invoiceName='" + invoiceName + '\'' +
                '}';
    }
}
