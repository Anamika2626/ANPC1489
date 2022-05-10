//WAP to display your basic information

package basic_programs;

import java.util.Scanner;

public class information {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int age;
		String fname, lname;
		Scanner sc=new Scanner(System.in);
		fname=sc.nextLine();
		lname=sc.nextLine();
		age=sc.nextInt();
		System.out.println("Enter your first name:"+fname);
		System.out.println("Enter your last name:"+lname);
		System.out.println("Enter your age:"+age);
		
		
	}

}
