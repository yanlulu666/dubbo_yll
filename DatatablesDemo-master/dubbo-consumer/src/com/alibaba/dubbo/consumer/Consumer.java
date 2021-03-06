package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/resources/consumer.xml");
        context.start();
        System.out.println("consumer start");
        //        DemoService demoService = context.getBean(DemoService.class);
        DemoService demoService = (DemoService) context.getBean("testService");
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
