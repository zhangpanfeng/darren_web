package com.darren.web.user.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.darren.comm.exception.BusinessException;
import com.darren.web.base.dao.BaseDao;
import com.darren.web.user.dao.UserDao;
import com.darren.web.user.po.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    public List<User> readAllUsers() throws BusinessException {
        List<User> result = super.readAllEntitys("readAllUsers");

        return result;
    }

    public void createUser(User user) throws BusinessException {
        super.createEntity("createUser", user);
    }

    public User readUserByParams(Map<String, Object> params) throws BusinessException {
        User result = (User) super.readEntityByParams("readUserByParams", params);

        return result;
    }

}
