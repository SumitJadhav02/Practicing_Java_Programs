import java.util.Scanner;

public class Greatest_Of_Three_Numbers 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the three numbers :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       if(a>b && a>c)
       {
    	   System.out.println("The Gretest number is "+a);
       }
       else if(b>a && b>c)
       {
    	   System.out.println("The Gretest number is "+b);
       }
       else if(c>a && c>b)
       {
    	   System.out.println("The Gretest number is "+c);
       }
       else
       {
    	   System.out.println("Equal numbers");
       }
       
	}
}
