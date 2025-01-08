package com.ruoyi.lost.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lost.mapper.LostAndFoundMapper;
import com.ruoyi.lost.domain.LostAndFound;
import com.ruoyi.lost.service.ILostAndFoundService;

/**
 * 失物招领服务Service业务层处理
 * 
 * @author wwf
 * @date 2025-02-09
 */
@Service
public class LostAndFoundServiceImpl implements ILostAndFoundService 
{
    @Autowired
    private LostAndFoundMapper lostAndFoundMapper;

    /**
     * 查询失物招领服务
     * 
     * @param lostId 失物招领服务主键
     * @return 失物招领服务
     */
    @Override
    public LostAndFound selectLostAndFoundByLostId(Long lostId)
    {
        return lostAndFoundMapper.selectLostAndFoundByLostId(lostId);
    }

    /**
     * 查询失物招领服务列表
     * 
     * @param lostAndFound 失物招领服务
     * @return 失物招领服务
     */
    @Override
    public List<LostAndFound> selectLostAndFoundList(LostAndFound lostAndFound)
    {
        return lostAndFoundMapper.selectLostAndFoundList(lostAndFound);
    }

    /**
     * 新增失物招领服务
     * 
     * @param lostAndFound 失物招领服务
     * @return 结果
     */
    @Override
    public int insertLostAndFound(LostAndFound lostAndFound)
    {
        lostAndFound.setCreateTime(DateUtils.getNowDate());
        return lostAndFoundMapper.insertLostAndFound(lostAndFound);
    }

    /**
     * 修改失物招领服务
     * 
     * @param lostAndFound 失物招领服务
     * @return 结果
     */
    @Override
    public int updateLostAndFound(LostAndFound lostAndFound)
    {
        lostAndFound.setUpdateTime(DateUtils.getNowDate());
        return lostAndFoundMapper.updateLostAndFound(lostAndFound);
    }

    /**
     * 批量删除失物招领服务
     * 
     * @param lostIds 需要删除的失物招领服务主键
     * @return 结果
     */
    @Override
    public int deleteLostAndFoundByLostIds(Long[] lostIds)
    {
        return lostAndFoundMapper.deleteLostAndFoundByLostIds(lostIds);
    }

    /**
     * 删除失物招领服务信息
     * 
     * @param lostId 失物招领服务主键
     * @return 结果
     */
    @Override
    public int deleteLostAndFoundByLostId(Long lostId)
    {
        return lostAndFoundMapper.deleteLostAndFoundByLostId(lostId);
    }
}
