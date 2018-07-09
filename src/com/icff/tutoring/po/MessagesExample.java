package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.List;

public class MessagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessagesExample() {
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

        public Criteria andLyidIsNull() {
            addCriterion("lyid is null");
            return (Criteria) this;
        }

        public Criteria andLyidIsNotNull() {
            addCriterion("lyid is not null");
            return (Criteria) this;
        }

        public Criteria andLyidEqualTo(String value) {
            addCriterion("lyid =", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidNotEqualTo(String value) {
            addCriterion("lyid <>", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidGreaterThan(String value) {
            addCriterion("lyid >", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidGreaterThanOrEqualTo(String value) {
            addCriterion("lyid >=", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidLessThan(String value) {
            addCriterion("lyid <", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidLessThanOrEqualTo(String value) {
            addCriterion("lyid <=", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidLike(String value) {
            addCriterion("lyid like", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidNotLike(String value) {
            addCriterion("lyid not like", value, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidIn(List<String> values) {
            addCriterion("lyid in", values, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidNotIn(List<String> values) {
            addCriterion("lyid not in", values, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidBetween(String value1, String value2) {
            addCriterion("lyid between", value1, value2, "lyid");
            return (Criteria) this;
        }

        public Criteria andLyidNotBetween(String value1, String value2) {
            addCriterion("lyid not between", value1, value2, "lyid");
            return (Criteria) this;
        }

        public Criteria andStuuuidIsNull() {
            addCriterion("stuuuid is null");
            return (Criteria) this;
        }

        public Criteria andStuuuidIsNotNull() {
            addCriterion("stuuuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuuuidEqualTo(String value) {
            addCriterion("stuuuid =", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidNotEqualTo(String value) {
            addCriterion("stuuuid <>", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidGreaterThan(String value) {
            addCriterion("stuuuid >", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidGreaterThanOrEqualTo(String value) {
            addCriterion("stuuuid >=", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidLessThan(String value) {
            addCriterion("stuuuid <", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidLessThanOrEqualTo(String value) {
            addCriterion("stuuuid <=", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidLike(String value) {
            addCriterion("stuuuid like", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidNotLike(String value) {
            addCriterion("stuuuid not like", value, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidIn(List<String> values) {
            addCriterion("stuuuid in", values, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidNotIn(List<String> values) {
            addCriterion("stuuuid not in", values, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidBetween(String value1, String value2) {
            addCriterion("stuuuid between", value1, value2, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andStuuuidNotBetween(String value1, String value2) {
            addCriterion("stuuuid not between", value1, value2, "stuuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidIsNull() {
            addCriterion("teacuuid is null");
            return (Criteria) this;
        }

        public Criteria andTeacuuidIsNotNull() {
            addCriterion("teacuuid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacuuidEqualTo(String value) {
            addCriterion("teacuuid =", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidNotEqualTo(String value) {
            addCriterion("teacuuid <>", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidGreaterThan(String value) {
            addCriterion("teacuuid >", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidGreaterThanOrEqualTo(String value) {
            addCriterion("teacuuid >=", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidLessThan(String value) {
            addCriterion("teacuuid <", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidLessThanOrEqualTo(String value) {
            addCriterion("teacuuid <=", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidLike(String value) {
            addCriterion("teacuuid like", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidNotLike(String value) {
            addCriterion("teacuuid not like", value, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidIn(List<String> values) {
            addCriterion("teacuuid in", values, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidNotIn(List<String> values) {
            addCriterion("teacuuid not in", values, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidBetween(String value1, String value2) {
            addCriterion("teacuuid between", value1, value2, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andTeacuuidNotBetween(String value1, String value2) {
            addCriterion("teacuuid not between", value1, value2, "teacuuid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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