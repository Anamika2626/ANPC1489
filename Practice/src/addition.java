import java.util.Scanner;

public class addition extends armstrong
{
	
	void add()
	{
		int x, y, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		sum=x+y;
		System.out.println("Sum of given numbers: "+sum);
	}

}
