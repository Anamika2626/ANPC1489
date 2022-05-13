//WAP to list down even numbers from 1 to 1000.

public class Listing_prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, d;
		int factors;
		for(num=1;num<=1000;num++)
		{
			factors=0;
			for(d=1;d<=num;d++)
			{
				if(num%d==0)
				{
					factors++;
				}
			}
			if(factors==2)
			{
				System.out.println(num);
			}
		}
		
	}

}
