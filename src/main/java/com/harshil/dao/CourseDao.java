package com.harshil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshil.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	
}
