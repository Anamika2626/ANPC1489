import java.util.Scanner;

public class armstrong {
	
	void armstrong()
	{
		int num, dc, d, count=0, pro=1, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		int temp=num;
		
		while(temp>0)
		{
			dc=temp%10;
			count++;
			temp=temp/10;
		}
		temp=num;
		while(temp>0)
		{
			d=temp%10;
			pro=(int)Math.pow(d, count);
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is an Armstrong number\n");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number\n");
		}

	}

}
