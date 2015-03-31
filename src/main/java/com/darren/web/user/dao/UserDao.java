package com.darren.web.user.dao;

import java.util.List;

import com.darren.comm.exception.BusinessException;
import com.darren.web.user.po.User;

public interface UserDao {
    /**
     * 查询所有的用户信息
     * 
     * @return 所有的用户信息
     * @throws BusinessException
     */
    List<User> readAllUsers() throws BusinessException;
}
