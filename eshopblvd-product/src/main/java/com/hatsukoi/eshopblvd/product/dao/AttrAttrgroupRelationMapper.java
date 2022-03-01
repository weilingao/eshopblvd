package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.AttrAttrgroupRelation;
import com.hatsukoi.eshopblvd.product.entity.AttrAttrgroupRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrAttrgroupRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    long countByExample(AttrAttrgroupRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int deleteByExample(AttrAttrgroupRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int insert(AttrAttrgroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int insertSelective(AttrAttrgroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    List<AttrAttrgroupRelation> selectByExample(AttrAttrgroupRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    AttrAttrgroupRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AttrAttrgroupRelation record, @Param("example") AttrAttrgroupRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AttrAttrgroupRelation record, @Param("example") AttrAttrgroupRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AttrAttrgroupRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_attrgroup_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AttrAttrgroupRelation record);
}