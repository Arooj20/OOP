/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author arooj fatima
 */
import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
    }

    // Enroll in a course
    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
    }

    // Display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Enrolled Courses:");
        for (Course c : enrolledCourses) {
            c.displayCourse();
        }
    }
}
