//Write a program that reads a set of integers, and then prints the sum of the even 
//and odd integers.

import java.util.Scanner;

public class sum_of_even_and_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, s, e;
		int even=0, odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting point: ");
		s=sc.nextInt();
		System.out.println("Enter Ending point: ");
		e=sc.nextInt();
		
		for(i=s;i<=e;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Sum of even numbers: "+even);
		System.out.println("Sum of odd numbers: "+odd);
	}

}
