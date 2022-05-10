// WAP to accept two no from user and find out addition,subtraction,multiplication,division,mod

package basic_programs;

import java.util.Scanner;

public class Arithmetic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, add, sub, mul, div, mod;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter any number="+num1);
		System.out.println("Enter any number="+num2);
		add= num1 + num2;
		sub= num1 - num2;
		mul= num1 * num2;
		div= num1 / num2;
		mod= num1 % num2;
		System.out.println("The addition is="+add);
		System.out.println("The subtraction is="+sub);
		System.out.println("The multiplication is="+mul);
		System.out.println("The division is="+div);
		System.out.println("The mod is="+mod);

	}

}
