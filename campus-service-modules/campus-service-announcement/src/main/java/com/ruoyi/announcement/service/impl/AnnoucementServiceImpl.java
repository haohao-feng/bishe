package com.ruoyi.announcement.service.impl;

import java.util.List;

import com.ruoyi.announcement.domain.Annoucement;
import com.ruoyi.announcement.mapper.AnnoucementMapper;
import com.ruoyi.announcement.service.IAnnoucementService;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 通知公告Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-03
 */
@Service
public class AnnoucementServiceImpl implements IAnnoucementService
{
    @Autowired
    private AnnoucementMapper annoucementMapper;

    /**
     * 查询通知公告
     * 
     * @param announcementId 通知公告主键
     * @return 通知公告
     */
    @Override
    public Annoucement selectAnnoucementByAnnouncementId(Long announcementId)
    {
        return annoucementMapper.selectAnnoucementByAnnouncementId(announcementId);
    }

    /**
     * 查询通知公告列表
     * 
     * @param annoucement 通知公告
     * @return 通知公告
     */
    @Override
    public List<Annoucement> selectAnnoucementList(Annoucement annoucement)
    {
        return annoucementMapper.selectAnnoucementList(annoucement);
    }

    /**
     * 新增通知公告
     * 
     * @param annoucement 通知公告
     * @return 结果
     */
    @Override
    public int insertAnnoucement(Annoucement annoucement)
    {
        annoucement.setCreateTime(DateUtils.getNowDate());
        return annoucementMapper.insertAnnoucement(annoucement);
    }

    /**
     * 修改通知公告
     * 
     * @param annoucement 通知公告
     * @return 结果
     */
    @Override
    public int updateAnnoucement(Annoucement annoucement)
    {
        annoucement.setUpdateTime(DateUtils.getNowDate());
        return annoucementMapper.updateAnnoucement(annoucement);
    }

    /**
     * 批量删除通知公告
     * 
     * @param announcementIds 需要删除的通知公告主键
     * @return 结果
     */
    @Override
    public int deleteAnnoucementByAnnouncementIds(Long[] announcementIds)
    {
        return annoucementMapper.deleteAnnoucementByAnnouncementIds(announcementIds);
    }

    /**
     * 删除通知公告信息
     * 
     * @param announcementId 通知公告主键
     * @return 结果
     */
    @Override
    public int deleteAnnoucementByAnnouncementId(Long announcementId)
    {
        return annoucementMapper.deleteAnnoucementByAnnouncementId(announcementId);
    }
}
