import java.util.Scanner;

public class Reverse_The_Number 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number :");
	  int n = sc.nextInt();
	  int rev=0;
	  while(n!=0)
	  {
		  rev=(rev*10)+n%10;
		  n=n/10;
	  }
	  System.out.println(rev);
	}
}
