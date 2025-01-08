import request from '@/utils/request'

// 查询通知公告列表
export function listNotification(query) {
  return request({
    url: '/announcement/notification/list',
    method: 'get',
    params: query
  })
}

// 查询通知公告详细
export function getNotification(announcementId) {
  return request({
    url: '/announcement/notification/' + announcementId,
    method: 'get'
  })
}

// 新增通知公告
export function addNotification(data) {
  return request({
    url: '/announcement/notification',
    method: 'post',
    data: data
  })
}

// 修改通知公告
export function updateNotification(data) {
  return request({
    url: '/announcement/notification',
    method: 'put',
    data: data
  })
}

// 删除通知公告
export function delNotification(announcementId) {
  return request({
    url: '/announcement/notification/' + announcementId,
    method: 'delete'
  })
}
