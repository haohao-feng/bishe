import request from '@/utils/request'

// 查询教师工资信息列表
export function listInfo(query) {
  return request({
    url: '/salary/info/list',
    method: 'get',
    params: query
  })
}

// 查询教师工资信息详细
export function getInfo(id) {
  return request({
    url: '/salary/info/' + id,
    method: 'get'
  })
}

// 新增教师工资信息
export function addInfo(data) {
  return request({
    url: '/salary/info',
    method: 'post',
    data: data
  })
}

// 修改教师工资信息
export function updateInfo(data) {
  return request({
    url: '/salary/info',
    method: 'put',
    data: data
  })
}

// 删除教师工资信息
export function delInfo(id) {
  return request({
    url: '/salary/info/' + id,
    method: 'delete'
  })
}
