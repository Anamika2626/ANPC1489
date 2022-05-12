//WAP to accept a no from user and find out the factorial.

import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, num;
		float fac=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fac= fac*i;
		}
		System.out.println("Factorial of"+num+"is: "+fac);

	}

}
