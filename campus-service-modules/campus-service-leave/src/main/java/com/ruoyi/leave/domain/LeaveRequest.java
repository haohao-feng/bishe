package com.ruoyi.leave.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 请假管理服务对象 leave_request
 * 
 * @author wwf
 * @date 2025-02-09
 */
public class LeaveRequest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 申请id */
    private Long id;

    /** 学生id */
    @Excel(name = "学生id")
    private Long studentId;

    /** 请假类型 */
    @Excel(name = "请假类型")
    private String leaveType;

    /** 请假开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "请假开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 请假结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "请假结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 请假原因 */
    @Excel(name = "请假原因")
    private String reason;

    /** 审批状态 */
    @Excel(name = "审批状态")
    private String status;

    /** 审批人id */
    @Excel(name = "审批人id")
    private Long approverId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setLeaveType(String leaveType) 
    {
        this.leaveType = leaveType;
    }

    public String getLeaveType() 
    {
        return leaveType;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setApproverId(Long approverId) 
    {
        this.approverId = approverId;
    }

    public Long getApproverId() 
    {
        return approverId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("leaveType", getLeaveType())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("reason", getReason())
            .append("status", getStatus())
            .append("approverId", getApproverId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
