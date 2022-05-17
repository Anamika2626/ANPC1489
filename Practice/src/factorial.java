import java.util.Scanner;

public class factorial extends addition
{
	
	void fact()
	{
		int n, i, temp, fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		temp=n;
		while(temp>0)
		{
			fact=fact*temp;
			temp--;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
