package com.hatsukoi.eshopblvd.ware.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table wms_ware_info
 */
public class WareInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   仓库名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_info.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   仓库地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_info.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * Database Column Remarks:
     *   区域编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wms_ware_info.areacode
     *
     * @mbg.generated
     */
    private String areacode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wms_ware_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_info.id
     *
     * @return the value of wms_ware_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_info.id
     *
     * @param id the value for wms_ware_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_info.name
     *
     * @return the value of wms_ware_info.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_info.name
     *
     * @param name the value for wms_ware_info.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_info.address
     *
     * @return the value of wms_ware_info.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_info.address
     *
     * @param address the value for wms_ware_info.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wms_ware_info.areacode
     *
     * @return the value of wms_ware_info.areacode
     *
     * @mbg.generated
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wms_ware_info.areacode
     *
     * @param areacode the value for wms_ware_info.areacode
     *
     * @mbg.generated
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wms_ware_info
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
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", areacode=").append(areacode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}