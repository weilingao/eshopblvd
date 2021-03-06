package com.hatsukoi.eshopblvd.coupon.dao;

import com.hatsukoi.eshopblvd.coupon.entity.SeckillPromotion;
import com.hatsukoi.eshopblvd.coupon.entity.SeckillPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillPromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    long countByExample(SeckillPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int deleteByExample(SeckillPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int insert(SeckillPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int insertSelective(SeckillPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    List<SeckillPromotion> selectByExample(SeckillPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    SeckillPromotion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SeckillPromotion record, @Param("example") SeckillPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SeckillPromotion record, @Param("example") SeckillPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SeckillPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_promotion
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SeckillPromotion record);
}