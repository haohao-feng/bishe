import request from '@/utils/request'

// 查询请假管理服务列表
export function listVacation(query) {
  return request({
    url: '/leave/vacation/list',
    method: 'get',
    params: query
  })
}

// 查询请假管理服务详细
export function getVacation(id) {
  return request({
    url: '/leave/vacation/' + id,
    method: 'get'
  })
}

// 新增请假管理服务
export function addVacation(data) {
  return request({
    url: '/leave/vacation',
    method: 'post',
    data: data
  })
}

// 修改请假管理服务
export function updateVacation(data) {
  return request({
    url: '/leave/vacation',
    method: 'put',
    data: data
  })
}

// 删除请假管理服务
export function delVacation(id) {
  return request({
    url: '/leave/vacation/' + id,
    method: 'delete'
  })
}
