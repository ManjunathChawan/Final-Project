package com.generation.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Evaluation {
    private double average;
    private final List<Course> courses = new ArrayList<>();
    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, java.util.Date birthDate) {
        super(id, name, email, birthDate);
    }

   

    public void enrollToCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void registerApprovedCourse(Course course) {
        this.approvedCourses.put(course.getCode(), course);
    }

    public boolean isCourseApproved(String courseCode) {
        return approvedCourses.containsKey(courseCode);
    }

    public List<Course> findPassedCourses(Course course) {
        // Implement this method if needed
        return null;
    }

    public boolean isAttendingCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    public double getAverage() {
        return this.average;
    }

    public List<Course> getApprovedCourses() {
        return new ArrayList<>(approvedCourses.values());
    }

    public String toString() {
        return "Student {" + super.toString() + "}";
    }

    public void setAverage(double averageGrade) {
    }

    public Course[] getCourses() {
        return null;
    }
}
