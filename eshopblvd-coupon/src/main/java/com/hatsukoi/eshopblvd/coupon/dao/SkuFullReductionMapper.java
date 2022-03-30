package com.hatsukoi.eshopblvd.coupon.dao;

import com.hatsukoi.eshopblvd.coupon.entity.SkuFullReduction;
import com.hatsukoi.eshopblvd.coupon.entity.SkuFullReductionExample;
import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface SkuFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    long countByExample(SkuFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int deleteByExample(SkuFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(SkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int insertSelective(SkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    List<SkuFullReduction> selectByExample(SkuFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    SkuFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SkuFullReduction record, @Param("example") SkuFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SkuFullReduction record, @Param("example") SkuFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SkuFullReduction record);
}