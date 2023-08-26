import java.util.Scanner;

public class Even_OR_Odd_Number 
{

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number :");
       int n = sc.nextInt();
       
       if(n%2==0)
       {
    	   System.out.println("The Number is Even");
       }
       else
       {
    	   System.out.println("The Number Odd...");
       }
	}

}
