import request from '@/utils/request'

// 查询课程管理服务列表
export function listCourses(query) {
  return request({
    url: '/course/courses/list',
    method: 'get',
    params: query
  })
}

// 查询课程管理服务详细
export function getCourses(courseId) {
  return request({
    url: '/course/courses/' + courseId,
    method: 'get'
  })
}

// 新增课程管理服务
export function addCourses(data) {
  return request({
    url: '/course/courses',
    method: 'post',
    data: data
  })
}

// 修改课程管理服务
export function updateCourses(data) {
  return request({
    url: '/course/courses',
    method: 'put',
    data: data
  })
}

// 删除课程管理服务
export function delCourses(courseId) {
  return request({
    url: '/course/courses/' + courseId,
    method: 'delete'
  })
}
