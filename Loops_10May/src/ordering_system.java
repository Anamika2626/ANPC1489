import java.util.Scanner;

public class ordering_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice, ch;
		int qty=0;
		char ans;
		float total, quantity;
		float amt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t------- Bubble's Food Corner -------\t\t");
		do 
		{
		System.out.println("Choose your preference\n");
		System.out.println("1.Starters\n2.Main Courses\n3.Desserts");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("\t\t------ Starters ------\t\t");
			System.out.println("Pick your preference\n");
			do
			{
				System.out.println("1.Spring Roll   50/-\n2.Chicken Chrispy   100/-\n3.Paneer Chilli   80/-");
				ch=sc.nextInt();
				System.out.println("Quantity?: ");
				qty=sc.nextInt();
				if(ch==1)
				{
					System.out.println("You have ordered "+qty+" Spring Roll\n");
					amt=amt+(50*qty);
				}
				else if(ch==2)
				{
					System.out.println("You have ordered "+qty+" Chicken Chrispy\n");
					amt=amt+(100*qty);
				}
				else if(ch==3)
				{
					System.out.println("You have ordered "+qty+" Paneer Chilli\n");
					amt=amt+(80*qty);
				}
				else
				{
					System.out.println("Invalid Choice");
				}
				System.out.println("Do you want to add another item from Starters?\nEnter y for Yes and n for No");
			    ans=sc.next().charAt(0);	
			}while(ans=='y'||ans=='Y');
			break;
			
		case 2:
			System.out.println("\t\t------ Main Courses ------\t\t");
			System.out.println("Pick your preference\n");
			do
			{
				System.out.println("1.Butter Naan   100/-\n2.Veg Pulao   150/-\n3.Butter Chicken   180/-");
				ch=sc.nextInt();
				System.out.println("Quantity?: ");
				qty=sc.nextInt();
				if(ch==1)
				{
					System.out.println("You have ordered "+qty+" Butter Naan\n");
					amt=amt+(100*qty);
				}
				else if(ch==2)
				{
					System.out.println("You have ordered "+qty+" Veg Pulao\n");
					amt=amt+(150*qty);
				}
				else if(ch==3)
				{
					System.out.println("You have ordered "+qty+" Butter Chiecken\n");
					amt=amt+(180*qty);
				}
				else
				{
					System.out.println("Invalid Choice\n");
				}
				System.out.println("Do you want to add another item from Main Course?\nEnter y for Yes and n for No");
			    ans=sc.next().charAt(0);	
			}while(ans=='y'||ans=='Y');
			break;
			
		case 3:
			System.out.println("\t\t------ Desserts ------\t\t");
			System.out.println("Pick your preference\n");
			do
			{
				System.out.println("1.Apple Pie   90/-\n2.Sizzling Brownie   100/-\n3.Choco Lava Cake   95/-");
				ch=sc.nextInt();
				System.out.println("Quantity?: ");
				qty=sc.nextInt();
				if(ch==1)
				{
					System.out.println("You have ordered "+qty+" Apple Pie\n");
					amt=amt+(90*qty);
				}
				else if(ch==2)
				{
					System.out.println("You have ordered "+qty+" Sizzling Brownie\n");
					amt=amt+(100*qty);
				}
				else if(ch==3)
				{
					System.out.println("You have ordered "+qty+" Choco Lava Cake\n");
					amt=amt+(95*qty);
				}
				else
				{
					System.out.println("Invalid Choice\n");
				}
				System.out.println("Do you want to add another item from Desserts?\nEnter y for Yes and n for No");
			    ans=sc.next().charAt(0);	
			}while(ans=='y'||ans=='Y');
			break;
		}
		
		System.out.println("Do you want to add another item?\\nEnter y for Yes and n for No");
		ans=sc.next().charAt(0);
		
		}while(ans=='y'||ans=='Y');
		
		System.out.println("Your order is on the way\n");
		quantity= qty+qty;
		total = amt+(amt*18)/100;
		System.out.println("Total Item: "+quantity+"\nYour Bill: "+total+"/-");
		System.out.println("\t\t      \tThank you for visiting!!\t      \t\t");
		
	}

}
