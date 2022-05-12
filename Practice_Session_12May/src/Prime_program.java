//WAP to accept a no from user and check it is prime or not

import java.util.Scanner;

public class Prime_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		for(i=2;i<=num/i;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is not a prime number.");
				break;
			}
			else
			{
				System.out.println(num+" is a prime number.");
				break;
			}
		}

	}

}
