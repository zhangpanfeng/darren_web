package com.darren.web.user.dao;

import java.util.List;
import java.util.Map;

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

    /**
     * 创建用户
     * 
     * @param user
     *            用户信息
     * @throws BusinessException
     */
    void createUser(User user) throws BusinessException;

    /**
     * 根据参数查询一个用户
     * 
     * @param params
     *            参数
     * @return 用户信息
     * @throws BusinessException
     */
    User readUserByParams(Map<String, Object> params) throws BusinessException;
}
