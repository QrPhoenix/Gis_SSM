package com.gis.db.model;

import java.util.ArrayList;
import java.util.List;

public class MarksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarksExample() {
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

        public Criteria andDetailsidIsNull() {
            addCriterion("detailsid is null");
            return (Criteria) this;
        }

        public Criteria andDetailsidIsNotNull() {
            addCriterion("detailsid is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsidEqualTo(Integer value) {
            addCriterion("detailsid =", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotEqualTo(Integer value) {
            addCriterion("detailsid <>", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThan(Integer value) {
            addCriterion("detailsid >", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailsid >=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThan(Integer value) {
            addCriterion("detailsid <", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("detailsid <=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidIn(List<Integer> values) {
            addCriterion("detailsid in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotIn(List<Integer> values) {
            addCriterion("detailsid not in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidBetween(Integer value1, Integer value2) {
            addCriterion("detailsid between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("detailsid not between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("family is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("family is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("family =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("family <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("family >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("family >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("family <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("family <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("family like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("family not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("family in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("family not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("family between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("family not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andGrouperIsNull() {
            addCriterion("grouper is null");
            return (Criteria) this;
        }

        public Criteria andGrouperIsNotNull() {
            addCriterion("grouper is not null");
            return (Criteria) this;
        }

        public Criteria andGrouperEqualTo(String value) {
            addCriterion("grouper =", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperNotEqualTo(String value) {
            addCriterion("grouper <>", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperGreaterThan(String value) {
            addCriterion("grouper >", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperGreaterThanOrEqualTo(String value) {
            addCriterion("grouper >=", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperLessThan(String value) {
            addCriterion("grouper <", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperLessThanOrEqualTo(String value) {
            addCriterion("grouper <=", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperLike(String value) {
            addCriterion("grouper like", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperNotLike(String value) {
            addCriterion("grouper not like", value, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperIn(List<String> values) {
            addCriterion("grouper in", values, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperNotIn(List<String> values) {
            addCriterion("grouper not in", values, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperBetween(String value1, String value2) {
            addCriterion("grouper between", value1, value2, "grouper");
            return (Criteria) this;
        }

        public Criteria andGrouperNotBetween(String value1, String value2) {
            addCriterion("grouper not between", value1, value2, "grouper");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andLanguagerIsNull() {
            addCriterion("languager is null");
            return (Criteria) this;
        }

        public Criteria andLanguagerIsNotNull() {
            addCriterion("languager is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagerEqualTo(String value) {
            addCriterion("languager =", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerNotEqualTo(String value) {
            addCriterion("languager <>", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerGreaterThan(String value) {
            addCriterion("languager >", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerGreaterThanOrEqualTo(String value) {
            addCriterion("languager >=", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerLessThan(String value) {
            addCriterion("languager <", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerLessThanOrEqualTo(String value) {
            addCriterion("languager <=", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerLike(String value) {
            addCriterion("languager like", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerNotLike(String value) {
            addCriterion("languager not like", value, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerIn(List<String> values) {
            addCriterion("languager in", values, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerNotIn(List<String> values) {
            addCriterion("languager not in", values, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerBetween(String value1, String value2) {
            addCriterion("languager between", value1, value2, "languager");
            return (Criteria) this;
        }

        public Criteria andLanguagerNotBetween(String value1, String value2) {
            addCriterion("languager not between", value1, value2, "languager");
            return (Criteria) this;
        }

        public Criteria andLocalismIsNull() {
            addCriterion("localism is null");
            return (Criteria) this;
        }

        public Criteria andLocalismIsNotNull() {
            addCriterion("localism is not null");
            return (Criteria) this;
        }

        public Criteria andLocalismEqualTo(String value) {
            addCriterion("localism =", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismNotEqualTo(String value) {
            addCriterion("localism <>", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismGreaterThan(String value) {
            addCriterion("localism >", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismGreaterThanOrEqualTo(String value) {
            addCriterion("localism >=", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismLessThan(String value) {
            addCriterion("localism <", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismLessThanOrEqualTo(String value) {
            addCriterion("localism <=", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismLike(String value) {
            addCriterion("localism like", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismNotLike(String value) {
            addCriterion("localism not like", value, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismIn(List<String> values) {
            addCriterion("localism in", values, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismNotIn(List<String> values) {
            addCriterion("localism not in", values, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismBetween(String value1, String value2) {
            addCriterion("localism between", value1, value2, "localism");
            return (Criteria) this;
        }

        public Criteria andLocalismNotBetween(String value1, String value2) {
            addCriterion("localism not between", value1, value2, "localism");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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