//WAP to accept age and gender from user and display RI(m above 60:7%IR) (f above 60 : 7.5% IR)
//(Below  60 m, f 5%IR)

import java.util.Scanner;

public class Nested_loop_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age, choice;
		char gender, m, f;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Rate of Interest for male\n2.Rate of Interest for female");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter your age: ");
			age=sc.nextInt();
			System.out.println("Enter your gender: ");
			gender=sc.next().charAt(0);
			
			if(age>=60 && gender=='m') {
				System.out.println("Rate of Interest is 7%");
			}
			else if(age<60 && gender=='m'){
				System.out.println("Rate of Interest is 5%");
			}
			break;
		case 2:
			System.out.println("Enter your age: ");
			age=sc.nextInt();
			System.out.println("Enter your gender: ");
			gender=sc.next().charAt(0);
			
			if(age>=60 && gender=='f') {
				System.out.println("Rate of Interest is 7.5%");
			}
			else if(age<60 && gender=='f') {
				System.out.println("Rate of Interest is 5%");
			}
			break;
					
		}

	}

}
