package com.example.session.controller;

import com.example.session.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RestController
public class LoginController {

    @RequestMapping("login")
    public String login(String name,String pwd,HttpServletRequest request) {
        HttpSession session = request.getSession();

        if(name.equals("lx")&&pwd.equals("lx")) {
            User user = new User();
            user.setName(name);
            session.setAttribute("user",user);
            return "登录成功";
        } else {
            return "用户名或密码错误!";
        }
    }
}
