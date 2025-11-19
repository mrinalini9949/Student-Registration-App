package com.mrinalini.service;

import com.mrinalini.model.Student;
import com.mrinalini.repository.StudentRepo;

public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;
   
     


    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

  
    public void addstudent(Student student) {
        
        studentRepo.save(student);
        System.out.println("Service: Student saved successfully!");
    }
}
