package com.demo.entrty;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019-05-16 19:31
 * @Description:通过@ConfigurationProperties(prefix = "proson")注解批量获取值2、 @Value("${proson.last-name}")spring注解单独获取值
 * 还可以使用注解校验工具：对值进行校验:@Validated--@Email
 * @Component:建组建添加到容器中
 * @PropertySource:获取指定配置文件中的值，需要@ConfigurationProperties(prefix = "proson")注解配合
 *
 */
@Component
@PropertySource(value = {"classpath:person.properties"})
//@Validated
@ConfigurationProperties(prefix = "proson")
public class Proson {
    //@Email
   // @Value("${proson.last-name}")
    private String lastName;
  //  @Value("#{10*2}")
    private Integer age;
   // @Value("true")
    private Boolean boos;
    private Date birth;

    private Map<String,Object> mapv;
    private List<Object> listv;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoos() {
        return boos;
    }

    public void setBoos(Boolean boos) {
        this.boos = boos;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMapv() {
        return mapv;
    }

    public void setMapv(Map<String, Object> mapv) {
        this.mapv = mapv;
    }

    public List<Object> getListv() {
        return listv;
    }

    public void setListv(List<Object> listv) {
        this.listv = listv;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Proson{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", mapv=" + mapv +
                ", listv=" + listv +
                ", dog=" + dog +
                '}';
    }
}
