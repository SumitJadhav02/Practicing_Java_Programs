import java.util.Scanner;

public class Factorial_of_Numbers 
{
   public int factorial(int n)
   {
	   int mul=1;
	   for(int i=1; i<=n; i++)
	   {
		   mul=mul*i;
	   }
	   System.out.println(mul);
	   return 0;
   }
	public static void main(String[] args) 
	{		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number :");
      int n = sc.nextInt();
      Factorial_of_Numbers f = new Factorial_of_Numbers();
      f.factorial(n);
	}
}
