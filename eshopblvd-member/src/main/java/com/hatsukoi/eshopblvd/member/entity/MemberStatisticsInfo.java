package com.hatsukoi.eshopblvd.member.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_statistics_info
 */
public class MemberStatisticsInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   会员id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.member_id
     *
     * @mbg.generated
     */
    private Long memberId;

    /**
     * Database Column Remarks:
     *   累计消费金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.consume_amount
     *
     * @mbg.generated
     */
    private BigDecimal consumeAmount;

    /**
     * Database Column Remarks:
     *   累计优惠金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.coupon_amount
     *
     * @mbg.generated
     */
    private BigDecimal couponAmount;

    /**
     * Database Column Remarks:
     *   订单数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.order_count
     *
     * @mbg.generated
     */
    private Integer orderCount;

    /**
     * Database Column Remarks:
     *   优惠券数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.coupon_count
     *
     * @mbg.generated
     */
    private Integer couponCount;

    /**
     * Database Column Remarks:
     *   评价数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.comment_count
     *
     * @mbg.generated
     */
    private Integer commentCount;

    /**
     * Database Column Remarks:
     *   退货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.return_order_count
     *
     * @mbg.generated
     */
    private Integer returnOrderCount;

    /**
     * Database Column Remarks:
     *   登录次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.login_count
     *
     * @mbg.generated
     */
    private Integer loginCount;

    /**
     * Database Column Remarks:
     *   关注数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.attend_count
     *
     * @mbg.generated
     */
    private Integer attendCount;

    /**
     * Database Column Remarks:
     *   粉丝数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.fans_count
     *
     * @mbg.generated
     */
    private Integer fansCount;

    /**
     * Database Column Remarks:
     *   收藏的商品数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_product_count
     *
     * @mbg.generated
     */
    private Integer collectProductCount;

    /**
     * Database Column Remarks:
     *   收藏的专题活动数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_subject_count
     *
     * @mbg.generated
     */
    private Integer collectSubjectCount;

    /**
     * Database Column Remarks:
     *   收藏的评论数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_comment_count
     *
     * @mbg.generated
     */
    private Integer collectCommentCount;

    /**
     * Database Column Remarks:
     *   邀请的朋友数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.invite_friend_count
     *
     * @mbg.generated
     */
    private Integer inviteFriendCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_statistics_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.id
     *
     * @return the value of ums_member_statistics_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.id
     *
     * @param id the value for ums_member_statistics_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.member_id
     *
     * @return the value of ums_member_statistics_info.member_id
     *
     * @mbg.generated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.member_id
     *
     * @param memberId the value for ums_member_statistics_info.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.consume_amount
     *
     * @return the value of ums_member_statistics_info.consume_amount
     *
     * @mbg.generated
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.consume_amount
     *
     * @param consumeAmount the value for ums_member_statistics_info.consume_amount
     *
     * @mbg.generated
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.coupon_amount
     *
     * @return the value of ums_member_statistics_info.coupon_amount
     *
     * @mbg.generated
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.coupon_amount
     *
     * @param couponAmount the value for ums_member_statistics_info.coupon_amount
     *
     * @mbg.generated
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.order_count
     *
     * @return the value of ums_member_statistics_info.order_count
     *
     * @mbg.generated
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.order_count
     *
     * @param orderCount the value for ums_member_statistics_info.order_count
     *
     * @mbg.generated
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.coupon_count
     *
     * @return the value of ums_member_statistics_info.coupon_count
     *
     * @mbg.generated
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.coupon_count
     *
     * @param couponCount the value for ums_member_statistics_info.coupon_count
     *
     * @mbg.generated
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.comment_count
     *
     * @return the value of ums_member_statistics_info.comment_count
     *
     * @mbg.generated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.comment_count
     *
     * @param commentCount the value for ums_member_statistics_info.comment_count
     *
     * @mbg.generated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.return_order_count
     *
     * @return the value of ums_member_statistics_info.return_order_count
     *
     * @mbg.generated
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.return_order_count
     *
     * @param returnOrderCount the value for ums_member_statistics_info.return_order_count
     *
     * @mbg.generated
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.login_count
     *
     * @return the value of ums_member_statistics_info.login_count
     *
     * @mbg.generated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.login_count
     *
     * @param loginCount the value for ums_member_statistics_info.login_count
     *
     * @mbg.generated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.attend_count
     *
     * @return the value of ums_member_statistics_info.attend_count
     *
     * @mbg.generated
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.attend_count
     *
     * @param attendCount the value for ums_member_statistics_info.attend_count
     *
     * @mbg.generated
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.fans_count
     *
     * @return the value of ums_member_statistics_info.fans_count
     *
     * @mbg.generated
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.fans_count
     *
     * @param fansCount the value for ums_member_statistics_info.fans_count
     *
     * @mbg.generated
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @return the value of ums_member_statistics_info.collect_product_count
     *
     * @mbg.generated
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @param collectProductCount the value for ums_member_statistics_info.collect_product_count
     *
     * @mbg.generated
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @return the value of ums_member_statistics_info.collect_subject_count
     *
     * @mbg.generated
     */
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @param collectSubjectCount the value for ums_member_statistics_info.collect_subject_count
     *
     * @mbg.generated
     */
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @return the value of ums_member_statistics_info.collect_comment_count
     *
     * @mbg.generated
     */
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @param collectCommentCount the value for ums_member_statistics_info.collect_comment_count
     *
     * @mbg.generated
     */
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @return the value of ums_member_statistics_info.invite_friend_count
     *
     * @mbg.generated
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @param inviteFriendCount the value for ums_member_statistics_info.invite_friend_count
     *
     * @mbg.generated
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
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
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectProductCount=").append(collectProductCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}