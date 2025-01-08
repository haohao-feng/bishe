package com.ruoyi.announcement.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.announcement.domain.Annoucement;
import com.ruoyi.announcement.service.IAnnoucementService;
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

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 通知公告Controller
 * 
 * @author ruoyi
 * @date 2025-02-03
 */
@RestController
@RequestMapping("/notification")
public class AnnoucementController extends BaseController
{
    @Autowired
    private IAnnoucementService annoucementService;

    /**
     * 查询通知公告列表
     */
    @RequiresPermissions("announcement:notification:list")
    @GetMapping("/list")
    public TableDataInfo list(Annoucement annoucement)
    {
        startPage();
        List<Annoucement> list = annoucementService.selectAnnoucementList(annoucement);
        return getDataTable(list);
    }

    /**
     * 导出通知公告列表
     */
    @RequiresPermissions("announcement:notification:export")
    @Log(title = "通知公告", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Annoucement annoucement)
    {
        List<Annoucement> list = annoucementService.selectAnnoucementList(annoucement);
        ExcelUtil<Annoucement> util = new ExcelUtil<Annoucement>(Annoucement.class);
        util.exportExcel(response, list, "通知公告数据");
    }

    /**
     * 获取通知公告详细信息
     */
    @RequiresPermissions("announcement:notification:query")
    @GetMapping(value = "/{announcementId}")
    public AjaxResult getInfo(@PathVariable("announcementId") Long announcementId)
    {
        return success(annoucementService.selectAnnoucementByAnnouncementId(announcementId));
    }

    /**
     * 新增通知公告
     */
    @RequiresPermissions("announcement:notification:add")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Annoucement annoucement)
    {
        return toAjax(annoucementService.insertAnnoucement(annoucement));
    }

    /**
     * 修改通知公告
     */
    @RequiresPermissions("announcement:notification:edit")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Annoucement annoucement)
    {
        return toAjax(annoucementService.updateAnnoucement(annoucement));
    }

    /**
     * 删除通知公告
     */
    @RequiresPermissions("announcement:notification:remove")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{announcementIds}")
    public AjaxResult remove(@PathVariable Long[] announcementIds)
    {
        return toAjax(annoucementService.deleteAnnoucementByAnnouncementIds(announcementIds));
    }
}
