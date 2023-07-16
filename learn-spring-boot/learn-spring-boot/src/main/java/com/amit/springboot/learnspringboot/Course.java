package com.amit.springboot.learnspringboot;

public class Course {
    private Integer id;
    private String courseName;
    private String author;

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course(Integer id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
