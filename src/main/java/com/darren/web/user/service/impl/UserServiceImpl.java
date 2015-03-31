package com.darren.web.user.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darren.comm.exception.BusinessException;
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
}
