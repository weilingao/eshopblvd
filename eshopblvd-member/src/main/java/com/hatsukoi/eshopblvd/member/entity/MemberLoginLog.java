package com.hatsukoi.eshopblvd.member.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_login_log
 */
public class MemberLoginLog implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   member_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.member_id
     *
     * @mbg.generated
     */
    private Long memberId;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * Database Column Remarks:
     *   city
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     * Database Column Remarks:
     *   登录类型[1-web，2-app]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_login_log.login_type
     *
     * @mbg.generated
     */
    private Boolean loginType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_login_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.id
     *
     * @return the value of ums_member_login_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.id
     *
     * @param id the value for ums_member_login_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.member_id
     *
     * @return the value of ums_member_login_log.member_id
     *
     * @mbg.generated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.member_id
     *
     * @param memberId the value for ums_member_login_log.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.create_time
     *
     * @return the value of ums_member_login_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.create_time
     *
     * @param createTime the value for ums_member_login_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.ip
     *
     * @return the value of ums_member_login_log.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.ip
     *
     * @param ip the value for ums_member_login_log.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.city
     *
     * @return the value of ums_member_login_log.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.city
     *
     * @param city the value for ums_member_login_log.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_login_log.login_type
     *
     * @return the value of ums_member_login_log.login_type
     *
     * @mbg.generated
     */
    public Boolean getLoginType() {
        return loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_login_log.login_type
     *
     * @param loginType the value for ums_member_login_log.login_type
     *
     * @mbg.generated
     */
    public void setLoginType(Boolean loginType) {
        this.loginType = loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_login_log
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
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", city=").append(city);
        sb.append(", loginType=").append(loginType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}