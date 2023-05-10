package com.hmdp;

import com.hmdp.dto.Result;
import com.hmdp.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@SpringBootTest
class HmDianPingApplicationTests {

    @Resource
    private IUserService userService;

    @Test
    public void testSendCode(){

        //userService.sendCode("13077072760" ) ;
        final Result result = userService.sendCode("12324156461");
        System.out.println(result.toString());
    }



}
