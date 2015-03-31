package com.darren.web.user.dao.impl;

import java.util.List;

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

}
