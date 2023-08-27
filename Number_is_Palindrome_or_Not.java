import java.util.Scanner;

public class Number_is_Palindrome_or_Not
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int n2=n;
		int rev=0;
		while(n2!=0)
		{
			rev=(rev*10)+n2%10;
			n2=n2/10;
		}
		if(n==rev)
		{
			System.out.println("The number is palindrome....");
		}
		else
		{
			System.out.println("The Number is not palindrome");
		}
		
	}

}
