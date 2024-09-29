package sis.entity;

public class Enrollment {
	private int enrollmentID;
	private int studentID;
	private String courseID;
	private String enrollmentDate;
	
//	constructor
	
	public Enrollment(int enrollmentID, int studentID, String courseID, String enrollmentDate) {
		super();
		this.enrollmentID = enrollmentID;
		this.studentID = studentID;
		this.courseID = courseID;
		this.enrollmentDate = enrollmentDate;
	}
	
//	getters and setters

	public int getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(int enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
//	toString

	@Override
	public String toString() {
		return "Enrollment [enrollmentID=" + enrollmentID + ", studentID=" + studentID + ", courseID=" + courseID
				+ ", enrollmentDate=" + enrollmentDate + "]";
	}
}
