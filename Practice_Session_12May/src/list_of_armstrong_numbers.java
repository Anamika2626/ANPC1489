//WAP to display armstrong no between 1 to 1000

public class list_of_armstrong_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, dc, d, count=0, pro=1, sum=0;
		System.out.println("Armstrong numbers are:");
		for(num=1;num<=1000;num++)
		{
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
				System.out.println(num);
			}
			sum=0;
			count=0;
		}

	}

}
