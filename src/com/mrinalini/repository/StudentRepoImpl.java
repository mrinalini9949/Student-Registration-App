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
    
    public Student findById(int id) {
        return store.get(id);
    }
  
    public void update(Student student) {
        store.put(student.getRegistrationId(), student); 
        System.out.println("Repository: student updated");
    }
      
    public void delete(int id) {
        if (store.containsKey(id)) {
            store.remove(id);
            System.out.println("Repository: student deleted");
        } 
        else {
            System.out.println("Repository: ID not found");
        }
    }

}
