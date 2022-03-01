package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.Attr;
import com.hatsukoi.eshopblvd.product.entity.AttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    long countByExample(AttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int deleteByExample(AttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int insert(Attr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int insertSelective(Attr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    List<Attr> selectByExample(AttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    Attr selectByPrimaryKey(Long attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Attr record, @Param("example") AttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Attr record, @Param("example") AttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Attr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Attr record);
}