//WAP to accept two no and choice from user for arithmetic operation and display the output

import java.util.Scanner;

public class Switch_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, choice, add, sub, mul,div, mod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num1=sc.nextInt();
		System.out.println("Enter any number:");
		num2=sc.nextInt();
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			add= num1 + num2;
			System.out.println("Addition is: "+add);
			break;
		case 2:
			sub= num1 - num2;
			System.out.println("Subtraction is: "+sub);
			break;
		case 3:
			mul= num1 * num2;
			System.out.println("Multiplication is: "+mul);
			break;
		case 4:
			div= num1 / num2;
			System.out.println("Division is: "+div);
			break;
		case 5:
			mod= num1 % num2;
			System.out.println("Modulus is: "+mod);
			break;
	    default:
	    	System.out.println("Invalid choice");
	    	break;
				
		}

	}

}
