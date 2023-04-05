package com.example.springapi.controller;
import java.util.List;

import com.example.springapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springapi.entities.Course;

@RestController
public class Mycontroller {
    @Autowired
    private CourseService courseservice ;

    @GetMapping("/home")
    public String home()
    {
        return "welcomet to courses api";
    }
   @GetMapping("/courses")
    public  List<Course>   getCourses()
    {
        List<Course> courses = this.courseservice.getCourses();
        return courses;

    }


}
