package com.company.action;

import com.company.framework.annotation.Autowired;
import com.company.framework.annotation.Controller;
import com.company.framework.annotation.RequestMapping;
import com.company.framework.annotation.RequestParam;
import com.company.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserAction {
    @Autowired
    UserService userService;

    @RequestMapping("/query.do")
    public void query(HttpServletRequest request, HttpServletResponse response) {
        String result = "Welcome " + userService.getUserName() + "!";
        try {
            response.getWriter().println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/add.do")
    public void add(HttpServletRequest request,
                    HttpServletResponse response,
                    @RequestParam Integer a, @RequestParam Integer b) {
        try {
            response
                    .getWriter().println("a+b=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
