//Write a program to accept a number from the user and then outputs the number with the 
//digits reversed. For example, if the input is 12345, the output should be 54321.

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, d, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		System.out.print("Reversed number is: ");
		
		for(;num>0||num<0;)
		{
			d=num%10;
			System.out.print(d);
			num=num/10;
		}

	}

}
