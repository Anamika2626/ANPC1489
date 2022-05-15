//WAP to accept a no from user and check it is armstrong or not
//153 = 1^3+5^3+3^3 

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, dc, d, count=0, pro=1, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		int temp=num;
		
		//counting number of digits
		while(temp>0)
		{
			dc=temp%10;
			count++;
			temp=temp/10;
		}
		temp=num;
		//Separating the digits
		while(temp>0)
		{
			d=temp%10;
			pro=(int)Math.pow(d, count);
			sum=sum+pro;
			temp=temp/10;
		}
		//Checking if the sum is equal to original number or not
		if(sum==num)
		{
			System.out.println(num+" is an Armstrong number");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number");
		}

	}

}
