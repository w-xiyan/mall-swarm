package com.macro.mail;

import com.macro.mall.MallAdminApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/**
 * @author wangp
 * @date 2022/5/27
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MallAdminApplication.class)
@ContextConfiguration
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。

@WebAppConfiguration
public class CommonApplicationTests {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @Test
    public void test() throws InterruptedException {}
}
