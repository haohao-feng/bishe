package com.ruoyi.salary.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.salary.domain.SalaryInfo;
import com.ruoyi.salary.service.ISalaryInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 教师工资信息Controller
 * 
 * @author wwf
 * @date 2025-02-23
 */
@RestController
@RequestMapping("/info")
public class SalaryInfoController extends BaseController
{
    @Autowired
    private ISalaryInfoService salaryInfoService;

    /**
     * 查询教师工资信息列表
     */
    @RequiresPermissions("salary:info:list")
    @GetMapping("/list")
    public TableDataInfo list(SalaryInfo salaryInfo)
    {
        startPage();
        List<SalaryInfo> list = salaryInfoService.selectSalaryInfoList(salaryInfo);
        return getDataTable(list);
    }

    /**
     * 导出教师工资信息列表
     */
    @RequiresPermissions("salary:info:export")
    @Log(title = "教师工资信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SalaryInfo salaryInfo)
    {
        List<SalaryInfo> list = salaryInfoService.selectSalaryInfoList(salaryInfo);
        ExcelUtil<SalaryInfo> util = new ExcelUtil<SalaryInfo>(SalaryInfo.class);
        util.exportExcel(response, list, "教师工资信息数据");
    }

    /**
     * 获取教师工资信息详细信息
     */
    @RequiresPermissions("salary:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(salaryInfoService.selectSalaryInfoById(id));
    }

    /**
     * 新增教师工资信息
     */
    @RequiresPermissions("salary:info:add")
    @Log(title = "教师工资信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SalaryInfo salaryInfo)
    {
        return toAjax(salaryInfoService.insertSalaryInfo(salaryInfo));
    }

    /**
     * 修改教师工资信息
     */
    @RequiresPermissions("salary:info:edit")
    @Log(title = "教师工资信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SalaryInfo salaryInfo)
    {
        return toAjax(salaryInfoService.updateSalaryInfo(salaryInfo));
    }

    /**
     * 删除教师工资信息
     */
    @RequiresPermissions("salary:info:remove")
    @Log(title = "教师工资信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(salaryInfoService.deleteSalaryInfoByIds(ids));
    }
}
