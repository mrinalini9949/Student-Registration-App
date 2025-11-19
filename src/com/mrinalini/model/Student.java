package com.mrinalini.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

    private int registrationId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String phoneNumber;              
    private String email;
    private LocalDateTime registrationDateTime;

    public Student() {}

    public Student(int registrationId, String firstName, String lastName, LocalDate dob,
                   String phoneNumber, String email, LocalDateTime registrationDateTime) {
        this.registrationId = registrationId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationDateTime = registrationDateTime;
    }

   
    public int getRegistrationId() { 
    	return registrationId; 
    	}
    public void setRegistrationId(int registrationId) { 
    	this.registrationId = registrationId;
    	}

    public String getFirstName() { 
    	return firstName; 
    	}
    public void setFirstName(String firstName) { 
    	this.firstName = firstName; 
    	}

    public String getLastName() { 
    	return lastName;
    	}
    public void setLastName(String lastName) { 
    	this.lastName = lastName; 
    	}

    public LocalDate getDob() { 
    	return dob; 
    	}
    public void setDob(LocalDate dob) { 
    	this.dob = dob; 
    	}

    public String getPhoneNumber() { 
    	return phoneNumber; 
    	}
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber; 
    	}

    public String getEmail() {
    	return email;
    	}
    public void setEmail(String email) { 
    	this.email = email; 
    	}

    public LocalDateTime getRegistrationDateTime() {
    	return registrationDateTime; 
    	}
    public void setRegistrationDateTime(LocalDateTime registrationDateTime) { 
    	this.registrationDateTime = registrationDateTime; 
    	}

      public String toString() {
        return "\nStudent Details " +
                "\nRegistration ID: " + registrationId +
                "\nName: " + firstName + " " + lastName +
                "\nDOB: " + dob +
                "\nPhone: " + phoneNumber +
                "\nEmail: " + email +
                "\nRegistered At: " + registrationDateTime +
                "\n";
    }
}
