package com.ruoyi.lost.mapper;

import java.util.List;
import com.ruoyi.lost.domain.LostAndFound;

/**
 * 失物招领服务Mapper接口
 * 
 * @author wwf
 * @date 2025-02-09
 */
public interface LostAndFoundMapper 
{
    /**
     * 查询失物招领服务
     * 
     * @param lostId 失物招领服务主键
     * @return 失物招领服务
     */
    public LostAndFound selectLostAndFoundByLostId(Long lostId);

    /**
     * 查询失物招领服务列表
     * 
     * @param lostAndFound 失物招领服务
     * @return 失物招领服务集合
     */
    public List<LostAndFound> selectLostAndFoundList(LostAndFound lostAndFound);

    /**
     * 新增失物招领服务
     * 
     * @param lostAndFound 失物招领服务
     * @return 结果
     */
    public int insertLostAndFound(LostAndFound lostAndFound);

    /**
     * 修改失物招领服务
     * 
     * @param lostAndFound 失物招领服务
     * @return 结果
     */
    public int updateLostAndFound(LostAndFound lostAndFound);

    /**
     * 删除失物招领服务
     * 
     * @param lostId 失物招领服务主键
     * @return 结果
     */
    public int deleteLostAndFoundByLostId(Long lostId);

    /**
     * 批量删除失物招领服务
     * 
     * @param lostIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLostAndFoundByLostIds(Long[] lostIds);
}
