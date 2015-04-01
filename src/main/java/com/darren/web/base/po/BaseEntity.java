package com.darren.web.base.po;

import java.util.Date;

public class BaseEntity {
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 更新时间
     */
    protected Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
