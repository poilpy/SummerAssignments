/*
 * Colin Murphy
 * CS254
 * 6-26-15
 * Harden
 * GradeBookTest.Java
 * 
 * This program creates a GradeBook object.
 * GradeBook1 is constructed to provide the name and instructor for CIS254.
 * GradeBook2 is constructed to allow the user to input their own course name and instructor.
 */

public class GradeBook {
	private String courseName;
	private String courseInstructor;
	
	public GradeBook(String name, String instructor){
	
		courseName = name;
		courseInstructor = instructor;
	}
	
	public void setCourseName(String course){
		
		courseName = course;
	}
	
	public String getCourseName(){
		
		return courseName;
	}
	
	public void setInstructorName(String instructor){
		
		courseInstructor = instructor;
	}
	
	public String getInstructorName(){
		
		return courseInstructor;
	}
	
	public void displayMessage(){
		
		System.out.println("Welcome to the grade book for \n" + getCourseName() +"\nThis course is presented by: " + getInstructorName());
	}
}
