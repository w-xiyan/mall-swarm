package com.macro.mail;

import com.macro.mall.controller.UmsAdminController;
import com.macro.mall.dto.UmsAdminLoginParam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Configurable;

import javax.annotation.Resource;

/**
 * @author wangp
 * @date 2022/5/27
 * @description
 */
@Configurable
public class LoginTest extends CommonApplicationTests{

    @Resource
    private UmsAdminController umsAdminController;

    @Test
    public void login(){
        UmsAdminLoginParam umsAdminLoginParam = new UmsAdminLoginParam();
        umsAdminLoginParam.setUsername("admin");
        umsAdminLoginParam.setPassword("macro123");
        umsAdminController.login(umsAdminLoginParam);
    }


}
