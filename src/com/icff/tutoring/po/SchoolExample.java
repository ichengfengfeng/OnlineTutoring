package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andScuuidIsNull() {
            addCriterion("scuuid is null");
            return (Criteria) this;
        }

        public Criteria andScuuidIsNotNull() {
            addCriterion("scuuid is not null");
            return (Criteria) this;
        }

        public Criteria andScuuidEqualTo(String value) {
            addCriterion("scuuid =", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidNotEqualTo(String value) {
            addCriterion("scuuid <>", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidGreaterThan(String value) {
            addCriterion("scuuid >", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidGreaterThanOrEqualTo(String value) {
            addCriterion("scuuid >=", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidLessThan(String value) {
            addCriterion("scuuid <", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidLessThanOrEqualTo(String value) {
            addCriterion("scuuid <=", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidLike(String value) {
            addCriterion("scuuid like", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidNotLike(String value) {
            addCriterion("scuuid not like", value, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidIn(List<String> values) {
            addCriterion("scuuid in", values, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidNotIn(List<String> values) {
            addCriterion("scuuid not in", values, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidBetween(String value1, String value2) {
            addCriterion("scuuid between", value1, value2, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScuuidNotBetween(String value1, String value2) {
            addCriterion("scuuid not between", value1, value2, "scuuid");
            return (Criteria) this;
        }

        public Criteria andScnameIsNull() {
            addCriterion("scname is null");
            return (Criteria) this;
        }

        public Criteria andScnameIsNotNull() {
            addCriterion("scname is not null");
            return (Criteria) this;
        }

        public Criteria andScnameEqualTo(String value) {
            addCriterion("scname =", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotEqualTo(String value) {
            addCriterion("scname <>", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThan(String value) {
            addCriterion("scname >", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThanOrEqualTo(String value) {
            addCriterion("scname >=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThan(String value) {
            addCriterion("scname <", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThanOrEqualTo(String value) {
            addCriterion("scname <=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLike(String value) {
            addCriterion("scname like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotLike(String value) {
            addCriterion("scname not like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameIn(List<String> values) {
            addCriterion("scname in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotIn(List<String> values) {
            addCriterion("scname not in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameBetween(String value1, String value2) {
            addCriterion("scname between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotBetween(String value1, String value2) {
            addCriterion("scname not between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScdescIsNull() {
            addCriterion("scdesc is null");
            return (Criteria) this;
        }

        public Criteria andScdescIsNotNull() {
            addCriterion("scdesc is not null");
            return (Criteria) this;
        }

        public Criteria andScdescEqualTo(String value) {
            addCriterion("scdesc =", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescNotEqualTo(String value) {
            addCriterion("scdesc <>", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescGreaterThan(String value) {
            addCriterion("scdesc >", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescGreaterThanOrEqualTo(String value) {
            addCriterion("scdesc >=", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescLessThan(String value) {
            addCriterion("scdesc <", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescLessThanOrEqualTo(String value) {
            addCriterion("scdesc <=", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescLike(String value) {
            addCriterion("scdesc like", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescNotLike(String value) {
            addCriterion("scdesc not like", value, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescIn(List<String> values) {
            addCriterion("scdesc in", values, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescNotIn(List<String> values) {
            addCriterion("scdesc not in", values, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescBetween(String value1, String value2) {
            addCriterion("scdesc between", value1, value2, "scdesc");
            return (Criteria) this;
        }

        public Criteria andScdescNotBetween(String value1, String value2) {
            addCriterion("scdesc not between", value1, value2, "scdesc");
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