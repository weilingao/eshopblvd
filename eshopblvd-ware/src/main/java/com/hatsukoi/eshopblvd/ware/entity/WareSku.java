package com.hatsukoi.eshopblvd.ware.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table wms_ware_sku
 */
public class WareSku implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   sku_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.sku_id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * Database Column Remarks:
     *   仓库id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.ware_id
     *
     * @mbg.generated
     */
    private Long wareId;

    /**
     * Database Column Remarks:
     *   库存数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.stock
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     * Database Column Remarks:
     *   sku_name
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.sku_name
     *
     * @mbg.generated
     */
    private String skuName;

    /**
     * Database Column Remarks:
     *   锁定库存
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_sku.stock_locked
     *
     * @mbg.generated
     */
    private Integer stockLocked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wms_ware_sku
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.id
     *
     * @return the value of wms_ware_sku.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.id
     *
     * @param id the value for wms_ware_sku.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.sku_id
     *
     * @return the value of wms_ware_sku.sku_id
     *
     * @mbg.generated
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.sku_id
     *
     * @param skuId the value for wms_ware_sku.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.ware_id
     *
     * @return the value of wms_ware_sku.ware_id
     *
     * @mbg.generated
     */
    public Long getWareId() {
        return wareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.ware_id
     *
     * @param wareId the value for wms_ware_sku.ware_id
     *
     * @mbg.generated
     */
    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.stock
     *
     * @return the value of wms_ware_sku.stock
     *
     * @mbg.generated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.stock
     *
     * @param stock the value for wms_ware_sku.stock
     *
     * @mbg.generated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.sku_name
     *
     * @return the value of wms_ware_sku.sku_name
     *
     * @mbg.generated
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.sku_name
     *
     * @param skuName the value for wms_ware_sku.sku_name
     *
     * @mbg.generated
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_sku.stock_locked
     *
     * @return the value of wms_ware_sku.stock_locked
     *
     * @mbg.generated
     */
    public Integer getStockLocked() {
        return stockLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_sku.stock_locked
     *
     * @param stockLocked the value for wms_ware_sku.stock_locked
     *
     * @mbg.generated
     */
    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_ware_sku
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
        sb.append(", wareId=").append(wareId);
        sb.append(", stock=").append(stock);
        sb.append(", skuName=").append(skuName);
        sb.append(", stockLocked=").append(stockLocked);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}