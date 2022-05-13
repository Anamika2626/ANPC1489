//WAP to accept a no from user and check it is prime or not

import java.util.Scanner;

public class Prime_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, d;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
	    num = sc.nextInt();
	    
	    for(d=1;d<=num;d++)
	    {
	    	if(num%d==0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println(num+" is a prime number");
	    }
	    else
	    {
	    	System.out.println(num+" is not a prime number");
	    }
	}

}
