/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author arooj fatima
 */
public class Course {
    private String courseCode;
    private String courseName;

    // Constructor
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
    }
}

