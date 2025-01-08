package com.ruoyi.leave.controller;

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
import com.ruoyi.leave.domain.LeaveRequest;
import com.ruoyi.leave.service.ILeaveRequestService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 请假管理服务Controller
 * 
 * @author wwf
 * @date 2025-02-09
 */
@RestController
@RequestMapping("/vacation")
public class LeaveRequestController extends BaseController
{
    @Autowired
    private ILeaveRequestService leaveRequestService;

    /**
     * 查询请假管理服务列表
     */
    @RequiresPermissions("leave:vacation:list")
    @GetMapping("/list")
    public TableDataInfo list(LeaveRequest leaveRequest)
    {
        startPage();
        List<LeaveRequest> list = leaveRequestService.selectLeaveRequestList(leaveRequest);
        return getDataTable(list);
    }

    /**
     * 导出请假管理服务列表
     */
    @RequiresPermissions("leave:vacation:export")
    @Log(title = "请假管理服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaveRequest leaveRequest)
    {
        List<LeaveRequest> list = leaveRequestService.selectLeaveRequestList(leaveRequest);
        ExcelUtil<LeaveRequest> util = new ExcelUtil<LeaveRequest>(LeaveRequest.class);
        util.exportExcel(response, list, "请假管理服务数据");
    }

    /**
     * 获取请假管理服务详细信息
     */
    @RequiresPermissions("leave:vacation:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(leaveRequestService.selectLeaveRequestById(id));
    }

    /**
     * 新增请假管理服务
     */
    @RequiresPermissions("leave:vacation:add")
    @Log(title = "请假管理服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaveRequest leaveRequest)
    {
        return toAjax(leaveRequestService.insertLeaveRequest(leaveRequest));
    }

    /**
     * 修改请假管理服务
     */
    @RequiresPermissions("leave:vacation:edit")
    @Log(title = "请假管理服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaveRequest leaveRequest)
    {
        return toAjax(leaveRequestService.updateLeaveRequest(leaveRequest));
    }

    /**
     * 删除请假管理服务
     */
    @RequiresPermissions("leave:vacation:remove")
    @Log(title = "请假管理服务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(leaveRequestService.deleteLeaveRequestByIds(ids));
    }
}
