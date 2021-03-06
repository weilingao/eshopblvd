package com.hatsukoi.eshopblvd.order.dao;

import com.hatsukoi.eshopblvd.order.entity.OrderSetting;
import com.hatsukoi.eshopblvd.order.entity.OrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    long countByExample(OrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int deleteByExample(OrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int insert(OrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int insertSelective(OrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    List<OrderSetting> selectByExample(OrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    OrderSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderSetting record, @Param("example") OrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderSetting record, @Param("example") OrderSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderSetting record);
}