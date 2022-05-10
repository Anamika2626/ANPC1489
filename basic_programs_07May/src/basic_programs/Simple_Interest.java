//WAP to accept p,r,n from user and calculate SI

package basic_programs;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p, r, n, SI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount=");
		p=sc.nextInt();
		System.out.println("Enter Rate of Interest=");
		r=sc.nextInt();
		System.out.println("Enter duration of loan=");
		n=sc.nextInt();
		SI= (p*r*n)/100;
		System.out.println("Simple Interest is="+SI);

	}

}
