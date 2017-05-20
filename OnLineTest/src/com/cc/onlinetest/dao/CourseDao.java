package com.cc.onlinetest.dao;

import com.cc.onlinetest.domain.Course;
import com.cc.onlinetest.domain.PageBean;

public interface CourseDao {

	public PageBean<Course> findCourseByPage(int pageCode, int pageSize);

	public boolean addCourse(Course course);

	public Course getCourseByName(Course course);

	public Course getCourseById(Course course);

	public Course updateCourse(Course course);

	public boolean deleteCourse(Course course);

}
