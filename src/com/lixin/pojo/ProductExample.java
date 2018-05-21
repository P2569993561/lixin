package com.lixin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSellpointIsNull() {
            addCriterion("sellpoint is null");
            return (Criteria) this;
        }

        public Criteria andSellpointIsNotNull() {
            addCriterion("sellpoint is not null");
            return (Criteria) this;
        }

        public Criteria andSellpointEqualTo(String value) {
            addCriterion("sellpoint =", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotEqualTo(String value) {
            addCriterion("sellpoint <>", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointGreaterThan(String value) {
            addCriterion("sellpoint >", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointGreaterThanOrEqualTo(String value) {
            addCriterion("sellpoint >=", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLessThan(String value) {
            addCriterion("sellpoint <", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLessThanOrEqualTo(String value) {
            addCriterion("sellpoint <=", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLike(String value) {
            addCriterion("sellpoint like", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotLike(String value) {
            addCriterion("sellpoint not like", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointIn(List<String> values) {
            addCriterion("sellpoint in", values, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotIn(List<String> values) {
            addCriterion("sellpoint not in", values, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointBetween(String value1, String value2) {
            addCriterion("sellpoint between", value1, value2, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotBetween(String value1, String value2) {
            addCriterion("sellpoint not between", value1, value2, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOnemenuIsNull() {
            addCriterion("onemenu is null");
            return (Criteria) this;
        }

        public Criteria andOnemenuIsNotNull() {
            addCriterion("onemenu is not null");
            return (Criteria) this;
        }

        public Criteria andOnemenuEqualTo(String value) {
            addCriterion("onemenu =", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuNotEqualTo(String value) {
            addCriterion("onemenu <>", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuGreaterThan(String value) {
            addCriterion("onemenu >", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuGreaterThanOrEqualTo(String value) {
            addCriterion("onemenu >=", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuLessThan(String value) {
            addCriterion("onemenu <", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuLessThanOrEqualTo(String value) {
            addCriterion("onemenu <=", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuLike(String value) {
            addCriterion("onemenu like", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuNotLike(String value) {
            addCriterion("onemenu not like", value, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuIn(List<String> values) {
            addCriterion("onemenu in", values, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuNotIn(List<String> values) {
            addCriterion("onemenu not in", values, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuBetween(String value1, String value2) {
            addCriterion("onemenu between", value1, value2, "onemenu");
            return (Criteria) this;
        }

        public Criteria andOnemenuNotBetween(String value1, String value2) {
            addCriterion("onemenu not between", value1, value2, "onemenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuIsNull() {
            addCriterion("twomenu is null");
            return (Criteria) this;
        }

        public Criteria andTwomenuIsNotNull() {
            addCriterion("twomenu is not null");
            return (Criteria) this;
        }

        public Criteria andTwomenuEqualTo(String value) {
            addCriterion("twomenu =", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuNotEqualTo(String value) {
            addCriterion("twomenu <>", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuGreaterThan(String value) {
            addCriterion("twomenu >", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuGreaterThanOrEqualTo(String value) {
            addCriterion("twomenu >=", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuLessThan(String value) {
            addCriterion("twomenu <", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuLessThanOrEqualTo(String value) {
            addCriterion("twomenu <=", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuLike(String value) {
            addCriterion("twomenu like", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuNotLike(String value) {
            addCriterion("twomenu not like", value, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuIn(List<String> values) {
            addCriterion("twomenu in", values, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuNotIn(List<String> values) {
            addCriterion("twomenu not in", values, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuBetween(String value1, String value2) {
            addCriterion("twomenu between", value1, value2, "twomenu");
            return (Criteria) this;
        }

        public Criteria andTwomenuNotBetween(String value1, String value2) {
            addCriterion("twomenu not between", value1, value2, "twomenu");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCredtedIsNull() {
            addCriterion("credted is null");
            return (Criteria) this;
        }

        public Criteria andCredtedIsNotNull() {
            addCriterion("credted is not null");
            return (Criteria) this;
        }

        public Criteria andCredtedEqualTo(Date value) {
            addCriterion("credted =", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedNotEqualTo(Date value) {
            addCriterion("credted <>", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedGreaterThan(Date value) {
            addCriterion("credted >", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedGreaterThanOrEqualTo(Date value) {
            addCriterion("credted >=", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedLessThan(Date value) {
            addCriterion("credted <", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedLessThanOrEqualTo(Date value) {
            addCriterion("credted <=", value, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedIn(List<Date> values) {
            addCriterion("credted in", values, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedNotIn(List<Date> values) {
            addCriterion("credted not in", values, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedBetween(Date value1, Date value2) {
            addCriterion("credted between", value1, value2, "credted");
            return (Criteria) this;
        }

        public Criteria andCredtedNotBetween(Date value1, Date value2) {
            addCriterion("credted not between", value1, value2, "credted");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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