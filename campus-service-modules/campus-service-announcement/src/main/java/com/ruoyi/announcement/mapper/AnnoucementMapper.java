package com.ruoyi.announcement.mapper;

import com.ruoyi.announcement.domain.Annoucement;

import java.util.List;


/**
 * 通知公告Mapper接口
 * 
 * @author ruoyi
 * @date 2025-02-03
 */
public interface AnnoucementMapper 
{
    /**
     * 查询通知公告
     * 
     * @param announcementId 通知公告主键
     * @return 通知公告
     */
    public Annoucement selectAnnoucementByAnnouncementId(Long announcementId);

    /**
     * 查询通知公告列表
     * 
     * @param annoucement 通知公告
     * @return 通知公告集合
     */
    public List<Annoucement> selectAnnoucementList(Annoucement annoucement);

    /**
     * 新增通知公告
     * 
     * @param annoucement 通知公告
     * @return 结果
     */
    public int insertAnnoucement(Annoucement annoucement);

    /**
     * 修改通知公告
     * 
     * @param annoucement 通知公告
     * @return 结果
     */
    public int updateAnnoucement(Annoucement annoucement);

    /**
     * 删除通知公告
     * 
     * @param announcementId 通知公告主键
     * @return 结果
     */
    public int deleteAnnoucementByAnnouncementId(Long announcementId);

    /**
     * 批量删除通知公告
     * 
     * @param announcementIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAnnoucementByAnnouncementIds(Long[] announcementIds);
}
