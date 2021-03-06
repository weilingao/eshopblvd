package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.SpuInfoDesc;
import com.hatsukoi.eshopblvd.product.entity.SpuInfoDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpuInfoDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    long countByExample(SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int deleteByExample(SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long spuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int insert(SpuInfoDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int insertSelective(SpuInfoDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    List<SpuInfoDesc> selectByExampleWithBLOBs(SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    List<SpuInfoDesc> selectByExample(SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    SpuInfoDesc selectByPrimaryKey(Long spuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SpuInfoDesc record, @Param("example") SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") SpuInfoDesc record, @Param("example") SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SpuInfoDesc record, @Param("example") SpuInfoDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SpuInfoDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_info_desc
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SpuInfoDesc record);
}