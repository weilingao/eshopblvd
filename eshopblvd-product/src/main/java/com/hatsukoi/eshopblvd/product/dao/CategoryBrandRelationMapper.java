package com.hatsukoi.eshopblvd.product.dao;

import com.hatsukoi.eshopblvd.product.entity.CategoryBrandRelation;
import com.hatsukoi.eshopblvd.product.entity.CategoryBrandRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryBrandRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    long countByExample(CategoryBrandRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int deleteByExample(CategoryBrandRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int insert(CategoryBrandRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int insertSelective(CategoryBrandRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    List<CategoryBrandRelation> selectByExample(CategoryBrandRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    CategoryBrandRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CategoryBrandRelation record, @Param("example") CategoryBrandRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CategoryBrandRelation record, @Param("example") CategoryBrandRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CategoryBrandRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category_brand_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CategoryBrandRelation record);
}