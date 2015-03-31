package com.darren.web.user.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darren.comm.exception.BusinessException;
import com.darren.web.user.po.User;
import com.darren.web.user.service.UserService;

@Controller
public class LoginAction {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(Model model, User user) throws BusinessException {
        model.addAttribute("user", user);
        model.addAttribute("xxx", "xxx");

        List<User> users = userService.readAllUsers();
        System.out.println(users);

        return "/home";
    }
}
