import java.util.Scanner;

public class count_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, s, e, pos=0, neg=0, z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting point: ");
		s=sc.nextInt();
		System.out.println("Enter ending point: ");
		e=sc.nextInt();
		
		for(n=s;n<=e;n++)
		{
			if(n>0)
			{
				pos++;
			}
			else if(n<0)
			{
				neg++;
			}
			else 
			{
				z++;
			}
		}
		System.out.println("Number of Positive numbers: "+pos);
		System.out.println("Number of negative numbers: "+neg);
		System.out.println("Number of zeros: "+z);

	}

}
