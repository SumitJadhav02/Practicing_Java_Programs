import java.util.Scanner;
public class NumIsOddOrEvenWithoutModulusOperator 
{

	private static int findOddEven(int n)
	{
		int result=n/2;
		
		if((result*2)==n)
		{
			System.out.println(n+" is a Even number");
		}
		else
		{
			System.out.println(n+" is a Odd number");
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		findOddEven(n);

	}

}
