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

import java.util.Scanner;

public class GradeBookTest {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String userCourse; // user input for course
		String userInstructor; // user input for instructor
		
		GradeBook gradeBook1 = new GradeBook(
				"CS254 Intro to Object Oriented Program Design", "Dave Harden");
		
		System.out.println("Enter user course: ");
		userCourse = input.nextLine();
		System.out.println("Enter user instructor: ");
		userInstructor = input.nextLine();
		
		GradeBook gradeBook2 = new GradeBook(userCourse, userInstructor);
		
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
		
		input.close();
	}
}

/*
Enter user course: 
Biol100 Introduction to the Life Sciences
Enter user instructor: 
Ellen Young
Welcome to the grade book for 
CS254 Intro to Object Oriented Program Design
This course is presented by: Dave Harden
Welcome to the grade book for 
Biol100 Introduction to the Life Sciences
This course is presented by: Ellen Young
*/