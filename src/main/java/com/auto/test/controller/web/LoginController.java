package com.auto.test.controller.web;

import com.alibaba.druid.util.StringUtils;
import com.auto.test.common.CommonResult;
import com.auto.test.entity.LoginRequest;
import com.auto.test.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserManager userManager;

    @PostMapping(value = "/user/login")
    public CommonResult<String> login(@RequestBody LoginRequest request){
        String token = userManager.login(request.getUsername(), request.getPassword());
        if(!StringUtils.isEmpty(token)){
            return CommonResult.success(token);
        }else{
            //登陆失败
            return  CommonResult.failed();
        }

    }
}
