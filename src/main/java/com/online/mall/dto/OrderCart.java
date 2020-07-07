package com.online.mall.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   购物车表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_cart
 */
public class OrderCart implements Serializable {
    /**
     * Database Column Remarks:
     *   购物车ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.cart_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer cartId;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   商品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.product_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   加入购物车商品数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.product_amount
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer productAmount;

    /**
     * Database Column Remarks:
     *   商品价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.price
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   加入购物车时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.add_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Date addTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_cart.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_cart
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.cart_id
     *
     * @return the value of order_cart.cart_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.cart_id
     *
     * @param cartId the value for order_cart.cart_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.customer_id
     *
     * @return the value of order_cart.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.customer_id
     *
     * @param customerId the value for order_cart.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.product_id
     *
     * @return the value of order_cart.product_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.product_id
     *
     * @param productId the value for order_cart.product_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.product_amount
     *
     * @return the value of order_cart.product_amount
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getProductAmount() {
        return productAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.product_amount
     *
     * @param productAmount the value for order_cart.product_amount
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.price
     *
     * @return the value of order_cart.price
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.price
     *
     * @param price the value for order_cart.price
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.add_time
     *
     * @return the value of order_cart.add_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.add_time
     *
     * @param addTime the value for order_cart.add_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_cart.modified_time
     *
     * @return the value of order_cart.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_cart.modified_time
     *
     * @param modifiedTime the value for order_cart.modified_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", customerId=").append(customerId);
        sb.append(", productId=").append(productId);
        sb.append(", productAmount=").append(productAmount);
        sb.append(", price=").append(price);
        sb.append(", addTime=").append(addTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}