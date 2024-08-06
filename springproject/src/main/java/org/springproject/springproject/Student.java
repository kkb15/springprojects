package org.springproject.springproject;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	//Create Getter Setter method
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	//create class constructor
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	//consturctor using superclass
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//To string method
	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
}
