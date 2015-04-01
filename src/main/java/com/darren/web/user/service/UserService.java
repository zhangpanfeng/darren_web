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

    /**
     * 创建用户
     * 
     * @param user
     *            用户信息
     * @return 用户ID
     * @throws BusinessException
     */
    String createUser(User user) throws BusinessException;

    /**
     * 根据用户名和密码查用户
     * 
     * @param user
     *            参数，包含用户名和密码
     * @return 用户信息
     * @throws BusinessException
     */
    User readUserByNameAndPassword(User user) throws BusinessException;
}
