package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table customer_level_info
 */
public class CustomerLevelInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   会员级别ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_level_info.customer_level
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Byte customerLevel;

    /**
     * Database Column Remarks:
     *   会员级别名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_level_info.level_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String levelName;

    /**
     * Database Column Remarks:
     *   该级别最低积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_level_info.min_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer minPoint;

    /**
     * Database Column Remarks:
     *   该级别最高积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_level_info.max_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer maxPoint;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_level_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_level_info.customer_level
     *
     * @return the value of customer_level_info.customer_level
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Byte getCustomerLevel() {
        return customerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_level_info.customer_level
     *
     * @param customerLevel the value for customer_level_info.customer_level
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCustomerLevel(Byte customerLevel) {
        this.customerLevel = customerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_level_info.level_name
     *
     * @return the value of customer_level_info.level_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_level_info.level_name
     *
     * @param levelName the value for customer_level_info.level_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_level_info.min_point
     *
     * @return the value of customer_level_info.min_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getMinPoint() {
        return minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_level_info.min_point
     *
     * @param minPoint the value for customer_level_info.min_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setMinPoint(Integer minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_level_info.max_point
     *
     * @return the value of customer_level_info.max_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getMaxPoint() {
        return maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_level_info.max_point
     *
     * @param maxPoint the value for customer_level_info.max_point
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_level_info.modified_time
     *
     * @return the value of customer_level_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_level_info.modified_time
     *
     * @param modifiedTime the value for customer_level_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerLevel=").append(customerLevel);
        sb.append(", levelName=").append(levelName);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", maxPoint=").append(maxPoint);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}