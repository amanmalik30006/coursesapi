package com.example.springapi.service;

import com.example.springapi.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class  CourseServiceimpl implements CourseService {
    List<Course> list;

    public void  courseserviceimpl(){
        list = new ArrayList<>();
        list.add(new Course(14,"aman","yes"));
    }
    @Override
    public List<Course> getCourses() {
return list;
    }
}
