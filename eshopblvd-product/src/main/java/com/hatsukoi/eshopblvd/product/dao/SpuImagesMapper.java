package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.SpuImages;
import com.hatsukoi.eshopblvd.product.entity.SpuImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpuImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    long countByExample(SpuImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int deleteByExample(SpuImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int insert(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int insertSelective(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    List<SpuImages> selectByExample(SpuImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    SpuImages selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SpuImages record, @Param("example") SpuImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SpuImages record, @Param("example") SpuImagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SpuImages record);
}