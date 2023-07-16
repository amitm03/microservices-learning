package com.learn.springbootjpa.learnspringbootjpa.course.jpa;

import com.learn.springbootjpa.learnspringbootjpa.course.Course;
import com.learn.springbootjpa.learnspringbootjpa.course.jdbc.CourseJdbcRepository;
import com.learn.springbootjpa.learnspringbootjpa.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

/*    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1,"Learn AWS Now!","in28minutes"));
        courseJpaRepository.insert(new Course(2,"Learn Azure Now!","in28minutes"));
        courseJpaRepository.insert(new Course(3,"Learn DevOps Now!","in28minutes"));

        courseJpaRepository.deleteById(1);

        System.out.println(courseJpaRepository.findById(2));
        System.out.println(courseJpaRepository.findById(3));
    }*/

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1,"Learn AWS Now!","in28minutes"));
        courseSpringDataJpaRepository.save(new Course(2,"Learn Azure Now!","in28minutes"));
        courseSpringDataJpaRepository.save(new Course(3,"Learn DevOps Now!","in28minutes"));

        courseSpringDataJpaRepository.deleteById(1l);

        System.out.println(courseSpringDataJpaRepository.findById(2l));
        System.out.println(courseSpringDataJpaRepository.findById(3l));


        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.count());
        System.out.println(courseSpringDataJpaRepository.findByAuthor("in28Minutes"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor(""));

        System.out.println(courseSpringDataJpaRepository.findByName("Learn Azure Now!"));
        System.out.println(courseSpringDataJpaRepository.findByName(""));
    }
}
