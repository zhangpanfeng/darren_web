package com.darren.web.base.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.darren.comm.exception.BusinessException;
import com.darren.comm.exception.ErrorCode;
import com.darren.comm.exception.ErrorMessage;
import com.darren.web.base.po.BaseEntity;

public class BaseDao {
    /**
     * session 模板
     */
    @Autowired
    private SqlSessionTemplate sqlSession;

    protected void createEntity(String key, BaseEntity entity) throws BusinessException {
        try {
            this.sqlSession.insert(key, entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.CREATE_ERROR, ErrorMessage.CREATE_ERROR("createEntity", entity));
        }
    }

    protected void updateEntity(String key, BaseEntity entity) throws BusinessException {
        try {
            this.sqlSession.update(key, entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.UPDATE_ERROR, ErrorMessage.UPDATE_ERROR("updateEntity", entity));
        }
    }

    protected BaseEntity readEntityById(String key, String id) throws BusinessException {
        BaseEntity result = null;
        try {
            result = this.sqlSession.selectOne(key, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.READ_ERROR, ErrorMessage.READ_ERROR("readEntityById", id));
        }

        return result;
    }

    protected BaseEntity readEntityByParams(String key, Map<String, Object> params) throws BusinessException {
        BaseEntity result = null;
        try {
            result = this.sqlSession.selectOne(key, params);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.READ_ERROR, ErrorMessage.READ_ERROR("readEntityByParams", params));
        }

        return result;
    }

    protected <T> List<T> readAllEntitys(String key) throws BusinessException {
        List<T> result = null;
        try {
            result = this.sqlSession.selectList(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.READ_ERROR, ErrorMessage.READ_ERROR("readAllEntitys", null));
        }

        return result;
    }

    protected <T> List<T> readEntitysByParams(String key, Map<String, Object> params) throws BusinessException {
        List<T> result = null;
        try {
            result = this.sqlSession.selectList(key, params);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.READ_ERROR, ErrorMessage.READ_ERROR("readEntitysByParams", params));
        }

        return result;
    }

    protected void deleteEntity(String key, String id) throws BusinessException {
        try {
            this.sqlSession.delete(key, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.DELETE_ERROR, ErrorMessage.DELETE_ERROR("deleteEntity", id));
        }
    }
}
