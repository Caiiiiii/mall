package com.online.mall.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   订单详情表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_detail
 */
public class OrderDetail implements Serializable {
    /**
     * Database Column Remarks:
     *   自增主键ID,订单详情表ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_detail_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer orderDetailId;

    /**
     * Database Column Remarks:
     *   订单表ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer orderId;

    /**
     * Database Column Remarks:
     *   订单商品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String productName;

    /**
     * Database Column Remarks:
     *   购买商品数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_cnt
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer productCnt;

    /**
     * Database Column Remarks:
     *   购买商品单价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_price
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private BigDecimal productPrice;

    /**
     * Database Column Remarks:
     *   平均成本价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.average_cost
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private BigDecimal averageCost;

    /**
     * Database Column Remarks:
     *   商品重量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.weight
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Float weight;

    /**
     * Database Column Remarks:
     *   优惠分摊金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.fee_money
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private BigDecimal feeMoney;

    /**
     * Database Column Remarks:
     *   仓库ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.w_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer wId;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_detail
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_detail_id
     *
     * @return the value of order_detail.order_detail_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_detail_id
     *
     * @param orderDetailId the value for order_detail.order_detail_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_id
     *
     * @return the value of order_detail.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_id
     *
     * @param orderId the value for order_detail.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_id
     *
     * @return the value of order_detail.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_id
     *
     * @param productId the value for order_detail.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_name
     *
     * @return the value of order_detail.product_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_name
     *
     * @param productName the value for order_detail.product_name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_cnt
     *
     * @return the value of order_detail.product_cnt
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getProductCnt() {
        return productCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_cnt
     *
     * @param productCnt the value for order_detail.product_cnt
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setProductCnt(Integer productCnt) {
        this.productCnt = productCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_price
     *
     * @return the value of order_detail.product_price
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_price
     *
     * @param productPrice the value for order_detail.product_price
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.average_cost
     *
     * @return the value of order_detail.average_cost
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public BigDecimal getAverageCost() {
        return averageCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.average_cost
     *
     * @param averageCost the value for order_detail.average_cost
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.weight
     *
     * @return the value of order_detail.weight
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.weight
     *
     * @param weight the value for order_detail.weight
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.fee_money
     *
     * @return the value of order_detail.fee_money
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public BigDecimal getFeeMoney() {
        return feeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.fee_money
     *
     * @param feeMoney the value for order_detail.fee_money
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setFeeMoney(BigDecimal feeMoney) {
        this.feeMoney = feeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.w_id
     *
     * @return the value of order_detail.w_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getwId() {
        return wId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.w_id
     *
     * @param wId the value for order_detail.w_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setwId(Integer wId) {
        this.wId = wId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.modified_time
     *
     * @return the value of order_detail.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.modified_time
     *
     * @param modifiedTime the value for order_detail.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderDetailId=").append(orderDetailId);
        sb.append(", orderId=").append(orderId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productCnt=").append(productCnt);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", averageCost=").append(averageCost);
        sb.append(", weight=").append(weight);
        sb.append(", feeMoney=").append(feeMoney);
        sb.append(", wId=").append(wId);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}