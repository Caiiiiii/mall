package com.online.mall.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户余额变动表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table customer_balance_log
 */
public class CustomerBalanceLog implements Serializable {
    /**
     * Database Column Remarks:
     *   余额日志id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.balance_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer balanceId;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer customerId;

    /**
     * Database Column Remarks:
     *   记录来源:1订单,2退货单
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.source
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Byte source;

    /**
     * Database Column Remarks:
     *   相关单据ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.source_sn
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer sourceSn;

    /**
     * Database Column Remarks:
     *   记录生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   变动金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_balance_log.amount
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_balance_log
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.balance_id
     *
     * @return the value of customer_balance_log.balance_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getBalanceId() {
        return balanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.balance_id
     *
     * @param balanceId the value for customer_balance_log.balance_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setBalanceId(Integer balanceId) {
        this.balanceId = balanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.customer_id
     *
     * @return the value of customer_balance_log.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.customer_id
     *
     * @param customerId the value for customer_balance_log.customer_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.source
     *
     * @return the value of customer_balance_log.source
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Byte getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.source
     *
     * @param source the value for customer_balance_log.source
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setSource(Byte source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.source_sn
     *
     * @return the value of customer_balance_log.source_sn
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getSourceSn() {
        return sourceSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.source_sn
     *
     * @param sourceSn the value for customer_balance_log.source_sn
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setSourceSn(Integer sourceSn) {
        this.sourceSn = sourceSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.create_time
     *
     * @return the value of customer_balance_log.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.create_time
     *
     * @param createTime the value for customer_balance_log.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_balance_log.amount
     *
     * @return the value of customer_balance_log.amount
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_balance_log.amount
     *
     * @param amount the value for customer_balance_log.amount
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_balance_log
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", balanceId=").append(balanceId);
        sb.append(", customerId=").append(customerId);
        sb.append(", source=").append(source);
        sb.append(", sourceSn=").append(sourceSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", amount=").append(amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}