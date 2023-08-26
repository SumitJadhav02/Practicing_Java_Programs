import java.util.Scanner;

public class CheckNumberIsArmstrongOrNot 
{
	
	public int checkArmstrong(int n)
	{
		int n1=n;
		int len=0;
		while(n1!=0)
		{
			n1/=10;
			len++;
		}
		System.out.println(len);
		
		int n2=n;
		int rem;
		int sum=0;
		while(n2!=0)
		{
			rem=n2%10;
			sum+=Math.pow(rem, len);
			n2/=10;
		}
		
		if(sum==n)
		{
			System.out.println("The number is Armstrong...");
		}
		else
		{
			System.out.println("The Number is Not Armstrong...");
		}
		
		return 0;
	}
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ");
      int n = sc.nextInt();
      CheckNumberIsArmstrongOrNot a = new CheckNumberIsArmstrongOrNot();
      a.checkArmstrong(n);
	}
}
