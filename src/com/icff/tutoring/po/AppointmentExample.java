package com.icff.tutoring.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
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

        public Criteria andAppointmentidIsNull() {
            addCriterion("appointmentid is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentidIsNotNull() {
            addCriterion("appointmentid is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentidEqualTo(String value) {
            addCriterion("appointmentid =", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotEqualTo(String value) {
            addCriterion("appointmentid <>", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidGreaterThan(String value) {
            addCriterion("appointmentid >", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidGreaterThanOrEqualTo(String value) {
            addCriterion("appointmentid >=", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidLessThan(String value) {
            addCriterion("appointmentid <", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidLessThanOrEqualTo(String value) {
            addCriterion("appointmentid <=", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidLike(String value) {
            addCriterion("appointmentid like", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotLike(String value) {
            addCriterion("appointmentid not like", value, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidIn(List<String> values) {
            addCriterion("appointmentid in", values, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotIn(List<String> values) {
            addCriterion("appointmentid not in", values, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidBetween(String value1, String value2) {
            addCriterion("appointmentid between", value1, value2, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAppointmentidNotBetween(String value1, String value2) {
            addCriterion("appointmentid not between", value1, value2, "appointmentid");
            return (Criteria) this;
        }

        public Criteria andAnnoidIsNull() {
            addCriterion("annoid is null");
            return (Criteria) this;
        }

        public Criteria andAnnoidIsNotNull() {
            addCriterion("annoid is not null");
            return (Criteria) this;
        }

        public Criteria andAnnoidEqualTo(String value) {
            addCriterion("annoid =", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidNotEqualTo(String value) {
            addCriterion("annoid <>", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidGreaterThan(String value) {
            addCriterion("annoid >", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidGreaterThanOrEqualTo(String value) {
            addCriterion("annoid >=", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidLessThan(String value) {
            addCriterion("annoid <", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidLessThanOrEqualTo(String value) {
            addCriterion("annoid <=", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidLike(String value) {
            addCriterion("annoid like", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidNotLike(String value) {
            addCriterion("annoid not like", value, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidIn(List<String> values) {
            addCriterion("annoid in", values, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidNotIn(List<String> values) {
            addCriterion("annoid not in", values, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidBetween(String value1, String value2) {
            addCriterion("annoid between", value1, value2, "annoid");
            return (Criteria) this;
        }

        public Criteria andAnnoidNotBetween(String value1, String value2) {
            addCriterion("annoid not between", value1, value2, "annoid");
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

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andClosingcostIsNull() {
            addCriterion("closingCost is null");
            return (Criteria) this;
        }

        public Criteria andClosingcostIsNotNull() {
            addCriterion("closingCost is not null");
            return (Criteria) this;
        }

        public Criteria andClosingcostEqualTo(Double value) {
            addCriterion("closingCost =", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotEqualTo(Double value) {
            addCriterion("closingCost <>", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostGreaterThan(Double value) {
            addCriterion("closingCost >", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostGreaterThanOrEqualTo(Double value) {
            addCriterion("closingCost >=", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostLessThan(Double value) {
            addCriterion("closingCost <", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostLessThanOrEqualTo(Double value) {
            addCriterion("closingCost <=", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostIn(List<Double> values) {
            addCriterion("closingCost in", values, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotIn(List<Double> values) {
            addCriterion("closingCost not in", values, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostBetween(Double value1, Double value2) {
            addCriterion("closingCost between", value1, value2, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotBetween(Double value1, Double value2) {
            addCriterion("closingCost not between", value1, value2, "closingcost");
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

        public Criteria andYytimeIsNull() {
            addCriterion("yytime is null");
            return (Criteria) this;
        }

        public Criteria andYytimeIsNotNull() {
            addCriterion("yytime is not null");
            return (Criteria) this;
        }

        public Criteria andYytimeEqualTo(Date value) {
            addCriterion("yytime =", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeNotEqualTo(Date value) {
            addCriterion("yytime <>", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeGreaterThan(Date value) {
            addCriterion("yytime >", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yytime >=", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeLessThan(Date value) {
            addCriterion("yytime <", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeLessThanOrEqualTo(Date value) {
            addCriterion("yytime <=", value, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeIn(List<Date> values) {
            addCriterion("yytime in", values, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeNotIn(List<Date> values) {
            addCriterion("yytime not in", values, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeBetween(Date value1, Date value2) {
            addCriterion("yytime between", value1, value2, "yytime");
            return (Criteria) this;
        }

        public Criteria andYytimeNotBetween(Date value1, Date value2) {
            addCriterion("yytime not between", value1, value2, "yytime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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