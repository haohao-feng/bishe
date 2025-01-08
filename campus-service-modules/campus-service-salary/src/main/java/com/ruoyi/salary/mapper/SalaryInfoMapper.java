package com.ruoyi.salary.mapper;

import java.util.List;
import com.ruoyi.salary.domain.SalaryInfo;

/**
 * 教师工资信息Mapper接口
 * 
 * @author wwf
 * @date 2025-02-23
 */
public interface SalaryInfoMapper 
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
     * 删除教师工资信息
     * 
     * @param id 教师工资信息主键
     * @return 结果
     */
    public int deleteSalaryInfoById(Long id);

    /**
     * 批量删除教师工资信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSalaryInfoByIds(Long[] ids);
}
