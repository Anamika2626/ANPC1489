import java.util.Scanner;

public class logical extends bitwise
{
	void logicalOperator()
	{
	int x;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number: ");
	x=sc.nextInt();
	if(x>0||x<0)
	{
		System.out.println(x);
	}
	}

}
