import java.util.Scanner;

public class Sum_Of_Num_In_Given_Range 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Range a To b :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int i;
       int sum=0;
       for(i=a; i<=b; i++)
       {
    	  sum=sum+i; 
       }
       System.out.println("The Sum of Numbers int the rage of "+a+" To "+b+"  is :"+sum);
     }

}
