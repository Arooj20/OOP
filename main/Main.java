/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author arooj fatima
 */
public class Main {
    public static void main(String[] args) {
        // Creating Courses
        Course course1 = new Course("CS101", "Introduction to Programming");
        Course course2 = new Course("CS102", "Data Structures");
        Course course3 = new Course("CS103", "Database Systems");

        // Creating Students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Enrolling students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course2);
        student2.enrollCourse(course3);

        // Displaying student details along with their enrolled courses
        System.out.println("Student 1 Details:");
        student1.displayStudent();
        student1.displayEnrolledCourses();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudent();
        student2.displayEnrolledCourses();
    }
}

