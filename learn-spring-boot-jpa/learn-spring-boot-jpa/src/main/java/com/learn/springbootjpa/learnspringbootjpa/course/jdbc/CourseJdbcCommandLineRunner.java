package com.learn.springbootjpa.learnspringbootjpa.course.jdbc;

import com.learn.springbootjpa.learnspringbootjpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"Learn AWS Now!","in28minutes"));
        courseJdbcRepository.insert(new Course(2,"Learn Azure Now!","in28minutes"));
        courseJdbcRepository.insert(new Course(3,"Learn DevOps Now!","in28minutes"));

        courseJdbcRepository.deleteById(1);

        System.out.println(courseJdbcRepository.findById(2));
        System.out.println(courseJdbcRepository.findById(3));
    }
}
