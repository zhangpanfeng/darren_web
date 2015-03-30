package com.darren.web.base.dao;

import java.util.List;
import java.util.Map;

import com.darren.web.base.po.BaseEntity;

public abstract class BaseDao {

    public String createEntity(String key, BaseEntity entity) {

        return null;
    }

    public void updateEntity(String key, BaseEntity entity) {

    }

    public BaseEntity readEntityById(String key, String id) {

        return null;
    }

    public BaseEntity readEntityByParams(String key, Map<String, Object> params) {

        return null;
    }

    public List<BaseEntity> readAllEntitys(String key) {

        return null;
    }

    public List<BaseEntity> readEntitysByParams(String key, Map<String, Object> params) {

        return null;
    }

    public void deleteEntity(String key, String id) {

    }
}
