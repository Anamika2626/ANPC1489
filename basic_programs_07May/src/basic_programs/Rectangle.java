//WAP to accept l , b from user and calculate AR , PR

package basic_programs;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l, b;
		float AR,  PR;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any length=");
		l=sc.nextInt();
		System.out.println("Enter any breadth=");
		b=sc.nextInt();
		AR= l*b;
		PR= 2*(l+b);
		System.out.println("Area of a Rectangle is" +AR);
		System.out.println("Perimeter of a Rectangle is"+PR);

	}

}
