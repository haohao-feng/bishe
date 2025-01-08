package com.ruoyi.announcement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 通知公告对象 annoucement
 * 
 * @author ruoyi
 * @date 2025-02-03
 */
public class Annoucement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long announcementId;

    /** 通知或公告标题 */
    @Excel(name = "通知或公告标题")
    private String title;

    /** 通知或公告内容 */
    @Excel(name = "通知或公告内容")
    private String content;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    /** 发布人 */
    @Excel(name = "发布人")
    private String publisher;

    /** 状态 */
    @Excel(name = "状态")
    private String stasus;

    /** 通知or公告 */
    @Excel(name = "通知or公告")
    private String type;

    public void setAnnouncementId(Long announcementId) 
    {
        this.announcementId = announcementId;
    }

    public Long getAnnouncementId() 
    {
        return announcementId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setPublishTime(Date publishTime) 
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() 
    {
        return publishTime;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }
    public void setStasus(String stasus) 
    {
        this.stasus = stasus;
    }

    public String getStasus() 
    {
        return stasus;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("announcementId", getAnnouncementId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("publishTime", getPublishTime())
            .append("publisher", getPublisher())
            .append("stasus", getStasus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("type", getType())
            .toString();
    }
}
