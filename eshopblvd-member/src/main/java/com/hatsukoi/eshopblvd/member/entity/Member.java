package com.hatsukoi.eshopblvd.member.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member
 */
public class Member implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   会员等级id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.level_id
     *
     * @mbg.generated
     */
    private Long levelId;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   手机号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   头像
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.header
     *
     * @mbg.generated
     */
    private String header;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.gender
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     * Database Column Remarks:
     *   生日
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.birth
     *
     * @mbg.generated
     */
    private Date birth;

    /**
     * Database Column Remarks:
     *   所在城市
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     * Database Column Remarks:
     *   职业
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     * Database Column Remarks:
     *   个性签名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.sign
     *
     * @mbg.generated
     */
    private String sign;

    /**
     * Database Column Remarks:
     *   用户来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.source_type
     *
     * @mbg.generated
     */
    private Byte sourceType;

    /**
     * Database Column Remarks:
     *   积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.integration
     *
     * @mbg.generated
     */
    private Integer integration;

    /**
     * Database Column Remarks:
     *   成长值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.growth
     *
     * @mbg.generated
     */
    private Integer growth;

    /**
     * Database Column Remarks:
     *   启用状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   注册时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * md5盐值
     */
    private Long salt;
    /**
     * 社交登陆授权用户的UID
     */
    private String socialUid;
    /**
     * 微博API访问令牌
     * 用户授权的唯一票据，用于调用微博的开放接口
     * 第三方应用应该用该票据和自己应用内的用户建立唯一影射关系，来识别登录状态
     */
    private String accessToken;
    /**
     * access_token的生命周期，单位是秒数
     */
    private String expiresIn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.id
     *
     * @return the value of ums_member.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.id
     *
     * @param id the value for ums_member.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.level_id
     *
     * @return the value of ums_member.level_id
     *
     * @mbg.generated
     */
    public Long getLevelId() {
        return levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.level_id
     *
     * @param levelId the value for ums_member.level_id
     *
     * @mbg.generated
     */
    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.username
     *
     * @return the value of ums_member.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.username
     *
     * @param username the value for ums_member.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.password
     *
     * @return the value of ums_member.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.password
     *
     * @param password the value for ums_member.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.nickname
     *
     * @return the value of ums_member.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.nickname
     *
     * @param nickname the value for ums_member.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.mobile
     *
     * @return the value of ums_member.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.mobile
     *
     * @param mobile the value for ums_member.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.email
     *
     * @return the value of ums_member.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.email
     *
     * @param email the value for ums_member.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.header
     *
     * @return the value of ums_member.header
     *
     * @mbg.generated
     */
    public String getHeader() {
        return header;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.header
     *
     * @param header the value for ums_member.header
     *
     * @mbg.generated
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.gender
     *
     * @return the value of ums_member.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.gender
     *
     * @param gender the value for ums_member.gender
     *
     * @mbg.generated
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.birth
     *
     * @return the value of ums_member.birth
     *
     * @mbg.generated
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.birth
     *
     * @param birth the value for ums_member.birth
     *
     * @mbg.generated
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.city
     *
     * @return the value of ums_member.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.city
     *
     * @param city the value for ums_member.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.job
     *
     * @return the value of ums_member.job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.job
     *
     * @param job the value for ums_member.job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.sign
     *
     * @return the value of ums_member.sign
     *
     * @mbg.generated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.sign
     *
     * @param sign the value for ums_member.sign
     *
     * @mbg.generated
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.source_type
     *
     * @return the value of ums_member.source_type
     *
     * @mbg.generated
     */
    public Byte getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.source_type
     *
     * @param sourceType the value for ums_member.source_type
     *
     * @mbg.generated
     */
    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.integration
     *
     * @return the value of ums_member.integration
     *
     * @mbg.generated
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.integration
     *
     * @param integration the value for ums_member.integration
     *
     * @mbg.generated
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.growth
     *
     * @return the value of ums_member.growth
     *
     * @mbg.generated
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.growth
     *
     * @param growth the value for ums_member.growth
     *
     * @mbg.generated
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.status
     *
     * @return the value of ums_member.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.status
     *
     * @param status the value for ums_member.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.create_time
     *
     * @return the value of ums_member.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.create_time
     *
     * @param createTime the value for ums_member.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSalt() {
        return salt;
    }

    public void setSalt(Long salt) {
        this.salt = salt;
    }

    public String getSocialUid() {
        return socialUid;
    }

    public void setSocialUid(String socialUid) {
        this.socialUid = socialUid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
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
        sb.append(", levelId=").append(levelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", header=").append(header);
        sb.append(", gender=").append(gender);
        sb.append(", birth=").append(birth);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", sign=").append(sign);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", salt=").append(salt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}