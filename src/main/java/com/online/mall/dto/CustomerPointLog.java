package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户积分日志表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table customer_point_log
 */
public class CustomerPointLog implements Serializable {
    /**
     * Database Column Remarks:
     *   积分日志ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.point_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer pointId;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   积分来源:0订单,1登录,2活动
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.source
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Byte source;

    /**
     * Database Column Remarks:
     *   积分来源相关编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.refer_number
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Integer referNumber;

    /**
     * Database Column Remarks:
     *   变更积分数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.change_point
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Short changePoint;

    /**
     * Database Column Remarks:
     *   积分日志生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_point_log.create_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_point_log
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.point_id
     *
     * @return the value of customer_point_log.point_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getPointId() {
        return pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.point_id
     *
     * @param pointId the value for customer_point_log.point_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.customer_id
     *
     * @return the value of customer_point_log.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.customer_id
     *
     * @param customerId the value for customer_point_log.customer_id
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.source
     *
     * @return the value of customer_point_log.source
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Byte getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.source
     *
     * @param source the value for customer_point_log.source
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.refer_number
     *
     * @return the value of customer_point_log.refer_number
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Integer getReferNumber() {
        return referNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.refer_number
     *
     * @param referNumber the value for customer_point_log.refer_number
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setReferNumber(Integer referNumber) {
        this.referNumber = referNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.change_point
     *
     * @return the value of customer_point_log.change_point
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Short getChangePoint() {
        return changePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.change_point
     *
     * @param changePoint the value for customer_point_log.change_point
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setChangePoint(Short changePoint) {
        this.changePoint = changePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_point_log.create_time
     *
     * @return the value of customer_point_log.create_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_point_log.create_time
     *
     * @param createTime the value for customer_point_log.create_time
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_point_log
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pointId=").append(pointId);
        sb.append(", customerId=").append(customerId);
        sb.append(", source=").append(source);
        sb.append(", referNumber=").append(referNumber);
        sb.append(", changePoint=").append(changePoint);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}