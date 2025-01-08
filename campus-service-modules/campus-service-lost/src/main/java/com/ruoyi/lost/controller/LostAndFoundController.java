package com.ruoyi.lost.controller;

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
import com.ruoyi.lost.domain.LostAndFound;
import com.ruoyi.lost.service.ILostAndFoundService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 失物招领服务Controller
 * 
 * @author wwf
 * @date 2025-02-09
 */
@RestController
@RequestMapping("/found")
public class LostAndFoundController extends BaseController
{
    @Autowired
    private ILostAndFoundService lostAndFoundService;

    /**
     * 查询失物招领服务列表
     */
    @RequiresPermissions("lost:found:list")
    @GetMapping("/list")
    public TableDataInfo list(LostAndFound lostAndFound)
    {
        startPage();
        List<LostAndFound> list = lostAndFoundService.selectLostAndFoundList(lostAndFound);
        return getDataTable(list);
    }

    /**
     * 导出失物招领服务列表
     */
    @RequiresPermissions("lost:found:export")
    @Log(title = "失物招领服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LostAndFound lostAndFound)
    {
        List<LostAndFound> list = lostAndFoundService.selectLostAndFoundList(lostAndFound);
        ExcelUtil<LostAndFound> util = new ExcelUtil<LostAndFound>(LostAndFound.class);
        util.exportExcel(response, list, "失物招领服务数据");
    }

    /**
     * 获取失物招领服务详细信息
     */
    @RequiresPermissions("lost:found:query")
    @GetMapping(value = "/{lostId}")
    public AjaxResult getInfo(@PathVariable("lostId") Long lostId)
    {
        return success(lostAndFoundService.selectLostAndFoundByLostId(lostId));
    }

    /**
     * 新增失物招领服务
     */
    @RequiresPermissions("lost:found:add")
    @Log(title = "失物招领服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LostAndFound lostAndFound)
    {
        return toAjax(lostAndFoundService.insertLostAndFound(lostAndFound));
    }

    /**
     * 修改失物招领服务
     */
    @RequiresPermissions("lost:found:edit")
    @Log(title = "失物招领服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LostAndFound lostAndFound)
    {
        return toAjax(lostAndFoundService.updateLostAndFound(lostAndFound));
    }

    /**
     * 删除失物招领服务
     */
    @RequiresPermissions("lost:found:remove")
    @Log(title = "失物招领服务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{lostIds}")
    public AjaxResult remove(@PathVariable Long[] lostIds)
    {
        return toAjax(lostAndFoundService.deleteLostAndFoundByLostIds(lostIds));
    }
}
