package com.hatsukoi.eshopblvd.member.dao;

import com.hatsukoi.eshopblvd.member.entity.MemberCollectSubject;
import com.hatsukoi.eshopblvd.member.entity.MemberCollectSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCollectSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    long countByExample(MemberCollectSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int deleteByExample(MemberCollectSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int insert(MemberCollectSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int insertSelective(MemberCollectSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    List<MemberCollectSubject> selectByExample(MemberCollectSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    MemberCollectSubject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MemberCollectSubject record, @Param("example") MemberCollectSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MemberCollectSubject record, @Param("example") MemberCollectSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberCollectSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_collect_subject
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberCollectSubject record);
}