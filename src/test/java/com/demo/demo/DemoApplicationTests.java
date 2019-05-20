package com.demo.demo;

import com.demo.entrty.Proson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 * springboot的测试组件
 * @RunWith(SpringRunner.class)：指用的是spring
 * @SpringBootTest：springboot的测试类
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    //日志记录器
    org.slf4j.Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
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

    /**
     * 日志学习测试
     */
    @Test
    public void textLog(){
        //springboot默认日志为：info级别，如需高级别可以到配置文件中配置
        logger.trace("这是trace日志。。。。");
        logger.debug("这是debuger日志。。。");
        logger.info("这是info日志。。。");
        logger.warn("这是warn日志。。。");
        logger.error("这是error日志。。。");
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
