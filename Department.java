/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author arooj fatima
 */
public class Department {
    public String deptname;
    public String depthead;
    
    
    Department ()
    {
        this.deptname = "unkmow";
        this.depthead = "unknown";
        
    }
    
    Department (String dn, String dh)
    {
        this.deptname = dn;
        this.depthead = dh;
        
    }

    
    
    public void displaydepartmentdata()
    {
        System.out.println(" THE OUTPUT OF DATA : ");
        System.out.println(" Your department name = " + deptname);
        System.out.println(" Your department head = " + depthead);
    }
   
    public static void main(String[] args) {
        
       Scanner scanString = new Scanner (System.in);
      
        System.out.println("Enter your department name = ");
        String deptname = scanString.nextLine();
        System.out.println("Enter your department head = ");
        String depthead = scanString.nextLine();
        
     
        Department d = new Department (deptname , depthead);
        
        d.displaydepartmentdata();
       
        
        
        
         
        
    }
    
}