package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   商品评论表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table product_comment
 */
public class ProductComment implements Serializable {
    /**
     * Database Column Remarks:
     *   评论ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.comment_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Integer commentId;

    /**
     * Database Column Remarks:
     *   商品ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Long orderId;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   评论标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.title
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private String title;

    /**
     * Database Column Remarks:
     *   评论内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.content
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private String content;

    /**
     * Database Column Remarks:
     *   审核状态:0未审核1已审核
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.audit_status
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Byte auditStatus;

    /**
     * Database Column Remarks:
     *   评论时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.audit_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Date auditTime;

    /**
     * Database Column Remarks:
     *   最后修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_comment.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.comment_id
     *
     * @return the value of product_comment.comment_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.comment_id
     *
     * @param commentId the value for product_comment.comment_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.product_id
     *
     * @return the value of product_comment.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.product_id
     *
     * @param productId the value for product_comment.product_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.order_id
     *
     * @return the value of product_comment.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.order_id
     *
     * @param orderId the value for product_comment.order_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.customer_id
     *
     * @return the value of product_comment.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.customer_id
     *
     * @param customerId the value for product_comment.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.title
     *
     * @return the value of product_comment.title
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.title
     *
     * @param title the value for product_comment.title
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.content
     *
     * @return the value of product_comment.content
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.content
     *
     * @param content the value for product_comment.content
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.audit_status
     *
     * @return the value of product_comment.audit_status
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.audit_status
     *
     * @param auditStatus the value for product_comment.audit_status
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.audit_time
     *
     * @return the value of product_comment.audit_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.audit_time
     *
     * @param auditTime the value for product_comment.audit_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_comment.modified_time
     *
     * @return the value of product_comment.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_comment.modified_time
     *
     * @param modifiedTime the value for product_comment.modified_time
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", productId=").append(productId);
        sb.append(", orderId=").append(orderId);
        sb.append(", customerId=").append(customerId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}