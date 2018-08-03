package com.alibaba.dubbo.consumer;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.demo.DemoService;
public class TestService  extends BaseJunitTest{
    private static Logger logger=Logger.getLogger(TestService.class);

    @Autowired
    private DemoService permissionService;

    @Test
    public void test(){
        //这里写你的测试代码
      System.out.println(permissionService.getPermissions(1L));
    }
}