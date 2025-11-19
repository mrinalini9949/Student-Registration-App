package com.mrinalini.repository;
import java.util.HashMap;
import java.util.Map;
import com.mrinalini.model.Student;

public class StudentRepoImpl implements StudentRepo {
   
	private Map<Integer, Student> store = new HashMap<>();

    public void save(Student student) {
        store.put(student.getRegistrationId(), student);
        System.out.println("Repository: student saved");
    }
}
