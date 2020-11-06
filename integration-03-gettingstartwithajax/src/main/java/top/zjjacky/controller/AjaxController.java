package top.zjjacky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.zjjacky.pojo.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @RequestMapping("/t1")
    public String test1() {
        return "hello";
    }

    @RequestMapping("/t2")
    public String test() {
        return "hello2";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a:param=>"+name);
        if ("zjjacky".equals(name)){
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    //给前端返回数据
    @RequestMapping("/a2")
    @ResponseBody
    public List<User> a2() {
        List<User> userList = new ArrayList<>();
        //添加数据
        userList.add(new User("zjjacky",1,"男"));
        userList.add(new User("MrZhu",2,"男"));
        userList.add(new User("MrXie",3,"女"));
        return  userList;
    }

}
