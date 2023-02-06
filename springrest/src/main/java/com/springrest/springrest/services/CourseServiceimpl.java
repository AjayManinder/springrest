package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

List<Course> list;

public CourseServiceimpl() {
	
	list= new ArrayList<>();
	list.add(new Course(1,"java core","learn java"));
	list.add(new Course(2,"python","learn python"));
	list.add(new Course(3,"react","learn react"));
	list.add(new Course(4,"spring","learn spring"));

}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course co = null;
		for(Course course : list) {
			if(course.getId()==courseId) {
				co=course;
				break;
			}
		}
		return co;
	}

}
