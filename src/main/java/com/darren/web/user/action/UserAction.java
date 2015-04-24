package com.darren.web.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darren.comm.client.user.service.UserClientService;
import com.darren.comm.exception.BusinessException;
import com.darren.comm.user.po.User;
import com.darren.comm.utils.StringUtil;
import com.darren.comm.vo.ClientMessage;
import com.darren.comm.vo.ResultHandle;

/**
 * 用户控制器
 * 
 * @author zhangpanfeng
 * 
 */
@Controller
public class UserAction {
    /**
     * 注入远程用户服务
     */
    @Autowired
    private UserClientService userClientService;

    @RequestMapping(value = "/login")
    public String login(Model model, User user) throws BusinessException {
        ClientMessage clientMessage = new ClientMessage();
        String target = "/home";
        if (user != null) {
            ResultHandle<User> resultHandle = userClientService.findUserByNameAndPassword(user.getUserName(),
                    user.getPassword());
            user = resultHandle.getContent();
            boolean result = resultHandle.isSuccess();
            // 请求失败
            if (!result) {
                BusinessException exception = new BusinessException(resultHandle.getErrorCode(),
                        resultHandle.getMessage());
                throw exception;
            } else {
                if (user == null) {
                    target = "/error";
                    clientMessage.setMessage("登陆失败！");
                    clientMessage.setHref("index.jsp");
                    clientMessage.setTarget("首页");
                }
            }
        } else {
            target = "/error";
            clientMessage.setMessage("登陆失败！");
            clientMessage.setHref("index.jsp");
            clientMessage.setTarget("首页");
        }

        model.addAttribute("user", user);
        model.addAttribute("clientMessage", clientMessage);

        return target;
    }

    @RequestMapping(value = "/goRegister")
    public String goRegister() {

        return "/register";
    }

    @RequestMapping(value = "/register")
    public String register(Model model, User user) throws BusinessException {
        ClientMessage clientMessage = new ClientMessage();
        clientMessage.setMessage("注册成功！");
        clientMessage.setHref("index.jsp");
        clientMessage.setTarget("首页");
        String target = "/success";
        String userId = null;

        if (!StringUtil.isEmpty(user.getPassword()) && user.getPassword().equals(user.getConfirmPassword())) {
            // userId = userService.createUser(user);
        } else {
            target = "/error";
            clientMessage.setMessage("注册失败！");
        }

        if (userId == null) {
            // 创建失败
            target = "/error";
            clientMessage.setMessage("注册失败！");
        }
        model.addAttribute("clientMessage", clientMessage);

        return target;
    }
}
