package com.ruoyi.leave.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.leave.mapper.LeaveRequestMapper;
import com.ruoyi.leave.domain.LeaveRequest;
import com.ruoyi.leave.service.ILeaveRequestService;

/**
 * 请假管理服务Service业务层处理
 * 
 * @author wwf
 * @date 2025-02-09
 */
@Service
public class LeaveRequestServiceImpl implements ILeaveRequestService 
{
    @Autowired
    private LeaveRequestMapper leaveRequestMapper;

    /**
     * 查询请假管理服务
     * 
     * @param id 请假管理服务主键
     * @return 请假管理服务
     */
    @Override
    public LeaveRequest selectLeaveRequestById(Long id)
    {
        return leaveRequestMapper.selectLeaveRequestById(id);
    }

    /**
     * 查询请假管理服务列表
     * 
     * @param leaveRequest 请假管理服务
     * @return 请假管理服务
     */
    @Override
    public List<LeaveRequest> selectLeaveRequestList(LeaveRequest leaveRequest)
    {
        return leaveRequestMapper.selectLeaveRequestList(leaveRequest);
    }

    /**
     * 新增请假管理服务
     * 
     * @param leaveRequest 请假管理服务
     * @return 结果
     */
    @Override
    public int insertLeaveRequest(LeaveRequest leaveRequest)
    {
        leaveRequest.setCreateTime(DateUtils.getNowDate());
        return leaveRequestMapper.insertLeaveRequest(leaveRequest);
    }

    /**
     * 修改请假管理服务
     * 
     * @param leaveRequest 请假管理服务
     * @return 结果
     */
    @Override
    public int updateLeaveRequest(LeaveRequest leaveRequest)
    {
        return leaveRequestMapper.updateLeaveRequest(leaveRequest);
    }

    /**
     * 批量删除请假管理服务
     * 
     * @param ids 需要删除的请假管理服务主键
     * @return 结果
     */
    @Override
    public int deleteLeaveRequestByIds(Long[] ids)
    {
        return leaveRequestMapper.deleteLeaveRequestByIds(ids);
    }

    /**
     * 删除请假管理服务信息
     * 
     * @param id 请假管理服务主键
     * @return 结果
     */
    @Override
    public int deleteLeaveRequestById(Long id)
    {
        return leaveRequestMapper.deleteLeaveRequestById(id);
    }
}
