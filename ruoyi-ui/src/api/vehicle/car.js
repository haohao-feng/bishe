import request from '@/utils/request'

// 查询车辆登记管理列表
export function listCar(query) {
  return request({
    url: '/vehicle/car/list',
    method: 'get',
    params: query
  })
}

// 查询车辆登记管理详细
export function getCar(vehicleId) {
  return request({
    url: '/vehicle/car/' + vehicleId,
    method: 'get'
  })
}

// 新增车辆登记管理
export function addCar(data) {
  return request({
    url: '/vehicle/car',
    method: 'post',
    data: data
  })
}

// 修改车辆登记管理
export function updateCar(data) {
  return request({
    url: '/vehicle/car',
    method: 'put',
    data: data
  })
}

// 删除车辆登记管理
export function delCar(vehicleId) {
  return request({
    url: '/vehicle/car/' + vehicleId,
    method: 'delete'
  })
}
