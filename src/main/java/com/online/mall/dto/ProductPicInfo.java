package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   商品图片信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table product_pic_info
 */
public class ProductPicInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   商品图片ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.product_pic_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Integer productPicId;

    /**
     * Database Column Remarks:
     *   商品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.product_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   图片描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.pic_desc
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private String picDesc;

    /**
     * Database Column Remarks:
     *   图片URL
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.pic_url
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private String picUrl;

    /**
     * Database Column Remarks:
     *   是否主图:0.非主图1.主图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.is_master
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Byte isMaster;

    /**
     * Database Column Remarks:
     *   图片排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.pic_order
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Byte picOrder;

    /**
     * Database Column Remarks:
     *   图片是否有效:0无效 1有效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.pic_status
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Byte picStatus;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_pic_info.modified_time
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_pic_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.product_pic_id
     *
     * @return the value of product_pic_info.product_pic_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Integer getProductPicId() {
        return productPicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.product_pic_id
     *
     * @param productPicId the value for product_pic_info.product_pic_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setProductPicId(Integer productPicId) {
        this.productPicId = productPicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.product_id
     *
     * @return the value of product_pic_info.product_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.product_id
     *
     * @param productId the value for product_pic_info.product_id
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.pic_desc
     *
     * @return the value of product_pic_info.pic_desc
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public String getPicDesc() {
        return picDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.pic_desc
     *
     * @param picDesc the value for product_pic_info.pic_desc
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc == null ? null : picDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.pic_url
     *
     * @return the value of product_pic_info.pic_url
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.pic_url
     *
     * @param picUrl the value for product_pic_info.pic_url
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.is_master
     *
     * @return the value of product_pic_info.is_master
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Byte getIsMaster() {
        return isMaster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.is_master
     *
     * @param isMaster the value for product_pic_info.is_master
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setIsMaster(Byte isMaster) {
        this.isMaster = isMaster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.pic_order
     *
     * @return the value of product_pic_info.pic_order
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Byte getPicOrder() {
        return picOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.pic_order
     *
     * @param picOrder the value for product_pic_info.pic_order
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setPicOrder(Byte picOrder) {
        this.picOrder = picOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.pic_status
     *
     * @return the value of product_pic_info.pic_status
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Byte getPicStatus() {
        return picStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.pic_status
     *
     * @param picStatus the value for product_pic_info.pic_status
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setPicStatus(Byte picStatus) {
        this.picStatus = picStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_pic_info.modified_time
     *
     * @return the value of product_pic_info.modified_time
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_pic_info.modified_time
     *
     * @param modifiedTime the value for product_pic_info.modified_time
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productPicId=").append(productPicId);
        sb.append(", productId=").append(productId);
        sb.append(", picDesc=").append(picDesc);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", isMaster=").append(isMaster);
        sb.append(", picOrder=").append(picOrder);
        sb.append(", picStatus=").append(picStatus);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}