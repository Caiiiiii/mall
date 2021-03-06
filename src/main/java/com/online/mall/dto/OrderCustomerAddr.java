package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户地址表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_customer_addr
 */
public class OrderCustomerAddr implements Serializable {
    /**
     * Database Column Remarks:
     *   自增主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.customer_addr_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer customerAddrId;

    /**
     * Database Column Remarks:
     *   customer_login表的自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   邮编
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.zip
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Short zip;

    /**
     * Database Column Remarks:
     *   地区表中省份的id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.province
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Short province;

    /**
     * Database Column Remarks:
     *   地区表中城市的id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.city
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Short city;

    /**
     * Database Column Remarks:
     *   地区表中的区id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.district
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Short district;

    /**
     * Database Column Remarks:
     *   具体的地址门牌号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.address
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String address;

    /**
     * Database Column Remarks:
     *   是否默认
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.is_default
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Byte isDefault;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer_addr.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_customer_addr
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.customer_addr_id
     *
     * @return the value of order_customer_addr.customer_addr_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getCustomerAddrId() {
        return customerAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.customer_addr_id
     *
     * @param customerAddrId the value for order_customer_addr.customer_addr_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCustomerAddrId(Integer customerAddrId) {
        this.customerAddrId = customerAddrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.customer_id
     *
     * @return the value of order_customer_addr.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.customer_id
     *
     * @param customerId the value for order_customer_addr.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.zip
     *
     * @return the value of order_customer_addr.zip
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Short getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.zip
     *
     * @param zip the value for order_customer_addr.zip
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setZip(Short zip) {
        this.zip = zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.province
     *
     * @return the value of order_customer_addr.province
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Short getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.province
     *
     * @param province the value for order_customer_addr.province
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setProvince(Short province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.city
     *
     * @return the value of order_customer_addr.city
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Short getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.city
     *
     * @param city the value for order_customer_addr.city
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCity(Short city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.district
     *
     * @return the value of order_customer_addr.district
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Short getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.district
     *
     * @param district the value for order_customer_addr.district
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setDistrict(Short district) {
        this.district = district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.address
     *
     * @return the value of order_customer_addr.address
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.address
     *
     * @param address the value for order_customer_addr.address
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.is_default
     *
     * @return the value of order_customer_addr.is_default
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.is_default
     *
     * @param isDefault the value for order_customer_addr.is_default
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer_addr.modified_time
     *
     * @return the value of order_customer_addr.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer_addr.modified_time
     *
     * @param modifiedTime the value for order_customer_addr.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_customer_addr
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerAddrId=").append(customerAddrId);
        sb.append(", customerId=").append(customerId);
        sb.append(", zip=").append(zip);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}