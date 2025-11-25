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

   public Student getstudent(int id) {
        return studentRepo.findById(id);
    }
   
   public void updatestudent(Student student) {
        studentRepo.update(student);
    }
    
   public void deletestudent(int id) {
        studentRepo.delete(id);
    }

}
