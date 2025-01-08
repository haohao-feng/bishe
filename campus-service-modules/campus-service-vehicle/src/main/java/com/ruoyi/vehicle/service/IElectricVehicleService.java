package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.ElectricVehicle;

/**
 * 车辆登记管理Service接口
 * 
 * @author ruoyi
 * @date 2025-02-04
 */
public interface IElectricVehicleService 
{
    /**
     * 查询车辆登记管理
     * 
     * @param vehicleId 车辆登记管理主键
     * @return 车辆登记管理
     */
    public ElectricVehicle selectElectricVehicleByVehicleId(Long vehicleId);

    /**
     * 查询车辆登记管理列表
     * 
     * @param electricVehicle 车辆登记管理
     * @return 车辆登记管理集合
     */
    public List<ElectricVehicle> selectElectricVehicleList(ElectricVehicle electricVehicle);

    /**
     * 新增车辆登记管理
     * 
     * @param electricVehicle 车辆登记管理
     * @return 结果
     */
    public int insertElectricVehicle(ElectricVehicle electricVehicle);

    /**
     * 修改车辆登记管理
     * 
     * @param electricVehicle 车辆登记管理
     * @return 结果
     */
    public int updateElectricVehicle(ElectricVehicle electricVehicle);

    /**
     * 批量删除车辆登记管理
     * 
     * @param vehicleIds 需要删除的车辆登记管理主键集合
     * @return 结果
     */
    public int deleteElectricVehicleByVehicleIds(Long[] vehicleIds);

    /**
     * 删除车辆登记管理信息
     * 
     * @param vehicleId 车辆登记管理主键
     * @return 结果
     */
    public int deleteElectricVehicleByVehicleId(Long vehicleId);
}
