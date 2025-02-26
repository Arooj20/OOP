/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author arooj fatima
 */
public class Student {
    public String name;
    public int rollno;
    public String dept;
    
    
    Student ()
    {
        this.name = "unkmow";
        this.rollno = 0;
        this.dept = "unknown";
        
    }
    
    Student (String n, int r, String d)
    {
        this.name = n;
        this.rollno = r;
        this.dept = d;
        
    }

    
    
    public void displaystudentdata()
    {
        System.out.println(" THE OUTPUT OF DATA : ");
        System.out.println(" Your name = " + name);
        System.out.println(" Your roll number = " + rollno);
        System.out.println(" Your department  = " + dept);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanString = new Scanner (System.in);
       Scanner scanInt = new Scanner (System.in);
       
       
        System.out.println("Enter your name = ");
        String name = scanString.nextLine();
        System.out.println("Enter your roll number = ");
        int rollno = scanInt.nextInt();
        System.out.println("Enter your department = ");
        String dept = scanString.nextLine();
        
     
        Student s = new Student (name , rollno , dept);
        
        s.displaystudentdata();
       
   
    }
    
}