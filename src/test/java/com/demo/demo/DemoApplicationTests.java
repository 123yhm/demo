package com.demo.demo;

import com.demo.entrty.Proson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot的测试组件
 * @RunWith(SpringRunner.class)：指用的是spring
 * @SpringBootTest：springboot的测试类
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Proson proson;//注入实体类对象
    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testHelloService(){
        //System.out.println("正在测试配置文件添加Helloservice组件");
        Boolean bool=ioc.containsBean("helloService");
        System.out.println(bool);
    }
    @Test
    public void contextLoads() {
        System.out.println(proson);
    }


    @Test
    public void testJava(){
        //数组一requestArr、数组二requestArr2、合并数组：arrayRequestId
        Integer[] requestArr={};
        Integer[] requestArr2={};
        Integer[] arrayRequestId=new Integer[requestArr.length+requestArr2.length];
        for (int i = 0; i < arrayRequestId.length; i++) {
            if (i < requestArr.length) {
                arrayRequestId[i] = requestArr[i];
            } else {
                arrayRequestId[i] = requestArr2[i - requestArr.length];
            }
        }
    }

}
