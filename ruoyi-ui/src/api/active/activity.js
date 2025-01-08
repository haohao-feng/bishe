import request from '@/utils/request'

// 查询校园活动管理列表
export function listActivity(query) {
  return request({
    url: '/active/activity/list',
    method: 'get',
    params: query
  })
}

// 查询校园活动管理详细
export function getActivity(activityId) {
  return request({
    url: '/active/activity/' + activityId,
    method: 'get'
  })
}

// 新增校园活动管理
export function addActivity(data) {
  return request({
    url: '/active/activity',
    method: 'post',
    data: data
  })
}

// 修改校园活动管理
export function updateActivity(data) {
  return request({
    url: '/active/activity',
    method: 'put',
    data: data
  })
}

// 删除校园活动管理
export function delActivity(activityId) {
  return request({
    url: '/active/activity/' + activityId,
    method: 'delete'
  })
}
