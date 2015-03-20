package com.darren.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darren.web.po.User;

@Controller
public class LoginAction {
    @RequestMapping(value = "/login")
    public String login(Model model, User user) {
        model.addAttribute("user", user);
        model.addAttribute("xxx", "xxx");

        return "/home";
    }
}
