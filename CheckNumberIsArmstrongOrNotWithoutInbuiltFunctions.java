import java.util.Scanner;

public class CheckNumberIsArmstrongOrNotWithoutInbuiltFunctions 
{
	
	public int checkAramstrong(int n)
	{
		int n1=n;
		int len=0;
		while(n1!=0)
		{
			n1/=10;
			len++;
		}
		//System.out.println(len);
		
		int n2=n;
		int arm=0;
		while(n2!=0)
		{
			int rem;
			
			int i;
			int mul=1;
			rem=n2%10;
			for(i=1; i<=len; i++)
			{
				mul*=rem;
			}
			arm+=mul;
			n2/=10;
		}
		
		if(arm==n)
		{
			System.out.println("The number is Armstrong ...");
		}
		else
		{
			System.out.println("Not Armstrong number...");
		}
		return 0;
	}
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number :");
       int n = sc.nextInt();
       CheckNumberIsArmstrongOrNotWithoutInbuiltFunctions a = new CheckNumberIsArmstrongOrNotWithoutInbuiltFunctions();
       a.checkAramstrong(n);
	}
}
