package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed(String studentId) {
        return students.containsKey(studentId);
    }
    
    public void showSummary() {
        System.out.println("Student Service Summary:");
    
        for (Student student : students.values()) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Is Subscribed: " + isSubscribed(student.getId()));
            System.out.println("Enrolled Courses:");
            for (Course course : student.getCourses()) {
                System.out.println(course);
            }
            System.out.println("Approved Courses:");
            for (Course course : student.getApprovedCourses()) {
                System.out.println(course);
            }
            System.out.println("------------------------------");
        }
    }
    

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
