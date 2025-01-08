package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.ElectricVehicleMapper;
import com.ruoyi.vehicle.domain.ElectricVehicle;
import com.ruoyi.vehicle.service.IElectricVehicleService;

/**
 * 车辆登记管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-04
 */
@Service
public class ElectricVehicleServiceImpl implements IElectricVehicleService 
{
    @Autowired
    private ElectricVehicleMapper electricVehicleMapper;

    /**
     * 查询车辆登记管理
     * 
     * @param vehicleId 车辆登记管理主键
     * @return 车辆登记管理
     */
    @Override
    public ElectricVehicle selectElectricVehicleByVehicleId(Long vehicleId)
    {
        return electricVehicleMapper.selectElectricVehicleByVehicleId(vehicleId);
    }

    /**
     * 查询车辆登记管理列表
     * 
     * @param electricVehicle 车辆登记管理
     * @return 车辆登记管理
     */
    @Override
    public List<ElectricVehicle> selectElectricVehicleList(ElectricVehicle electricVehicle)
    {
        return electricVehicleMapper.selectElectricVehicleList(electricVehicle);
    }

    /**
     * 新增车辆登记管理
     * 
     * @param electricVehicle 车辆登记管理
     * @return 结果
     */
    @Override
    public int insertElectricVehicle(ElectricVehicle electricVehicle)
    {
        return electricVehicleMapper.insertElectricVehicle(electricVehicle);
    }

    /**
     * 修改车辆登记管理
     * 
     * @param electricVehicle 车辆登记管理
     * @return 结果
     */
    @Override
    public int updateElectricVehicle(ElectricVehicle electricVehicle)
    {
        return electricVehicleMapper.updateElectricVehicle(electricVehicle);
    }

    /**
     * 批量删除车辆登记管理
     * 
     * @param vehicleIds 需要删除的车辆登记管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricVehicleByVehicleIds(Long[] vehicleIds)
    {
        return electricVehicleMapper.deleteElectricVehicleByVehicleIds(vehicleIds);
    }

    /**
     * 删除车辆登记管理信息
     * 
     * @param vehicleId 车辆登记管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricVehicleByVehicleId(Long vehicleId)
    {
        return electricVehicleMapper.deleteElectricVehicleByVehicleId(vehicleId);
    }
}
