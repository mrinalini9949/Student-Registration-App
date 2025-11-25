package com.mrinalini.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.mrinalini.model.Student;
import com.mrinalini.service.StudentService;

public class StudentControllerImpl implements StudentController {
    private StudentService studentService;

    public StudentControllerImpl(StudentService studentService){
        this.studentService = studentService;
    }


    public void addstudent() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Registration ID (integer): ");
            int registrationId = Integer.parseInt(sc.nextLine());

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();   

            System.out.print("Enter DOB (dd-MM-yyyy): ");
            String dobInput = sc.nextLine();
            LocalDate dob = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            System.out.print("Enter Phone Number: ");
            String phoneNumber = sc.nextLine();   

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            LocalDateTime dateTime = LocalDateTime.now();

            Student student = new Student(
                    registrationId,
                    firstName,
                    lastName,
                    dob,
                    phoneNumber,
                    email,
                    dateTime
            );

            studentService.addstudent(student);

            System.out.println("Student Registered Successfully!");

        } 
        catch (Exception e) {
            System.out.println("Error while registering student: " + e.getMessage());
        }
    }     
 
    public void updatestudent() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Registration ID to update: ");
            int id = Integer.parseInt(sc.nextLine());   

            Student student = studentService.getstudent(id);

            if (student == null) {
                System.out.println("No student found with ID: " + id);
                return;
            }
           
            System.out.println("Current Student Details:");
            System.out.println(student);

            System.out.println("Enter new details");

            System.out.print("First Name: ");
            String firstname = sc.nextLine();
            if (!firstname.isEmpty()) {
                student.setFirstName(firstname);
            }

            System.out.print("Last Name: ");
            String lastname = sc.nextLine();
            if (!lastname.isEmpty()) {
                student.setLastName(lastname);
            }

            System.out.print("DOB (dd-MM-yyyy): ");
            String dobString = sc.nextLine();
            if (!dobString.isEmpty()) {
                try {
                    LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    student.setDob(dob);
                } 
                catch (Exception e) {
                    System.out.println("Invalid DOB format");
                }
            }

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();
            if (!phone.isEmpty()) {
                student.setPhoneNumber(phone);
            }

            System.out.print("Email: ");
            String email = sc.nextLine();
            if (!email.isEmpty()) {
                student.setEmail(email);
            }

            
            studentService.updatestudent(student);

            System.out.println("Student Updated Successfully");

        } 
        catch (Exception e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }
    
    public void deletestudent() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Registration ID to delete: ");
            int id = Integer.parseInt(sc.nextLine());

      
            Student student = studentService.getstudent(id);

            if (student == null) {
                System.out.println("No student found with ID: " + id);
                return;
            }

            System.out.println("Student Found:");
            System.out.println(student);

            System.out.print("Are you sure you want to delete? (Yes/No): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("Yes")) {
                studentService.deletestudent(id);
                System.out.println("Student Deleted Successfully.");
            } else {
                System.out.println("Delete stopped.");
            }

        } 
        catch (Exception e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
    
    public void viewstudent() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Registration ID to view: ");
            int id = Integer.parseInt(sc.nextLine());

            Student student = studentService.getstudent(id);

            if (student == null) {
                System.out.println("No student found with ID: " + id);
                return;
            }

            System.out.println("Student Details : ");
            System.out.println(student);

        } 
        catch (Exception e) {
            System.out.println("Something went wrong while viewing student: " + e.getMessage());
        }
     
    }

}

