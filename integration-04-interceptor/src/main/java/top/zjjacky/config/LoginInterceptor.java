package top.zjjacky.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    //判断请求者是否处于登陆状态
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //请求登陆页面，或登陆成功，放行
        if (request.getRequestURI().contains("success") || request.getRequestURI().contains("login")){
            return true;
        }
        //如果session中存在一个叫userLoginInfo的session则说明用户已经登录过，放行
        if (session.getAttribute("userLoginInfo")!=null) {
            return true;
        }
        //不满足登陆状态，跳转到登录页
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
