package com.hatsukoi.eshopblvd.ware.dao;

import com.hatsukoi.eshopblvd.ware.entity.PurchaseDetail;
import com.hatsukoi.eshopblvd.ware.entity.PurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    long countByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int deleteByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int insert(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int insertSelective(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    List<PurchaseDetail> selectByExample(PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    PurchaseDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PurchaseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_purchase_detail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PurchaseDetail record);
}