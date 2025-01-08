package com.ruoyi.course.mapper;

import java.util.List;
import com.ruoyi.course.domain.Course;

/**
 * 课程管理服务Mapper接口
 * 
 * @author wwf
 * @date 2025-02-16
 */
public interface CourseMapper 
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
     * 删除课程管理服务
     * 
     * @param courseId 课程管理服务主键
     * @return 结果
     */
    public int deleteCourseByCourseId(Long courseId);

    /**
     * 批量删除课程管理服务
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseByCourseIds(Long[] courseIds);
}
