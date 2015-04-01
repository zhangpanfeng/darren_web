package com.darren.web.user.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darren.comm.exception.BusinessException;
import com.darren.comm.utils.MD5;
import com.darren.web.user.dao.UserDao;
import com.darren.web.user.po.User;
import com.darren.web.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private static final Log LOG = LogFactory.getLog(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    public List<User> readAllUsers() throws BusinessException {
        List<User> result = null;
        try {
            result = userDao.readAllUsers();
        } catch (BusinessException e) {
            LOG.error(e);
            throw e;
        }

        return result;
    }

    public String createUser(User user) throws BusinessException {
        String result = null;
        try {
            user.setId(UUID.randomUUID().toString());
            user.setPassword(MD5.md5(user.getPassword()));
            user.setCreateTime(new Date());
            userDao.createUser(user);
            result = user.getId();
        } catch (BusinessException e) {
            LOG.error(e);
            throw e;
        }

        return result;
    }

    public User readUserByNameAndPassword(User user) throws BusinessException {
        User result = null;
        Map<String, Object> params = new HashMap<String, Object>();
        try {
            params.put("userName", user.getUserName());
            params.put("password", MD5.md5(user.getPassword()));
            result = userDao.readUserByParams(params);
        } catch (BusinessException e) {
            LOG.error(e);
            throw e;
        }

        return result;
    }
}
