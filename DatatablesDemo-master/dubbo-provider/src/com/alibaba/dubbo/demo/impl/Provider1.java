package com.alibaba.dubbo.demo.impl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wy on 2017/4/13.
 */
public class Provider1 {
  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resources/provider.xml");
    System.out.println(context.getDisplayName() + ": here");
    context.start();
    System.out.println("服务已经启动...");
    System.in.read();
  }
}
