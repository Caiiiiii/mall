package com.online.mall.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductPicInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public ProductPicInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductPicIdIsNull() {
            addCriterion("product_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIdIsNotNull() {
            addCriterion("product_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicIdEqualTo(Integer value) {
            addCriterion("product_pic_id =", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdNotEqualTo(Integer value) {
            addCriterion("product_pic_id <>", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdGreaterThan(Integer value) {
            addCriterion("product_pic_id >", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_pic_id >=", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdLessThan(Integer value) {
            addCriterion("product_pic_id <", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_pic_id <=", value, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdIn(List<Integer> values) {
            addCriterion("product_pic_id in", values, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdNotIn(List<Integer> values) {
            addCriterion("product_pic_id not in", values, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdBetween(Integer value1, Integer value2) {
            addCriterion("product_pic_id between", value1, value2, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_pic_id not between", value1, value2, "productPicId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPicDescIsNull() {
            addCriterion("pic_desc is null");
            return (Criteria) this;
        }

        public Criteria andPicDescIsNotNull() {
            addCriterion("pic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPicDescEqualTo(String value) {
            addCriterion("pic_desc =", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotEqualTo(String value) {
            addCriterion("pic_desc <>", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThan(String value) {
            addCriterion("pic_desc >", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescGreaterThanOrEqualTo(String value) {
            addCriterion("pic_desc >=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThan(String value) {
            addCriterion("pic_desc <", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLessThanOrEqualTo(String value) {
            addCriterion("pic_desc <=", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescLike(String value) {
            addCriterion("pic_desc like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotLike(String value) {
            addCriterion("pic_desc not like", value, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescIn(List<String> values) {
            addCriterion("pic_desc in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotIn(List<String> values) {
            addCriterion("pic_desc not in", values, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescBetween(String value1, String value2) {
            addCriterion("pic_desc between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicDescNotBetween(String value1, String value2) {
            addCriterion("pic_desc not between", value1, value2, "picDesc");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andIsMasterIsNull() {
            addCriterion("is_master is null");
            return (Criteria) this;
        }

        public Criteria andIsMasterIsNotNull() {
            addCriterion("is_master is not null");
            return (Criteria) this;
        }

        public Criteria andIsMasterEqualTo(Byte value) {
            addCriterion("is_master =", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotEqualTo(Byte value) {
            addCriterion("is_master <>", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterGreaterThan(Byte value) {
            addCriterion("is_master >", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_master >=", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterLessThan(Byte value) {
            addCriterion("is_master <", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterLessThanOrEqualTo(Byte value) {
            addCriterion("is_master <=", value, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterIn(List<Byte> values) {
            addCriterion("is_master in", values, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotIn(List<Byte> values) {
            addCriterion("is_master not in", values, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterBetween(Byte value1, Byte value2) {
            addCriterion("is_master between", value1, value2, "isMaster");
            return (Criteria) this;
        }

        public Criteria andIsMasterNotBetween(Byte value1, Byte value2) {
            addCriterion("is_master not between", value1, value2, "isMaster");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNull() {
            addCriterion("pic_order is null");
            return (Criteria) this;
        }

        public Criteria andPicOrderIsNotNull() {
            addCriterion("pic_order is not null");
            return (Criteria) this;
        }

        public Criteria andPicOrderEqualTo(Byte value) {
            addCriterion("pic_order =", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotEqualTo(Byte value) {
            addCriterion("pic_order <>", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThan(Byte value) {
            addCriterion("pic_order >", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("pic_order >=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThan(Byte value) {
            addCriterion("pic_order <", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderLessThanOrEqualTo(Byte value) {
            addCriterion("pic_order <=", value, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderIn(List<Byte> values) {
            addCriterion("pic_order in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotIn(List<Byte> values) {
            addCriterion("pic_order not in", values, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderBetween(Byte value1, Byte value2) {
            addCriterion("pic_order between", value1, value2, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("pic_order not between", value1, value2, "picOrder");
            return (Criteria) this;
        }

        public Criteria andPicStatusIsNull() {
            addCriterion("pic_status is null");
            return (Criteria) this;
        }

        public Criteria andPicStatusIsNotNull() {
            addCriterion("pic_status is not null");
            return (Criteria) this;
        }

        public Criteria andPicStatusEqualTo(Byte value) {
            addCriterion("pic_status =", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotEqualTo(Byte value) {
            addCriterion("pic_status <>", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusGreaterThan(Byte value) {
            addCriterion("pic_status >", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pic_status >=", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusLessThan(Byte value) {
            addCriterion("pic_status <", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pic_status <=", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusIn(List<Byte> values) {
            addCriterion("pic_status in", values, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotIn(List<Byte> values) {
            addCriterion("pic_status not in", values, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusBetween(Byte value1, Byte value2) {
            addCriterion("pic_status between", value1, value2, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pic_status not between", value1, value2, "picStatus");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_pic_info
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 17 15:24:47 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_pic_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}