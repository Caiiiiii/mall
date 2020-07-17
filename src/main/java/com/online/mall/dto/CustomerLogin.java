package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户登陆表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table customer_login
 */
public class CustomerLogin implements Serializable {
    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_login.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   用户登陆名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_login.login_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String loginName;

    /**
     * Database Column Remarks:
     *   md5加密的密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_login.password
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String password;

    /**
     * Database Column Remarks:
     *   用户状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_login.user_stats
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Byte userStats;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_login.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_login
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_login.customer_id
     *
     * @return the value of customer_login.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_login.customer_id
     *
     * @param customerId the value for customer_login.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_login.login_name
     *
     * @return the value of customer_login.login_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_login.login_name
     *
     * @param loginName the value for customer_login.login_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_login.password
     *
     * @return the value of customer_login.password
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_login.password
     *
     * @param password the value for customer_login.password
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_login.user_stats
     *
     * @return the value of customer_login.user_stats
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Byte getUserStats() {
        return userStats;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_login.user_stats
     *
     * @param userStats the value for customer_login.user_stats
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setUserStats(Byte userStats) {
        this.userStats = userStats;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_login.modified_time
     *
     * @return the value of customer_login.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_login.modified_time
     *
     * @param modifiedTime the value for customer_login.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_login
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", userStats=").append(userStats);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}