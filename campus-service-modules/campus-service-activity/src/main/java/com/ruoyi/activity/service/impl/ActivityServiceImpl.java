package com.ruoyi.activity.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.ActivityMapper;
import com.ruoyi.activity.domain.Activity;
import com.ruoyi.activity.service.IActivityService;

/**
 * 校园活动管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-02
 */
@Service
public class ActivityServiceImpl implements IActivityService 
{
    @Autowired
    private ActivityMapper activityMapper;

    /**
     * 查询校园活动管理
     * 
     * @param activityId 校园活动管理主键
     * @return 校园活动管理
     */
    @Override
    public Activity selectActivityByActivityId(Long activityId)
    {
        return activityMapper.selectActivityByActivityId(activityId);
    }

    /**
     * 查询校园活动管理列表
     * 
     * @param activity 校园活动管理
     * @return 校园活动管理
     */
    @Override
    public List<Activity> selectActivityList(Activity activity)
    {
        return activityMapper.selectActivityList(activity);
    }

    /**
     * 新增校园活动管理
     * 
     * @param activity 校园活动管理
     * @return 结果
     */
    @Override
    public int insertActivity(Activity activity)
    {
        activity.setCreateTime(DateUtils.getNowDate());
        return activityMapper.insertActivity(activity);
    }

    /**
     * 修改校园活动管理
     * 
     * @param activity 校园活动管理
     * @return 结果
     */
    @Override
    public int updateActivity(Activity activity)
    {
        activity.setUpdateTime(DateUtils.getNowDate());
        return activityMapper.updateActivity(activity);
    }

    /**
     * 批量删除校园活动管理
     * 
     * @param activityIds 需要删除的校园活动管理主键
     * @return 结果
     */
    @Override
    public int deleteActivityByActivityIds(Long[] activityIds)
    {
        return activityMapper.deleteActivityByActivityIds(activityIds);
    }

    /**
     * 删除校园活动管理信息
     * 
     * @param activityId 校园活动管理主键
     * @return 结果
     */
    @Override
    public int deleteActivityByActivityId(Long activityId)
    {
        return activityMapper.deleteActivityByActivityId(activityId);
    }
}
