// WAP to accept R from user and calculate AC , CC

package basic_programs;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r, AC, CC, pi;
		pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius=");
		r=sc.nextFloat();
		AC= pi*r*r;
		CC= 2*pi*r;
		System.out.println("Area of a Circle is" +AC);
		System.out.println("Circumference of a Circle is" +CC);

	}

}
