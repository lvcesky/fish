package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod 这是在测试方案之前云运行的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("aftermethod 这是在测试方法运行之后执行的方法");
    }
}
