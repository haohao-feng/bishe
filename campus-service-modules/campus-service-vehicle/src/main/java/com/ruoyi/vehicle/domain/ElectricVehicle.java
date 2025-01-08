package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆登记管理对象 electric_vehicle
 * 
 * @author ruoyi
 * @date 2025-02-04
 */
public class ElectricVehicle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long vehicleId;

    /** 车主姓名 */
    @Excel(name = "车主姓名")
    private String ownerName;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phoneNumber;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String plateNumber;

    /** 车辆品牌 */
    @Excel(name = "车辆品牌")
    private String brand;

    /** 登记时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "登记时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerTime;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setVehicleId(Long vehicleId) 
    {
        this.vehicleId = vehicleId;
    }

    public Long getVehicleId() 
    {
        return vehicleId;
    }
    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber()
    {
        return plateNumber;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setRegisterTime(Date registerTime) 
    {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() 
    {
        return registerTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("vehicleId", getVehicleId())
            .append("ownerName", getOwnerName())
            .append("phoneNumber", getPhoneNumber())
            .append("plateNumber", getPlateNumber())
            .append("brand", getBrand())
            .append("registerTime", getRegisterTime())
            .append("status", getStatus())
            .toString();
    }
}
