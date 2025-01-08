package com.ruoyi.lost.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 失物招领服务对象 lost_and_found
 * 
 * @author wwf
 * @date 2025-02-09
 */
public class LostAndFound extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long lostId;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 物品描述 */
    @Excel(name = "物品描述")
    private String description;

    /** 物品丢失地点 */
    @Excel(name = "物品丢失地点")
    private String location;

    /** 联系人方式 */
    @Excel(name = "联系人方式")
    private String contact;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setLostId(Long lostId) 
    {
        this.lostId = lostId;
    }

    public Long getLostId() 
    {
        return lostId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("lostId", getLostId())
            .append("title", getTitle())
            .append("description", getDescription())
            .append("location", getLocation())
            .append("contact", getContact())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
