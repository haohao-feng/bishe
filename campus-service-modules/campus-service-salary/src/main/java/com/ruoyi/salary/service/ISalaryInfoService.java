package com.ruoyi.salary.service;

import java.util.List;
import com.ruoyi.salary.domain.SalaryInfo;

/**
 * 教师工资信息Service接口
 * 
 * @author wwf
 * @date 2025-02-23
 */
public interface ISalaryInfoService 
{
    /**
     * 查询教师工资信息
     * 
     * @param id 教师工资信息主键
     * @return 教师工资信息
     */
    public SalaryInfo selectSalaryInfoById(Long id);

    /**
     * 查询教师工资信息列表
     * 
     * @param salaryInfo 教师工资信息
     * @return 教师工资信息集合
     */
    public List<SalaryInfo> selectSalaryInfoList(SalaryInfo salaryInfo);

    /**
     * 新增教师工资信息
     * 
     * @param salaryInfo 教师工资信息
     * @return 结果
     */
    public int insertSalaryInfo(SalaryInfo salaryInfo);

    /**
     * 修改教师工资信息
     * 
     * @param salaryInfo 教师工资信息
     * @return 结果
     */
    public int updateSalaryInfo(SalaryInfo salaryInfo);

    /**
     * 批量删除教师工资信息
     * 
     * @param ids 需要删除的教师工资信息主键集合
     * @return 结果
     */
    public int deleteSalaryInfoByIds(Long[] ids);

    /**
     * 删除教师工资信息信息
     * 
     * @param id 教师工资信息主键
     * @return 结果
     */
    public int deleteSalaryInfoById(Long id);
}
