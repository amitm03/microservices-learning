package com.amit.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    
    @GetMapping("/courses")
    public List<Course> retreiveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","in28minutes"),
                new Course(2,"DevOps","in28minutes"),
                new Course(2,"Learn Azure","in28minutes")
        );
    }
}
