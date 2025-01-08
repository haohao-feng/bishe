package com.ruoyi.course.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 课程管理服务对象 course
 * 
 * @author wwf
 * @date 2025-02-16
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课程id */
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程类型 */
    @Excel(name = "课程类型")
    private String courseType;

    /** 课程学时 */
    @Excel(name = "课程学时")
    private String courseTime;

    /** 任课教师ID */
    @Excel(name = "任课教师ID")
    private Long taecherId;

    /** 学分 */
    @Excel(name = "学分")
    private Long credit;

    /** 开课学期 */
    @Excel(name = "开课学期")
    private String semester;

    /** 课程状态(0:关闭，1:开启) */
    @Excel(name = "课程状态(0:关闭，1:开启)")
    private String status;

    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseType(String courseType) 
    {
        this.courseType = courseType;
    }

    public String getCourseType() 
    {
        return courseType;
    }
    public void setCourseTime(String courseTime) 
    {
        this.courseTime = courseTime;
    }

    public String getCourseTime() 
    {
        return courseTime;
    }
    public void setTaecherId(Long taecherId) 
    {
        this.taecherId = taecherId;
    }

    public Long getTaecherId() 
    {
        return taecherId;
    }
    public void setCredit(Long credit) 
    {
        this.credit = credit;
    }

    public Long getCredit() 
    {
        return credit;
    }
    public void setSemester(String semester) 
    {
        this.semester = semester;
    }

    public String getSemester() 
    {
        return semester;
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
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseType", getCourseType())
            .append("courseTime", getCourseTime())
            .append("taecherId", getTaecherId())
            .append("credit", getCredit())
            .append("semester", getSemester())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
