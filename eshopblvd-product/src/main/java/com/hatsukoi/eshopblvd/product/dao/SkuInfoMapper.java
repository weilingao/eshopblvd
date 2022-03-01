package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.SkuInfo;
import com.hatsukoi.eshopblvd.product.entity.SkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    long countByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int deleteByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int insert(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int insertSelective(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    List<SkuInfo> selectByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    SkuInfo selectByPrimaryKey(Long skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SkuInfo record, @Param("example") SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SkuInfo record, @Param("example") SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SkuInfo record);
}