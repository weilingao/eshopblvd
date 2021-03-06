package com.hatsukoi.eshopblvd.coupon.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_coupon
 */
public class Coupon implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.coupon_type
     *
     * @mbg.generated
     */
    private Boolean couponType;

    /**
     * Database Column Remarks:
     *   优惠券图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.coupon_img
     *
     * @mbg.generated
     */
    private String couponImg;

    /**
     * Database Column Remarks:
     *   优惠卷名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.coupon_name
     *
     * @mbg.generated
     */
    private String couponName;

    /**
     * Database Column Remarks:
     *   数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.num
     *
     * @mbg.generated
     */
    private Integer num;

    /**
     * Database Column Remarks:
     *   金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   每人限领张数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.per_limit
     *
     * @mbg.generated
     */
    private Integer perLimit;

    /**
     * Database Column Remarks:
     *   使用门槛
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.min_point
     *
     * @mbg.generated
     */
    private BigDecimal minPoint;

    /**
     * Database Column Remarks:
     *   开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   使用类型[0->全场通用；1->指定分类；2->指定商品]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.use_type
     *
     * @mbg.generated
     */
    private Boolean useType;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * Database Column Remarks:
     *   发行数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.publish_count
     *
     * @mbg.generated
     */
    private Integer publishCount;

    /**
     * Database Column Remarks:
     *   已使用数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.use_count
     *
     * @mbg.generated
     */
    private Integer useCount;

    /**
     * Database Column Remarks:
     *   领取数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.receive_count
     *
     * @mbg.generated
     */
    private Integer receiveCount;

    /**
     * Database Column Remarks:
     *   可以领取的开始日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.enable_start_time
     *
     * @mbg.generated
     */
    private Date enableStartTime;

    /**
     * Database Column Remarks:
     *   可以领取的结束日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.enable_end_time
     *
     * @mbg.generated
     */
    private Date enableEndTime;

    /**
     * Database Column Remarks:
     *   优惠码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * Database Column Remarks:
     *   可以领取的会员等级[0->不限等级，其他-对应等级]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.member_level
     *
     * @mbg.generated
     */
    private Boolean memberLevel;

    /**
     * Database Column Remarks:
     *   发布状态[0-未发布，1-已发布]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon.publish
     *
     * @mbg.generated
     */
    private Boolean publish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_coupon
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.id
     *
     * @return the value of sms_coupon.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.id
     *
     * @param id the value for sms_coupon.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.coupon_type
     *
     * @return the value of sms_coupon.coupon_type
     *
     * @mbg.generated
     */
    public Boolean getCouponType() {
        return couponType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.coupon_type
     *
     * @param couponType the value for sms_coupon.coupon_type
     *
     * @mbg.generated
     */
    public void setCouponType(Boolean couponType) {
        this.couponType = couponType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.coupon_img
     *
     * @return the value of sms_coupon.coupon_img
     *
     * @mbg.generated
     */
    public String getCouponImg() {
        return couponImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.coupon_img
     *
     * @param couponImg the value for sms_coupon.coupon_img
     *
     * @mbg.generated
     */
    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.coupon_name
     *
     * @return the value of sms_coupon.coupon_name
     *
     * @mbg.generated
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.coupon_name
     *
     * @param couponName the value for sms_coupon.coupon_name
     *
     * @mbg.generated
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.num
     *
     * @return the value of sms_coupon.num
     *
     * @mbg.generated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.num
     *
     * @param num the value for sms_coupon.num
     *
     * @mbg.generated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.amount
     *
     * @return the value of sms_coupon.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.amount
     *
     * @param amount the value for sms_coupon.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.per_limit
     *
     * @return the value of sms_coupon.per_limit
     *
     * @mbg.generated
     */
    public Integer getPerLimit() {
        return perLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.per_limit
     *
     * @param perLimit the value for sms_coupon.per_limit
     *
     * @mbg.generated
     */
    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.min_point
     *
     * @return the value of sms_coupon.min_point
     *
     * @mbg.generated
     */
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.min_point
     *
     * @param minPoint the value for sms_coupon.min_point
     *
     * @mbg.generated
     */
    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.start_time
     *
     * @return the value of sms_coupon.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.start_time
     *
     * @param startTime the value for sms_coupon.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.end_time
     *
     * @return the value of sms_coupon.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.end_time
     *
     * @param endTime the value for sms_coupon.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.use_type
     *
     * @return the value of sms_coupon.use_type
     *
     * @mbg.generated
     */
    public Boolean getUseType() {
        return useType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.use_type
     *
     * @param useType the value for sms_coupon.use_type
     *
     * @mbg.generated
     */
    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.note
     *
     * @return the value of sms_coupon.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.note
     *
     * @param note the value for sms_coupon.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.publish_count
     *
     * @return the value of sms_coupon.publish_count
     *
     * @mbg.generated
     */
    public Integer getPublishCount() {
        return publishCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.publish_count
     *
     * @param publishCount the value for sms_coupon.publish_count
     *
     * @mbg.generated
     */
    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.use_count
     *
     * @return the value of sms_coupon.use_count
     *
     * @mbg.generated
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.use_count
     *
     * @param useCount the value for sms_coupon.use_count
     *
     * @mbg.generated
     */
    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.receive_count
     *
     * @return the value of sms_coupon.receive_count
     *
     * @mbg.generated
     */
    public Integer getReceiveCount() {
        return receiveCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.receive_count
     *
     * @param receiveCount the value for sms_coupon.receive_count
     *
     * @mbg.generated
     */
    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.enable_start_time
     *
     * @return the value of sms_coupon.enable_start_time
     *
     * @mbg.generated
     */
    public Date getEnableStartTime() {
        return enableStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.enable_start_time
     *
     * @param enableStartTime the value for sms_coupon.enable_start_time
     *
     * @mbg.generated
     */
    public void setEnableStartTime(Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.enable_end_time
     *
     * @return the value of sms_coupon.enable_end_time
     *
     * @mbg.generated
     */
    public Date getEnableEndTime() {
        return enableEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.enable_end_time
     *
     * @param enableEndTime the value for sms_coupon.enable_end_time
     *
     * @mbg.generated
     */
    public void setEnableEndTime(Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.code
     *
     * @return the value of sms_coupon.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.code
     *
     * @param code the value for sms_coupon.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.member_level
     *
     * @return the value of sms_coupon.member_level
     *
     * @mbg.generated
     */
    public Boolean getMemberLevel() {
        return memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.member_level
     *
     * @param memberLevel the value for sms_coupon.member_level
     *
     * @mbg.generated
     */
    public void setMemberLevel(Boolean memberLevel) {
        this.memberLevel = memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon.publish
     *
     * @return the value of sms_coupon.publish
     *
     * @mbg.generated
     */
    public Boolean getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon.publish
     *
     * @param publish the value for sms_coupon.publish
     *
     * @mbg.generated
     */
    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
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
        sb.append(", couponType=").append(couponType);
        sb.append(", couponImg=").append(couponImg);
        sb.append(", couponName=").append(couponName);
        sb.append(", num=").append(num);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableStartTime=").append(enableStartTime);
        sb.append(", enableEndTime=").append(enableEndTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", publish=").append(publish);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}