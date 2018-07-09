package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StuannouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuannouncementExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuannouuidIsNull() {
            addCriterion("stuannouuid is null");
            return (Criteria) this;
        }

        public Criteria andStuannouuidIsNotNull() {
            addCriterion("stuannouuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuannouuidEqualTo(String value) {
            addCriterion("stuannouuid =", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidNotEqualTo(String value) {
            addCriterion("stuannouuid <>", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidGreaterThan(String value) {
            addCriterion("stuannouuid >", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidGreaterThanOrEqualTo(String value) {
            addCriterion("stuannouuid >=", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidLessThan(String value) {
            addCriterion("stuannouuid <", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidLessThanOrEqualTo(String value) {
            addCriterion("stuannouuid <=", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidLike(String value) {
            addCriterion("stuannouuid like", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidNotLike(String value) {
            addCriterion("stuannouuid not like", value, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidIn(List<String> values) {
            addCriterion("stuannouuid in", values, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidNotIn(List<String> values) {
            addCriterion("stuannouuid not in", values, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidBetween(String value1, String value2) {
            addCriterion("stuannouuid between", value1, value2, "stuannouuid");
            return (Criteria) this;
        }

        public Criteria andStuannouuidNotBetween(String value1, String value2) {
            addCriterion("stuannouuid not between", value1, value2, "stuannouuid");
            return (Criteria) this;
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

        public Criteria andOtherDescIsNull() {
            addCriterion("other_desc is null");
            return (Criteria) this;
        }

        public Criteria andOtherDescIsNotNull() {
            addCriterion("other_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDescEqualTo(String value) {
            addCriterion("other_desc =", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotEqualTo(String value) {
            addCriterion("other_desc <>", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescGreaterThan(String value) {
            addCriterion("other_desc >", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescGreaterThanOrEqualTo(String value) {
            addCriterion("other_desc >=", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLessThan(String value) {
            addCriterion("other_desc <", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLessThanOrEqualTo(String value) {
            addCriterion("other_desc <=", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescLike(String value) {
            addCriterion("other_desc like", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotLike(String value) {
            addCriterion("other_desc not like", value, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescIn(List<String> values) {
            addCriterion("other_desc in", values, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotIn(List<String> values) {
            addCriterion("other_desc not in", values, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescBetween(String value1, String value2) {
            addCriterion("other_desc between", value1, value2, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andOtherDescNotBetween(String value1, String value2) {
            addCriterion("other_desc not between", value1, value2, "otherDesc");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andPubdateIsNull() {
            addCriterion("pubdate is null");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNotNull() {
            addCriterion("pubdate is not null");
            return (Criteria) this;
        }

        public Criteria andPubdateEqualTo(Date value) {
            addCriterionForJDBCDate("pubdate =", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pubdate <>", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThan(Date value) {
            addCriterionForJDBCDate("pubdate >", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pubdate >=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThan(Date value) {
            addCriterionForJDBCDate("pubdate <", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pubdate <=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateIn(List<Date> values) {
            addCriterionForJDBCDate("pubdate in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pubdate not in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pubdate between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pubdate not between", value1, value2, "pubdate");
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