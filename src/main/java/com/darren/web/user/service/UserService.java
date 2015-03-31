package com.darren.web.user.service;

import java.util.List;

import com.darren.comm.exception.BusinessException;
import com.darren.web.user.po.User;

public interface UserService {
    /**
     * 查询所有的用户
     * 
     * @return 所有的用户
     * @throws BusinessException
     */
    List<User> readAllUsers() throws BusinessException;
}
