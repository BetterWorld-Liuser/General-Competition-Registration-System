package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class LoginController {


    @Autowired
    LoginService loginService;
    /**
     * admin login:管理人员登录
     * @param id
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
    String login(@RequestParam String id, @RequestParam String password) {


        int respons = loginService.adminLogin(id, password);

        if (respons == 1 ) return "管理员登录成功";

        return "登录失败,请重试";
    }


    /**
     * 注册admin
     * @param id
     * @param password
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
    String register(@RequestParam String id, @RequestParam String password) {

        int respons = loginService.adminRegister(id, password);

        if (respons == 1 ) return "注册管理员成功";
        if (respons == 2 ) return "此账号id已被注册，请更换id";

        return "注册失败,请重试";
    }

}
