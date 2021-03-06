package com.hatsukoi.eshopblvd.member.dao;

import com.hatsukoi.eshopblvd.member.entity.Member;
import com.hatsukoi.eshopblvd.member.entity.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    long countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    Member selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Member record);
}