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

        } catch (Exception e) {
            System.out.println("Error while registering student: " + e.getMessage());
        }
    }


}
