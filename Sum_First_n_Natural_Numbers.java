import java.util.Scanner;

public class Sum_First_n_Natural_Numbers 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n :");
       int n = sc.nextInt();
       int i;
       int sum=0;
       for(i=1; i<=n; i++)
       {
    	   sum=sum+i;
       }
       System.out.println("The Sum of First "+n+" Natural Numbers is :"+sum);
       
	}

}
