package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreIdIsNull() {
            addCriterion("are_id is null");
            return (Criteria) this;
        }

        public Criteria andAreIdIsNotNull() {
            addCriterion("are_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreIdEqualTo(Integer value) {
            addCriterion("are_id =", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdNotEqualTo(Integer value) {
            addCriterion("are_id <>", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdGreaterThan(Integer value) {
            addCriterion("are_id >", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("are_id >=", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdLessThan(Integer value) {
            addCriterion("are_id <", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdLessThanOrEqualTo(Integer value) {
            addCriterion("are_id <=", value, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdIn(List<Integer> values) {
            addCriterion("are_id in", values, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdNotIn(List<Integer> values) {
            addCriterion("are_id not in", values, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdBetween(Integer value1, Integer value2) {
            addCriterion("are_id between", value1, value2, "areId");
            return (Criteria) this;
        }

        public Criteria andAreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("are_id not between", value1, value2, "areId");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeIsNull() {
            addCriterion("area_describe is null");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeIsNotNull() {
            addCriterion("area_describe is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeEqualTo(String value) {
            addCriterion("area_describe =", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeNotEqualTo(String value) {
            addCriterion("area_describe <>", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeGreaterThan(String value) {
            addCriterion("area_describe >", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("area_describe >=", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeLessThan(String value) {
            addCriterion("area_describe <", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeLessThanOrEqualTo(String value) {
            addCriterion("area_describe <=", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeLike(String value) {
            addCriterion("area_describe like", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeNotLike(String value) {
            addCriterion("area_describe not like", value, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeIn(List<String> values) {
            addCriterion("area_describe in", values, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeNotIn(List<String> values) {
            addCriterion("area_describe not in", values, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeBetween(String value1, String value2) {
            addCriterion("area_describe between", value1, value2, "areaDescribe");
            return (Criteria) this;
        }

        public Criteria andAreaDescribeNotBetween(String value1, String value2) {
            addCriterion("area_describe not between", value1, value2, "areaDescribe");
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