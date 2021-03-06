package com.hatsukoi.eshopblvd.order.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_setting
 */
public class OrderSetting implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   秒杀订单超时关闭时间(分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.flash_order_overtime
     *
     * @mbg.generated
     */
    private Integer flashOrderOvertime;

    /**
     * Database Column Remarks:
     *   正常订单超时时间(分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.normal_order_overtime
     *
     * @mbg.generated
     */
    private Integer normalOrderOvertime;

    /**
     * Database Column Remarks:
     *   发货后自动确认收货时间（天）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.confirm_overtime
     *
     * @mbg.generated
     */
    private Integer confirmOvertime;

    /**
     * Database Column Remarks:
     *   自动完成交易时间，不能申请退货（天）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.finish_overtime
     *
     * @mbg.generated
     */
    private Integer finishOvertime;

    /**
     * Database Column Remarks:
     *   订单完成后自动好评时间（天）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.comment_overtime
     *
     * @mbg.generated
     */
    private Integer commentOvertime;

    /**
     * Database Column Remarks:
     *   会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_setting.member_level
     *
     * @mbg.generated
     */
    private Byte memberLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.id
     *
     * @return the value of oms_order_setting.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.id
     *
     * @param id the value for oms_order_setting.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.flash_order_overtime
     *
     * @return the value of oms_order_setting.flash_order_overtime
     *
     * @mbg.generated
     */
    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.flash_order_overtime
     *
     * @param flashOrderOvertime the value for oms_order_setting.flash_order_overtime
     *
     * @mbg.generated
     */
    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.normal_order_overtime
     *
     * @return the value of oms_order_setting.normal_order_overtime
     *
     * @mbg.generated
     */
    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.normal_order_overtime
     *
     * @param normalOrderOvertime the value for oms_order_setting.normal_order_overtime
     *
     * @mbg.generated
     */
    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.confirm_overtime
     *
     * @return the value of oms_order_setting.confirm_overtime
     *
     * @mbg.generated
     */
    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.confirm_overtime
     *
     * @param confirmOvertime the value for oms_order_setting.confirm_overtime
     *
     * @mbg.generated
     */
    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.finish_overtime
     *
     * @return the value of oms_order_setting.finish_overtime
     *
     * @mbg.generated
     */
    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.finish_overtime
     *
     * @param finishOvertime the value for oms_order_setting.finish_overtime
     *
     * @mbg.generated
     */
    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.comment_overtime
     *
     * @return the value of oms_order_setting.comment_overtime
     *
     * @mbg.generated
     */
    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.comment_overtime
     *
     * @param commentOvertime the value for oms_order_setting.comment_overtime
     *
     * @mbg.generated
     */
    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_setting.member_level
     *
     * @return the value of oms_order_setting.member_level
     *
     * @mbg.generated
     */
    public Byte getMemberLevel() {
        return memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_setting.member_level
     *
     * @param memberLevel the value for oms_order_setting.member_level
     *
     * @mbg.generated
     */
    public void setMemberLevel(Byte memberLevel) {
        this.memberLevel = memberLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
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
        sb.append(", flashOrderOvertime=").append(flashOrderOvertime);
        sb.append(", normalOrderOvertime=").append(normalOrderOvertime);
        sb.append(", confirmOvertime=").append(confirmOvertime);
        sb.append(", finishOvertime=").append(finishOvertime);
        sb.append(", commentOvertime=").append(commentOvertime);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}