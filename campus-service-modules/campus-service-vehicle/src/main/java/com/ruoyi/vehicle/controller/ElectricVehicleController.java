package com.ruoyi.vehicle.controller;

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
import com.ruoyi.vehicle.domain.ElectricVehicle;
import com.ruoyi.vehicle.service.IElectricVehicleService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆登记管理Controller
 * 
 * @author ruoyi
 * @date 2025-02-04
 */
@RestController
@RequestMapping("/car")
public class ElectricVehicleController extends BaseController
{
    @Autowired
    private IElectricVehicleService electricVehicleService;

    /**
     * 查询车辆登记管理列表
     */
    @RequiresPermissions("vehicle:car:list")
    @GetMapping("/list")
    public TableDataInfo list(ElectricVehicle electricVehicle)
    {
        startPage();
        List<ElectricVehicle> list = electricVehicleService.selectElectricVehicleList(electricVehicle);
        return getDataTable(list);
    }

    /**
     * 导出车辆登记管理列表
     */
    @RequiresPermissions("vehicle:car:export")
    @Log(title = "车辆登记管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ElectricVehicle electricVehicle)
    {
        List<ElectricVehicle> list = electricVehicleService.selectElectricVehicleList(electricVehicle);
        ExcelUtil<ElectricVehicle> util = new ExcelUtil<ElectricVehicle>(ElectricVehicle.class);
        util.exportExcel(response, list, "车辆登记管理数据");
    }

    /**
     * 获取车辆登记管理详细信息
     */
    @RequiresPermissions("vehicle:car:query")
    @GetMapping(value = "/{vehicleId}")
    public AjaxResult getInfo(@PathVariable("vehicleId") Long vehicleId)
    {
        return success(electricVehicleService.selectElectricVehicleByVehicleId(vehicleId));
    }

    /**
     * 新增车辆登记管理
     */
    @RequiresPermissions("vehicle:car:add")
    @Log(title = "车辆登记管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricVehicle electricVehicle)
    {
        return toAjax(electricVehicleService.insertElectricVehicle(electricVehicle));
    }

    /**
     * 修改车辆登记管理
     */
    @RequiresPermissions("vehicle:car:edit")
    @Log(title = "车辆登记管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricVehicle electricVehicle)
    {
        return toAjax(electricVehicleService.updateElectricVehicle(electricVehicle));
    }

    /**
     * 删除车辆登记管理
     */
    @RequiresPermissions("vehicle:car:remove")
    @Log(title = "车辆登记管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vehicleIds}")
    public AjaxResult remove(@PathVariable Long[] vehicleIds)
    {
        return toAjax(electricVehicleService.deleteElectricVehicleByVehicleIds(vehicleIds));
    }
}
