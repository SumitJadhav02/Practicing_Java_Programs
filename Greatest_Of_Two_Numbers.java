import java.util.Scanner;

public class Greatest_Of_Two_Numbers 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the two numbers :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       if(a>b)
       {
    	   System.out.println("The Gretest number is "+a);
       }
       else if(a<b)
       {
    	   System.out.println("The Gretest number is "+b);
       }
       else
       {
    	   System.out.println("Equal numbers");
       }
       
	}
}
