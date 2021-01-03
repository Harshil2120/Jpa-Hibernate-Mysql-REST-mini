package com.harshil.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshil.dao.CourseDao;
import com.harshil.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceimpl() {

	}
	
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}



	@Override
	public void deleteCourse(long courseId) {
           Course c1= courseDao.getOne(courseId);
           courseDao.delete(c1);
	}

	
}
