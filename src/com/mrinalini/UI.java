package com.mrinalini;

import com.mrinalini.controller.StudentController;
import com.mrinalini.controller.StudentControllerImpl;
import com.mrinalini.repository.StudentRepo;
import com.mrinalini.repository.StudentRepoImpl;
import com.mrinalini.service.StudentService;
import com.mrinalini.service.StudentServiceImpl;

public class UI {

	public static void main(String[] args) {
		addstudent();
	}

	 private static void addstudent() {
		 StudentRepo repo = new StudentRepoImpl();
		 StudentService service = new StudentServiceImpl(repo);
		 StudentController controller = new StudentControllerImpl(service);
		 
		 controller.addstudent();
	    } 
		
	}

	

	


