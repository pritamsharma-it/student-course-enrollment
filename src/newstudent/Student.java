package newstudent;

import java.util.Scanner;

public class Student {
	private String firstName;
    private String lastName;
    private int stream;
    private String course="";
    private int tutionfee;
    private String studentID;
    private static int costOfCourses = 600;
    private static int id = 100;
    
	//constructor for user to enter names and class
	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter students first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter students last name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1. Science\n2.Arts\n3.Commerce\nEnter students grade: ");
		this.stream = sc.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + stream + " " + studentID);

	}
	//generate ID of 4-digit
	private void setStudentID() {
		id++;
		studentID = stream + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter courses to enroll (E to end): ");
			Scanner sc = new Scanner(System.in);
			String courses = sc.nextLine();
			if(!courses.equals("E")) {
				course = course + "\n  " + courses;
				tutionfee = tutionfee + costOfCourses;
			}
			else {
				break;
			}
		}while(1 != 0);
			
		//System.out.print("Enrolled in:  " + course);
		//System.out.print("\nTotal amount:  Rs." + tutionfee);

		 
	}
	
	//total AMOUNT
	public void viewTotalAmount() {
		System.out.println("\nAmount to pay: Rs."+ tutionfee);
	}
	
	//pay fee
	void payAmount() {
		viewTotalAmount();
		System.out.print("Enter amount u can pay: ");
		Scanner sc= new Scanner(System.in);
		int payment= sc.nextInt();
		tutionfee=tutionfee-payment;
		System.out.println("Thankyou for the payment of: Rs."+ payment);
		//viewTotalAmount();
	}
	
	//show status
	public String toString() {
		return "\nName: " + firstName + " " + lastName+ 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled in: " + course +
				"\nAmount to be paid: Rs." + tutionfee;
	}
}
