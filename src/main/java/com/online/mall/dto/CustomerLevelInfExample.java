package com.online.mall.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerLevelInfExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public CustomerLevelInfExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
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
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
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

        public Criteria andCustomerLevelIsNull() {
            addCriterion("customer_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("customer_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(Byte value) {
            addCriterion("customer_level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(Byte value) {
            addCriterion("customer_level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(Byte value) {
            addCriterion("customer_level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(Byte value) {
            addCriterion("customer_level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(Byte value) {
            addCriterion("customer_level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<Byte> values) {
            addCriterion("customer_level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<Byte> values) {
            addCriterion("customer_level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(Byte value1, Byte value2) {
            addCriterion("customer_level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_level not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andMinPointIsNull() {
            addCriterion("min_point is null");
            return (Criteria) this;
        }

        public Criteria andMinPointIsNotNull() {
            addCriterion("min_point is not null");
            return (Criteria) this;
        }

        public Criteria andMinPointEqualTo(Integer value) {
            addCriterion("min_point =", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotEqualTo(Integer value) {
            addCriterion("min_point <>", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointGreaterThan(Integer value) {
            addCriterion("min_point >", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_point >=", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointLessThan(Integer value) {
            addCriterion("min_point <", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointLessThanOrEqualTo(Integer value) {
            addCriterion("min_point <=", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointIn(List<Integer> values) {
            addCriterion("min_point in", values, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotIn(List<Integer> values) {
            addCriterion("min_point not in", values, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointBetween(Integer value1, Integer value2) {
            addCriterion("min_point between", value1, value2, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotBetween(Integer value1, Integer value2) {
            addCriterion("min_point not between", value1, value2, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointIsNull() {
            addCriterion("max_point is null");
            return (Criteria) this;
        }

        public Criteria andMaxPointIsNotNull() {
            addCriterion("max_point is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPointEqualTo(Integer value) {
            addCriterion("max_point =", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotEqualTo(Integer value) {
            addCriterion("max_point <>", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointGreaterThan(Integer value) {
            addCriterion("max_point >", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_point >=", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointLessThan(Integer value) {
            addCriterion("max_point <", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointLessThanOrEqualTo(Integer value) {
            addCriterion("max_point <=", value, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointIn(List<Integer> values) {
            addCriterion("max_point in", values, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotIn(List<Integer> values) {
            addCriterion("max_point not in", values, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointBetween(Integer value1, Integer value2) {
            addCriterion("max_point between", value1, value2, "maxPoint");
            return (Criteria) this;
        }

        public Criteria andMaxPointNotBetween(Integer value1, Integer value2) {
            addCriterion("max_point not between", value1, value2, "maxPoint");
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
     * This class corresponds to the database table customer_level_inf
     *
     * @mbg.generated do_not_delete_during_merge Tue Jul 07 15:40:19 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_level_inf
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
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