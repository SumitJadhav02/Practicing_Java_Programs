import java.util.Scanner;

public class Fibonacci_Series_upto_nth_term 
{
    public int fibonacci(int n)
    {
    	int a=0;
    	int b=1;
    	int c;
    	System.out.print(" "+a);
    	System.out.print(" "+b);
    	
    	for(int i=0; i<n-2; i++)
    	{
    		c=a+b;
    		System.out.print(" "+c);
    		a=b;
    		b=c;
    	}
    	return 0;
    }
	
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      int n = sc.nextInt();
      Fibonacci_Series_upto_nth_term fibo = new Fibonacci_Series_upto_nth_term();
      fibo.fibonacci(n);
	}

}
