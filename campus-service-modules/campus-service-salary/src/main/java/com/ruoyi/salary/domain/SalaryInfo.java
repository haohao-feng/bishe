package com.ruoyi.salary.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 教师工资信息对象 salary_info
 * 
 * @author wwf
 * @date 2025-02-23
 */
public class SalaryInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录id */
    private Long id;

    /** 教师id */
    @Excel(name = "教师id")
    private Long teacherId;

    /** 工资月份 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "工资月份", width = 30, dateFormat = "yyyy-MM-dd")
    private Date salaryMonth;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private BigDecimal baseSalary;

    /** 奖金 */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    /** 扣款 */
    @Excel(name = "扣款")
    private BigDecimal deduction;

    /** 实发工资 */
    @Excel(name = "实发工资")
    private BigDecimal totalSalary;

    /** 工资状态 */
    @Excel(name = "工资状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setSalaryMonth(Date salaryMonth) 
    {
        this.salaryMonth = salaryMonth;
    }

    public Date getSalaryMonth() 
    {
        return salaryMonth;
    }
    public void setBaseSalary(BigDecimal baseSalary) 
    {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getBaseSalary() 
    {
        return baseSalary;
    }
    public void setBonus(BigDecimal bonus) 
    {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() 
    {
        return bonus;
    }
    public void setDeduction(BigDecimal deduction) 
    {
        this.deduction = deduction;
    }

    public BigDecimal getDeduction() 
    {
        return deduction;
    }
    public void setTotalSalary(BigDecimal totalSalary) 
    {
        this.totalSalary = totalSalary;
    }

    public BigDecimal getTotalSalary() 
    {
        return totalSalary;
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
            .append("id", getId())
            .append("teacherId", getTeacherId())
            .append("salaryMonth", getSalaryMonth())
            .append("baseSalary", getBaseSalary())
            .append("bonus", getBonus())
            .append("deduction", getDeduction())
            .append("totalSalary", getTotalSalary())
            .append("status", getStatus())
            .toString();
    }
}
