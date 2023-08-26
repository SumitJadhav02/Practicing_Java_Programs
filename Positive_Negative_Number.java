import java.util.Scanner;

public class Positive_Negative_Number
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number :");
	   int number = sc.nextInt();
	   
	   if(number>0)
	   {
		   System.out.println(number +" is Positive....");
	   }
	   else if(number<0)
	   {
		   System.out.println(number +" is Negative....");
	   }
	   else
	   {
		   System.out.println(number +"ZERO ");
	   }
	}
}
