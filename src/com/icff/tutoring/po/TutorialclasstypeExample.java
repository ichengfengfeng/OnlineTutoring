package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.List;

public class TutorialclasstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TutorialclasstypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeid like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeid not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidIsNull() {
            addCriterion("super_typeid is null");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidIsNotNull() {
            addCriterion("super_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidEqualTo(String value) {
            addCriterion("super_typeid =", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidNotEqualTo(String value) {
            addCriterion("super_typeid <>", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidGreaterThan(String value) {
            addCriterion("super_typeid >", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("super_typeid >=", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidLessThan(String value) {
            addCriterion("super_typeid <", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidLessThanOrEqualTo(String value) {
            addCriterion("super_typeid <=", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidLike(String value) {
            addCriterion("super_typeid like", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidNotLike(String value) {
            addCriterion("super_typeid not like", value, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidIn(List<String> values) {
            addCriterion("super_typeid in", values, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidNotIn(List<String> values) {
            addCriterion("super_typeid not in", values, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidBetween(String value1, String value2) {
            addCriterion("super_typeid between", value1, value2, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andSuperTypeidNotBetween(String value1, String value2) {
            addCriterion("super_typeid not between", value1, value2, "superTypeid");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeIsNull() {
            addCriterion("type_describe is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeIsNotNull() {
            addCriterion("type_describe is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeEqualTo(String value) {
            addCriterion("type_describe =", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeNotEqualTo(String value) {
            addCriterion("type_describe <>", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeGreaterThan(String value) {
            addCriterion("type_describe >", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("type_describe >=", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeLessThan(String value) {
            addCriterion("type_describe <", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeLessThanOrEqualTo(String value) {
            addCriterion("type_describe <=", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeLike(String value) {
            addCriterion("type_describe like", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeNotLike(String value) {
            addCriterion("type_describe not like", value, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeIn(List<String> values) {
            addCriterion("type_describe in", values, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeNotIn(List<String> values) {
            addCriterion("type_describe not in", values, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeBetween(String value1, String value2) {
            addCriterion("type_describe between", value1, value2, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andTypeDescribeNotBetween(String value1, String value2) {
            addCriterion("type_describe not between", value1, value2, "typeDescribe");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNull() {
            addCriterion("yxbz is null");
            return (Criteria) this;
        }

        public Criteria andYxbzIsNotNull() {
            addCriterion("yxbz is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzEqualTo(String value) {
            addCriterion("yxbz =", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotEqualTo(String value) {
            addCriterion("yxbz <>", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThan(String value) {
            addCriterion("yxbz >", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzGreaterThanOrEqualTo(String value) {
            addCriterion("yxbz >=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThan(String value) {
            addCriterion("yxbz <", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLessThanOrEqualTo(String value) {
            addCriterion("yxbz <=", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzLike(String value) {
            addCriterion("yxbz like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotLike(String value) {
            addCriterion("yxbz not like", value, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzIn(List<String> values) {
            addCriterion("yxbz in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotIn(List<String> values) {
            addCriterion("yxbz not in", values, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzBetween(String value1, String value2) {
            addCriterion("yxbz between", value1, value2, "yxbz");
            return (Criteria) this;
        }

        public Criteria andYxbzNotBetween(String value1, String value2) {
            addCriterion("yxbz not between", value1, value2, "yxbz");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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