package com.demo.entity;

/**
 * @Auther: Administrator
 * @Date: 2019-05-23 22:19
 * @Description:实体类
 *
 *
 * */
public class Person {
    private  Integer perId;
    private String perName;
    private Integer perAge;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public Integer getPerAge() {
        return perAge;
    }

    public void setPerAge(Integer perAge) {
        this.perAge = perAge;
    }
}
