import java.util.*;
class Task1
{
	public static void main(String args[])
	{
		int choice,no,i;
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Do you want to play the game ?");
		System.out.println("Enter Choice");
		System.out.println("1 : Yes & 2 : No");
		choice = sc.nextInt();
		
		while(choice == 1)
		{
		int rand_no = rand.nextInt(100);
		
		System.out.println("Random Number is generated ");
		System.out.println("Now you have only 3 Chance");
		
		for (i=1;i<=3;i++)
		{
			System.out.println("Enter Number");
			no=sc.nextInt();
			
			if(no==rand_no)
			{
				System.out.println("Your guess is correct");
				System.out.println("Congrasulations !!You won the game");
			}
			else if(no>rand_no)
			{
				if(no-rand_no>50)
				{
					System.out.println("Your Number is very far from Random Number");
				}
				
				else if(no-rand_no>25 && no-rand_no<50)
				{
					System.out.println("Your Number is far from Random Number");
				}
				
				else if(no-rand_no<25)
				{
					System.out.println("Your Number is not very far from Random Number");
				}
				
				else if(no-rand_no<10)
				{
					System.out.println("Your Number is closer to Random Number");
				}
				
				else if(no-rand_no<5)
				{
					System.out.println("Your Number is very close to Random Number");
				}
			}
			else if(no<rand_no)
			{
				if(rand_no-no>50)
				{
					System.out.println("Your Number is very far from Random Number");
				}
				
				else if(rand_no-no>25 && rand_no-no<50)
				{
					System.out.println("Your Number is Far from Random Number");
				}
				
				else if(rand_no-no<25)
				{
					System.out.println("Your Number is not very far from Random Number");
				}
				
				else if(rand_no-no<10)
				{
					System.out.println("Your Number is closer to Random Number");
				}
				
				else if(rand_no-no<5)
				{
					System.out.println("Your Number is very close to Random Number");
				}		
			}			
		}
		System.out.println("Now Game is Over");
		
		System.out.println("Random Number is "+rand_no);
		
		System.out.println("Do you wanna play it again ?");
		
		System.out.println("If yes please Enter 1");
		
		System.out.println("If No please Enter 2"); 
		
		choice=sc.nextInt();
		
		}
		System.out.println("Exit From Game ");
	}
}