package com.hatsukoi.eshopblvd.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_return_apply
 */
public class OrderReturnApply implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   order_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     * Database Column Remarks:
     *   退货商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   订单编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     * Database Column Remarks:
     *   申请时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   会员用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.member_username
     *
     * @mbg.generated
     */
    private String memberUsername;

    /**
     * Database Column Remarks:
     *   退款金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_amount
     *
     * @mbg.generated
     */
    private BigDecimal returnAmount;

    /**
     * Database Column Remarks:
     *   退货人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_name
     *
     * @mbg.generated
     */
    private String returnName;

    /**
     * Database Column Remarks:
     *   退货人电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_phone
     *
     * @mbg.generated
     */
    private String returnPhone;

    /**
     * Database Column Remarks:
     *   申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * Database Column Remarks:
     *   处理时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_time
     *
     * @mbg.generated
     */
    private Date handleTime;

    /**
     * Database Column Remarks:
     *   商品图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_img
     *
     * @mbg.generated
     */
    private String skuImg;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_name
     *
     * @mbg.generated
     */
    private String skuName;

    /**
     * Database Column Remarks:
     *   商品品牌
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_brand
     *
     * @mbg.generated
     */
    private String skuBrand;

    /**
     * Database Column Remarks:
     *   商品销售属性(JSON)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_attrs_vals
     *
     * @mbg.generated
     */
    private String skuAttrsVals;

    /**
     * Database Column Remarks:
     *   退货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_count
     *
     * @mbg.generated
     */
    private Integer skuCount;

    /**
     * Database Column Remarks:
     *   商品单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_price
     *
     * @mbg.generated
     */
    private BigDecimal skuPrice;

    /**
     * Database Column Remarks:
     *   商品实际支付单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.sku_real_price
     *
     * @mbg.generated
     */
    private BigDecimal skuRealPrice;

    /**
     * Database Column Remarks:
     *   原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.reason
     *
     * @mbg.generated
     */
    private String reason;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.description述
     *
     * @mbg.generated
     */
    private String description述;

    /**
     * Database Column Remarks:
     *   凭证图片，以逗号隔开
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.desc_pics
     *
     * @mbg.generated
     */
    private String descPics;

    /**
     * Database Column Remarks:
     *   处理备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_note
     *
     * @mbg.generated
     */
    private String handleNote;

    /**
     * Database Column Remarks:
     *   处理人员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_man
     *
     * @mbg.generated
     */
    private String handleMan;

    /**
     * Database Column Remarks:
     *   收货人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_man
     *
     * @mbg.generated
     */
    private String receiveMan;

    /**
     * Database Column Remarks:
     *   收货时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_time
     *
     * @mbg.generated
     */
    private Date receiveTime;

    /**
     * Database Column Remarks:
     *   收货备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_note
     *
     * @mbg.generated
     */
    private String receiveNote;

    /**
     * Database Column Remarks:
     *   收货电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_phone
     *
     * @mbg.generated
     */
    private String receivePhone;

    /**
     * Database Column Remarks:
     *   公司收货地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.company_address
     *
     * @mbg.generated
     */
    private String companyAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.id
     *
     * @return the value of oms_order_return_apply.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.id
     *
     * @param id the value for oms_order_return_apply.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.order_id
     *
     * @return the value of oms_order_return_apply.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.order_id
     *
     * @param orderId the value for oms_order_return_apply.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_id
     *
     * @return the value of oms_order_return_apply.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_id
     *
     * @param skuId the value for oms_order_return_apply.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.order_sn
     *
     * @return the value of oms_order_return_apply.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.order_sn
     *
     * @param orderSn the value for oms_order_return_apply.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.create_time
     *
     * @return the value of oms_order_return_apply.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.create_time
     *
     * @param createTime the value for oms_order_return_apply.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.member_username
     *
     * @return the value of oms_order_return_apply.member_username
     *
     * @mbg.generated
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.member_username
     *
     * @param memberUsername the value for oms_order_return_apply.member_username
     *
     * @mbg.generated
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_amount
     *
     * @return the value of oms_order_return_apply.return_amount
     *
     * @mbg.generated
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_amount
     *
     * @param returnAmount the value for oms_order_return_apply.return_amount
     *
     * @mbg.generated
     */
    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_name
     *
     * @return the value of oms_order_return_apply.return_name
     *
     * @mbg.generated
     */
    public String getReturnName() {
        return returnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_name
     *
     * @param returnName the value for oms_order_return_apply.return_name
     *
     * @mbg.generated
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_phone
     *
     * @return the value of oms_order_return_apply.return_phone
     *
     * @mbg.generated
     */
    public String getReturnPhone() {
        return returnPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_phone
     *
     * @param returnPhone the value for oms_order_return_apply.return_phone
     *
     * @mbg.generated
     */
    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.status
     *
     * @return the value of oms_order_return_apply.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.status
     *
     * @param status the value for oms_order_return_apply.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_time
     *
     * @return the value of oms_order_return_apply.handle_time
     *
     * @mbg.generated
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_time
     *
     * @param handleTime the value for oms_order_return_apply.handle_time
     *
     * @mbg.generated
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_img
     *
     * @return the value of oms_order_return_apply.sku_img
     *
     * @mbg.generated
     */
    public String getSkuImg() {
        return skuImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_img
     *
     * @param skuImg the value for oms_order_return_apply.sku_img
     *
     * @mbg.generated
     */
    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_name
     *
     * @return the value of oms_order_return_apply.sku_name
     *
     * @mbg.generated
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_name
     *
     * @param skuName the value for oms_order_return_apply.sku_name
     *
     * @mbg.generated
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_brand
     *
     * @return the value of oms_order_return_apply.sku_brand
     *
     * @mbg.generated
     */
    public String getSkuBrand() {
        return skuBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_brand
     *
     * @param skuBrand the value for oms_order_return_apply.sku_brand
     *
     * @mbg.generated
     */
    public void setSkuBrand(String skuBrand) {
        this.skuBrand = skuBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_attrs_vals
     *
     * @return the value of oms_order_return_apply.sku_attrs_vals
     *
     * @mbg.generated
     */
    public String getSkuAttrsVals() {
        return skuAttrsVals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_attrs_vals
     *
     * @param skuAttrsVals the value for oms_order_return_apply.sku_attrs_vals
     *
     * @mbg.generated
     */
    public void setSkuAttrsVals(String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_count
     *
     * @return the value of oms_order_return_apply.sku_count
     *
     * @mbg.generated
     */
    public Integer getSkuCount() {
        return skuCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_count
     *
     * @param skuCount the value for oms_order_return_apply.sku_count
     *
     * @mbg.generated
     */
    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_price
     *
     * @return the value of oms_order_return_apply.sku_price
     *
     * @mbg.generated
     */
    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_price
     *
     * @param skuPrice the value for oms_order_return_apply.sku_price
     *
     * @mbg.generated
     */
    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.sku_real_price
     *
     * @return the value of oms_order_return_apply.sku_real_price
     *
     * @mbg.generated
     */
    public BigDecimal getSkuRealPrice() {
        return skuRealPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.sku_real_price
     *
     * @param skuRealPrice the value for oms_order_return_apply.sku_real_price
     *
     * @mbg.generated
     */
    public void setSkuRealPrice(BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.reason
     *
     * @return the value of oms_order_return_apply.reason
     *
     * @mbg.generated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.reason
     *
     * @param reason the value for oms_order_return_apply.reason
     *
     * @mbg.generated
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.description述
     *
     * @return the value of oms_order_return_apply.description述
     *
     * @mbg.generated
     */
    public String getDescription述() {
        return description述;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.description述
     *
     * @param description述 the value for oms_order_return_apply.description述
     *
     * @mbg.generated
     */
    public void setDescription述(String description述) {
        this.description述 = description述;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.desc_pics
     *
     * @return the value of oms_order_return_apply.desc_pics
     *
     * @mbg.generated
     */
    public String getDescPics() {
        return descPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.desc_pics
     *
     * @param descPics the value for oms_order_return_apply.desc_pics
     *
     * @mbg.generated
     */
    public void setDescPics(String descPics) {
        this.descPics = descPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_note
     *
     * @return the value of oms_order_return_apply.handle_note
     *
     * @mbg.generated
     */
    public String getHandleNote() {
        return handleNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_note
     *
     * @param handleNote the value for oms_order_return_apply.handle_note
     *
     * @mbg.generated
     */
    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_man
     *
     * @return the value of oms_order_return_apply.handle_man
     *
     * @mbg.generated
     */
    public String getHandleMan() {
        return handleMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_man
     *
     * @param handleMan the value for oms_order_return_apply.handle_man
     *
     * @mbg.generated
     */
    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_man
     *
     * @return the value of oms_order_return_apply.receive_man
     *
     * @mbg.generated
     */
    public String getReceiveMan() {
        return receiveMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_man
     *
     * @param receiveMan the value for oms_order_return_apply.receive_man
     *
     * @mbg.generated
     */
    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_time
     *
     * @return the value of oms_order_return_apply.receive_time
     *
     * @mbg.generated
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_time
     *
     * @param receiveTime the value for oms_order_return_apply.receive_time
     *
     * @mbg.generated
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_note
     *
     * @return the value of oms_order_return_apply.receive_note
     *
     * @mbg.generated
     */
    public String getReceiveNote() {
        return receiveNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_note
     *
     * @param receiveNote the value for oms_order_return_apply.receive_note
     *
     * @mbg.generated
     */
    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_phone
     *
     * @return the value of oms_order_return_apply.receive_phone
     *
     * @mbg.generated
     */
    public String getReceivePhone() {
        return receivePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_phone
     *
     * @param receivePhone the value for oms_order_return_apply.receive_phone
     *
     * @mbg.generated
     */
    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.company_address
     *
     * @return the value of oms_order_return_apply.company_address
     *
     * @mbg.generated
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.company_address
     *
     * @param companyAddress the value for oms_order_return_apply.company_address
     *
     * @mbg.generated
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", skuId=").append(skuId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", skuImg=").append(skuImg);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuBrand=").append(skuBrand);
        sb.append(", skuAttrsVals=").append(skuAttrsVals);
        sb.append(", skuCount=").append(skuCount);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuRealPrice=").append(skuRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description述=").append(description述);
        sb.append(", descPics=").append(descPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", receivePhone=").append(receivePhone);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}