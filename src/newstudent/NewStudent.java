package newstudent;

import java.util.Scanner;

public class NewStudent {

	public static void main(String[] args) {
		
		
		//ask how many users we want to add
		System.out.print("Enter no. of students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Student[] students= new Student[n];
		
		
		//create n no. of new students
		for(int i=0;i<n;i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payAmount();
			System.out.println(students[i].toString());
		}

	}

}
