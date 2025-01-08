package com.ruoyi.activity.service;

import java.util.List;
import com.ruoyi.activity.domain.Activity;

/**
 * 校园活动管理Service接口
 * 
 * @author ruoyi
 * @date 2025-02-02
 */
public interface IActivityService 
{
    /**
     * 查询校园活动管理
     * 
     * @param activityId 校园活动管理主键
     * @return 校园活动管理
     */
    public Activity selectActivityByActivityId(Long activityId);

    /**
     * 查询校园活动管理列表
     * 
     * @param activity 校园活动管理
     * @return 校园活动管理集合
     */
    public List<Activity> selectActivityList(Activity activity);

    /**
     * 新增校园活动管理
     * 
     * @param activity 校园活动管理
     * @return 结果
     */
    public int insertActivity(Activity activity);

    /**
     * 修改校园活动管理
     * 
     * @param activity 校园活动管理
     * @return 结果
     */
    public int updateActivity(Activity activity);

    /**
     * 批量删除校园活动管理
     * 
     * @param activityIds 需要删除的校园活动管理主键集合
     * @return 结果
     */
    public int deleteActivityByActivityIds(Long[] activityIds);

    /**
     * 删除校园活动管理信息
     * 
     * @param activityId 校园活动管理主键
     * @return 结果
     */
    public int deleteActivityByActivityId(Long activityId);
}
