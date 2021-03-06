package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.SpuInfo;
import com.hatsukoi.eshopblvd.product.entity.SpuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    long countByExample(SpuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int deleteByExample(SpuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int insert(SpuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int insertSelective(SpuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    List<SpuInfo> selectByExample(SpuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    SpuInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SpuInfo record, @Param("example") SpuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SpuInfo record, @Param("example") SpuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SpuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SpuInfo record);
}