package top.zjjacky.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class LoginController {

    //登陆页面action请求
    @RequestMapping("/success")
    public String success(HttpSession session, String username) {
        //把用户的信息存在session中
        session.setAttribute("userLoginInfo",username);
        return "main";
    }

    //注销
    @RequestMapping("/writeOff")
    public String writeOff(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("aaa");
        //移除session
        session.removeAttribute("userLoginInfo");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return "main";
    }

    //登陆页面
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //首页
    @RequestMapping("/main")
    public String main() {
        return "main";
    }
}
