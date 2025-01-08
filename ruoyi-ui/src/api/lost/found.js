import request from '@/utils/request'

// 查询失物招领服务列表
export function listFound(query) {
  return request({
    url: '/lost/found/list',
    method: 'get',
    params: query
  })
}

// 查询失物招领服务详细
export function getFound(lostId) {
  return request({
    url: '/lost/found/' + lostId,
    method: 'get'
  })
}

// 新增失物招领服务
export function addFound(data) {
  return request({
    url: '/lost/found',
    method: 'post',
    data: data
  })
}

// 修改失物招领服务
export function updateFound(data) {
  return request({
    url: '/lost/found',
    method: 'put',
    data: data
  })
}

// 删除失物招领服务
export function delFound(lostId) {
  return request({
    url: '/lost/found/' + lostId,
    method: 'delete'
  })
}
