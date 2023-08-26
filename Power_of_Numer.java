import java.util.Scanner;

public class Power_of_Numer 
{
    public int power(int a, int b) // 2 3  8
    {
    	int result=1;
    	for(int i=1; i<=b; i++)
    	{
    		result=result*a;
    	}
    	System.out.println(result);
    	return 0;
    }
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number :");
       int a = sc.nextInt();
       System.out.println("Enter the power :");
       int b = sc.nextInt();
       Power_of_Numer p = new Power_of_Numer();
       p.power(a, b);
	}
}
