package com.StudentRegistrationApp.student;

public class Student {

        private String RegistrationId;
	    private String FirstName;
	    private String LastName;
	    private String Dob;
	    private String PhoneNumber;
	    private String Email;
	    private String RegistrationDateTime;

	    public Student() {}

	    public Student(String RegistrationId, String FirstName, String LastName, String Dob,
	                   String PhoneNumber, String Email, String RegistrationDateTime) {
	        this.RegistrationId = RegistrationId;
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.Dob = Dob;
	        this.PhoneNumber = PhoneNumber;
	        this.Email = Email;
	        this.RegistrationDateTime = RegistrationDateTime;
	    }

	    public String getRegistrationId() { 
	    	return RegistrationId; 
	    	}
	    public void setRegistrationId(String RegistrationId) { 
	    	this.RegistrationId = RegistrationId; 
	    	}
	    public String getFirstName() { 
	    	return FirstName; 
	    	}
	    public void setFirstName(String FirstName) { 
	    	this.FirstName = FirstName; 
	    	}
	    public String getLastName() { 
	    	return LastName; 
	    	}
	    public void setLastName(String LastName) {
	    	this.LastName = LastName; 
	    	}
	    public String getDob() {
	    	return Dob; 
	    	}
	    public void setDob(String Dob) { 
	    	this.Dob = Dob; 
	    	}
	    public String getPhoneNumber() { 
	    	return PhoneNumber; 
	    	}
	    public void setPhoneNumber(String PhoneNumber) { 
	    	this.PhoneNumber = PhoneNumber; 
	    	}
	    public String getEmail() {
	    	return Email; 
	    	}
	    public void setEmail(String Email) { 
	    	this.Email = Email; 
	    	}
	    public String getRegistrationDateTime() {
	    	return RegistrationDateTime;
	    	}
	    public void setRegistrationDateTime(String RegistrationDateTime) {
	    	this.RegistrationDateTime = RegistrationDateTime; 
	    	}

	    public String toString() {
	        return "\nStudent Details " +
	                "\nRegistration ID: " + RegistrationId +
	                "\nName: " + FirstName + " " + LastName +
	                "\nDOB: " + Dob +
	                "\nPhone: " + PhoneNumber +
	                "\nEmail: " + Email +
	                "\nRegistered At: " + RegistrationDateTime +
	                "\n";
	    }
	}


