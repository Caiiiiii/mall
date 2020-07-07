package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   品牌信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table product_brand_info
 */
public class ProductBrandInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   品牌ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Short brandId;

    /**
     * Database Column Remarks:
     *   品牌名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_name
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private String brandName;

    /**
     * Database Column Remarks:
     *   联系电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.telephone
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private String telephone;

    /**
     * Database Column Remarks:
     *   品牌网站
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_web
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private String brandWeb;

    /**
     * Database Column Remarks:
     *   品牌logo URL
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_logo
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private String brandLogo;

    /**
     * Database Column Remarks:
     *   品牌描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_desc
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private String brandDesc;

    /**
     * Database Column Remarks:
     *   品牌状态,0禁用,1启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_status
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Byte brandStatus;

    /**
     * Database Column Remarks:
     *   排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.brand_order
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Byte brandOrder;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_brand_info.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_id
     *
     * @return the value of product_brand_info.brand_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Short getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_id
     *
     * @param brandId the value for product_brand_info.brand_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_name
     *
     * @return the value of product_brand_info.brand_name
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_name
     *
     * @param brandName the value for product_brand_info.brand_name
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.telephone
     *
     * @return the value of product_brand_info.telephone
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.telephone
     *
     * @param telephone the value for product_brand_info.telephone
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_web
     *
     * @return the value of product_brand_info.brand_web
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public String getBrandWeb() {
        return brandWeb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_web
     *
     * @param brandWeb the value for product_brand_info.brand_web
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandWeb(String brandWeb) {
        this.brandWeb = brandWeb == null ? null : brandWeb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_logo
     *
     * @return the value of product_brand_info.brand_logo
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public String getBrandLogo() {
        return brandLogo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_logo
     *
     * @param brandLogo the value for product_brand_info.brand_logo
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_desc
     *
     * @return the value of product_brand_info.brand_desc
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_desc
     *
     * @param brandDesc the value for product_brand_info.brand_desc
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_status
     *
     * @return the value of product_brand_info.brand_status
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Byte getBrandStatus() {
        return brandStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_status
     *
     * @param brandStatus the value for product_brand_info.brand_status
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandStatus(Byte brandStatus) {
        this.brandStatus = brandStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.brand_order
     *
     * @return the value of product_brand_info.brand_order
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Byte getBrandOrder() {
        return brandOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.brand_order
     *
     * @param brandOrder the value for product_brand_info.brand_order
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setBrandOrder(Byte brandOrder) {
        this.brandOrder = brandOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_brand_info.modified_time
     *
     * @return the value of product_brand_info.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_brand_info.modified_time
     *
     * @param modifiedTime the value for product_brand_info.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", telephone=").append(telephone);
        sb.append(", brandWeb=").append(brandWeb);
        sb.append(", brandLogo=").append(brandLogo);
        sb.append(", brandDesc=").append(brandDesc);
        sb.append(", brandStatus=").append(brandStatus);
        sb.append(", brandOrder=").append(brandOrder);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}