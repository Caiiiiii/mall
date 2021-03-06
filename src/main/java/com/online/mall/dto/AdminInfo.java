package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   管理员信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table admin_info
 */
public class AdminInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   自增主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.admin_info_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer adminInfoId;

    /**
     * Database Column Remarks:
     *   admin_login表的自增ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.admin_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer adminId;

    /**
     * Database Column Remarks:
     *   管理员真实姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.admin_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String adminName;

    /**
     * Database Column Remarks:
     *   证件类型：1 身份证,2军官证,3护照
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.identity_card_type
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Byte identityCardType;

    /**
     * Database Column Remarks:
     *   证件号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.identity_card_no
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String identityCardNo;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.mobile_phone
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String mobilePhone;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.admin_email
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String adminEmail;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.gender
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String gender;

    /**
     * Database Column Remarks:
     *   注册时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.register_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date registerTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.admin_info_id
     *
     * @return the value of admin_info.admin_info_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getAdminInfoId() {
        return adminInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.admin_info_id
     *
     * @param adminInfoId the value for admin_info.admin_info_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAdminInfoId(Integer adminInfoId) {
        this.adminInfoId = adminInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.admin_id
     *
     * @return the value of admin_info.admin_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.admin_id
     *
     * @param adminId the value for admin_info.admin_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.admin_name
     *
     * @return the value of admin_info.admin_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.admin_name
     *
     * @param adminName the value for admin_info.admin_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.identity_card_type
     *
     * @return the value of admin_info.identity_card_type
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Byte getIdentityCardType() {
        return identityCardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.identity_card_type
     *
     * @param identityCardType the value for admin_info.identity_card_type
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setIdentityCardType(Byte identityCardType) {
        this.identityCardType = identityCardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.identity_card_no
     *
     * @return the value of admin_info.identity_card_no
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getIdentityCardNo() {
        return identityCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.identity_card_no
     *
     * @param identityCardNo the value for admin_info.identity_card_no
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo == null ? null : identityCardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.mobile_phone
     *
     * @return the value of admin_info.mobile_phone
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.mobile_phone
     *
     * @param mobilePhone the value for admin_info.mobile_phone
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.admin_email
     *
     * @return the value of admin_info.admin_email
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.admin_email
     *
     * @param adminEmail the value for admin_info.admin_email
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.gender
     *
     * @return the value of admin_info.gender
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.gender
     *
     * @param gender the value for admin_info.gender
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.register_time
     *
     * @return the value of admin_info.register_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.register_time
     *
     * @param registerTime the value for admin_info.register_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_info.modified_time
     *
     * @return the value of admin_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_info.modified_time
     *
     * @param modifiedTime the value for admin_info.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminInfoId=").append(adminInfoId);
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", identityCardType=").append(identityCardType);
        sb.append(", identityCardNo=").append(identityCardNo);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", adminEmail=").append(adminEmail);
        sb.append(", gender=").append(gender);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}