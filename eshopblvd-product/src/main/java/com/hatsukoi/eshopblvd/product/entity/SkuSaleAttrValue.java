package com.hatsukoi.eshopblvd.product.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_sku_sale_attr_value
 */
public class SkuSaleAttrValue implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   sku_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   attr_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.attr_id
     *
     * @mbg.generated
     */
    private Long attrId;

    /**
     * Database Column Remarks:
     *   销售属性名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.attr_name
     *
     * @mbg.generated
     */
    private String attrName;

    /**
     * Database Column Remarks:
     *   销售属性值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.attr_value
     *
     * @mbg.generated
     */
    private String attrValue;

    /**
     * Database Column Remarks:
     *   顺序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.attr_sort
     *
     * @mbg.generated
     */
    private Integer attrSort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.id
     *
     * @return the value of pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.id
     *
     * @param id the value for pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sku_id
     *
     * @return the value of pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sku_id
     *
     * @param skuId the value for pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.attr_id
     *
     * @return the value of pms_sku_sale_attr_value.attr_id
     *
     * @mbg.generated
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.attr_id
     *
     * @param attrId the value for pms_sku_sale_attr_value.attr_id
     *
     * @mbg.generated
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.attr_name
     *
     * @return the value of pms_sku_sale_attr_value.attr_name
     *
     * @mbg.generated
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.attr_name
     *
     * @param attrName the value for pms_sku_sale_attr_value.attr_name
     *
     * @mbg.generated
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.attr_value
     *
     * @return the value of pms_sku_sale_attr_value.attr_value
     *
     * @mbg.generated
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.attr_value
     *
     * @param attrValue the value for pms_sku_sale_attr_value.attr_value
     *
     * @mbg.generated
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.attr_sort
     *
     * @return the value of pms_sku_sale_attr_value.attr_sort
     *
     * @mbg.generated
     */
    public Integer getAttrSort() {
        return attrSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.attr_sort
     *
     * @param attrSort the value for pms_sku_sale_attr_value.attr_sort
     *
     * @mbg.generated
     */
    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", attrId=").append(attrId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", attrSort=").append(attrSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}