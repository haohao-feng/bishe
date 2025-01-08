package com.ruoyi.leave.service;

import java.util.List;
import com.ruoyi.leave.domain.LeaveRequest;

/**
 * 请假管理服务Service接口
 * 
 * @author wwf
 * @date 2025-02-09
 */
public interface ILeaveRequestService 
{
    /**
     * 查询请假管理服务
     * 
     * @param id 请假管理服务主键
     * @return 请假管理服务
     */
    public LeaveRequest selectLeaveRequestById(Long id);

    /**
     * 查询请假管理服务列表
     * 
     * @param leaveRequest 请假管理服务
     * @return 请假管理服务集合
     */
    public List<LeaveRequest> selectLeaveRequestList(LeaveRequest leaveRequest);

    /**
     * 新增请假管理服务
     * 
     * @param leaveRequest 请假管理服务
     * @return 结果
     */
    public int insertLeaveRequest(LeaveRequest leaveRequest);

    /**
     * 修改请假管理服务
     * 
     * @param leaveRequest 请假管理服务
     * @return 结果
     */
    public int updateLeaveRequest(LeaveRequest leaveRequest);

    /**
     * 批量删除请假管理服务
     * 
     * @param ids 需要删除的请假管理服务主键集合
     * @return 结果
     */
    public int deleteLeaveRequestByIds(Long[] ids);

    /**
     * 删除请假管理服务信息
     * 
     * @param id 请假管理服务主键
     * @return 结果
     */
    public int deleteLeaveRequestById(Long id);
}
