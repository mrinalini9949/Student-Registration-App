package com.mrinalini.service;

import com.mrinalini.model.Student;

public interface StudentService {

    void addstudent(Student student);  
    Student getstudent(int id);
    void updatestudent(Student student);
    void deletestudent(int id);


}
