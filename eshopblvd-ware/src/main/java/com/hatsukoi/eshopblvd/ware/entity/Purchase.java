package com.hatsukoi.eshopblvd.ware.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table wms_purchase
 */
public class Purchase implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.assignee_id
     *
     * @mbg.generated
     */
    private Long assigneeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.assignee_name
     *
     * @mbg.generated
     */
    private String assigneeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.ware_id
     *
     * @mbg.generated
     */
    private Long wareId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_purchase.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wms_purchase
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.id
     *
     * @return the value of wms_purchase.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.id
     *
     * @param id the value for wms_purchase.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.assignee_id
     *
     * @return the value of wms_purchase.assignee_id
     *
     * @mbg.generated
     */
    public Long getAssigneeId() {
        return assigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.assignee_id
     *
     * @param assigneeId the value for wms_purchase.assignee_id
     *
     * @mbg.generated
     */
    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.assignee_name
     *
     * @return the value of wms_purchase.assignee_name
     *
     * @mbg.generated
     */
    public String getAssigneeName() {
        return assigneeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.assignee_name
     *
     * @param assigneeName the value for wms_purchase.assignee_name
     *
     * @mbg.generated
     */
    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.phone
     *
     * @return the value of wms_purchase.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.phone
     *
     * @param phone the value for wms_purchase.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.priority
     *
     * @return the value of wms_purchase.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.priority
     *
     * @param priority the value for wms_purchase.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.status
     *
     * @return the value of wms_purchase.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.status
     *
     * @param status the value for wms_purchase.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.ware_id
     *
     * @return the value of wms_purchase.ware_id
     *
     * @mbg.generated
     */
    public Long getWareId() {
        return wareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.ware_id
     *
     * @param wareId the value for wms_purchase.ware_id
     *
     * @mbg.generated
     */
    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.amount
     *
     * @return the value of wms_purchase.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.amount
     *
     * @param amount the value for wms_purchase.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.create_time
     *
     * @return the value of wms_purchase.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.create_time
     *
     * @param createTime the value for wms_purchase.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_purchase.update_time
     *
     * @return the value of wms_purchase.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_purchase.update_time
     *
     * @param updateTime the value for wms_purchase.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase
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
        sb.append(", assigneeId=").append(assigneeId);
        sb.append(", assigneeName=").append(assigneeName);
        sb.append(", phone=").append(phone);
        sb.append(", priority=").append(priority);
        sb.append(", status=").append(status);
        sb.append(", wareId=").append(wareId);
        sb.append(", amount=").append(amount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}