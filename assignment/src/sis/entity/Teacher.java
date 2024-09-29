package sis.entity;

public class Teacher {
	private int teacherID;
	private String firstName;
	private String lastName;
	private String email;
	
//	constructor
	
	public Teacher(int teacherID, String firstName, String lastName, String email) {
		super();
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
//	getter and setter
	
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	toString

	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
}
