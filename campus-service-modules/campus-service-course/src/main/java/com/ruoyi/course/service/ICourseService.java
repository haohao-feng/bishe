package com.ruoyi.course.service;

import java.util.List;
import com.ruoyi.course.domain.Course;

/**
 * 课程管理服务Service接口
 * 
 * @author wwf
 * @date 2025-02-16
 */
public interface ICourseService 
{
    /**
     * 查询课程管理服务
     * 
     * @param courseId 课程管理服务主键
     * @return 课程管理服务
     */
    public Course selectCourseByCourseId(Long courseId);

    /**
     * 查询课程管理服务列表
     * 
     * @param course 课程管理服务
     * @return 课程管理服务集合
     */
    public List<Course> selectCourseList(Course course);

    /**
     * 新增课程管理服务
     * 
     * @param course 课程管理服务
     * @return 结果
     */
    public int insertCourse(Course course);

    /**
     * 修改课程管理服务
     * 
     * @param course 课程管理服务
     * @return 结果
     */
    public int updateCourse(Course course);

    /**
     * 批量删除课程管理服务
     * 
     * @param courseIds 需要删除的课程管理服务主键集合
     * @return 结果
     */
    public int deleteCourseByCourseIds(Long[] courseIds);

    /**
     * 删除课程管理服务信息
     * 
     * @param courseId 课程管理服务主键
     * @return 结果
     */
    public int deleteCourseByCourseId(Long courseId);
}
