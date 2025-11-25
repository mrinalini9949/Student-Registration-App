package com.mrinalini.repository;

import com.mrinalini.model.Student;

public interface StudentRepo {
    void save(Student student);
    Student findById(int id);
    void update(Student student);
    void delete(int id);

}
