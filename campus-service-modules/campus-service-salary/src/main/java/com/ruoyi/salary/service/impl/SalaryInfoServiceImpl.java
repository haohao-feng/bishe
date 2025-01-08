package com.ruoyi.salary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.salary.mapper.SalaryInfoMapper;
import com.ruoyi.salary.domain.SalaryInfo;
import com.ruoyi.salary.service.ISalaryInfoService;

/**
 * 教师工资信息Service业务层处理
 * 
 * @author wwf
 * @date 2025-02-23
 */
@Service
public class SalaryInfoServiceImpl implements ISalaryInfoService 
{
    @Autowired
    private SalaryInfoMapper salaryInfoMapper;

    /**
     * 查询教师工资信息
     * 
     * @param id 教师工资信息主键
     * @return 教师工资信息
     */
    @Override
    public SalaryInfo selectSalaryInfoById(Long id)
    {
        return salaryInfoMapper.selectSalaryInfoById(id);
    }

    /**
     * 查询教师工资信息列表
     * 
     * @param salaryInfo 教师工资信息
     * @return 教师工资信息
     */
    @Override
    public List<SalaryInfo> selectSalaryInfoList(SalaryInfo salaryInfo)
    {
        return salaryInfoMapper.selectSalaryInfoList(salaryInfo);
    }

    /**
     * 新增教师工资信息
     * 
     * @param salaryInfo 教师工资信息
     * @return 结果
     */
    @Override
    public int insertSalaryInfo(SalaryInfo salaryInfo)
    {
        return salaryInfoMapper.insertSalaryInfo(salaryInfo);
    }

    /**
     * 修改教师工资信息
     * 
     * @param salaryInfo 教师工资信息
     * @return 结果
     */
    @Override
    public int updateSalaryInfo(SalaryInfo salaryInfo)
    {
        return salaryInfoMapper.updateSalaryInfo(salaryInfo);
    }

    /**
     * 批量删除教师工资信息
     * 
     * @param ids 需要删除的教师工资信息主键
     * @return 结果
     */
    @Override
    public int deleteSalaryInfoByIds(Long[] ids)
    {
        return salaryInfoMapper.deleteSalaryInfoByIds(ids);
    }

    /**
     * 删除教师工资信息信息
     * 
     * @param id 教师工资信息主键
     * @return 结果
     */
    @Override
    public int deleteSalaryInfoById(Long id)
    {
        return salaryInfoMapper.deleteSalaryInfoById(id);
    }
}
