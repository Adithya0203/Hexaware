package sis.entity;

public class Courses {
	private String courseID;
	private String courseName;
	private int credits;
	private int teacherID;
	
//	constructor
	
	public Courses(String courseID, String courseName, int credits, int teacherID) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.credits = credits;
		this.teacherID = teacherID;
	}
	
//	getters and setters

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	
//	toString

	@Override
	public String toString() {
		return "Courses [courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + ", teacherID="
				+ teacherID + "]";
	}
}
