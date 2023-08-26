import java.util.Scanner;

public class ArmstrongNumber_WithinRange
{
   public int armstrongWithinRange(int a , int b)
   {
	   for(int i=a; i<=b; i++)
	   {
		   int n1=i;
		   int len=0;
		   while(n1!=0)
		   {
			   n1/=10;
			   len++;
		   }
		   
		   int n2=i;
		   int rem;
		   int sum=0;
		   while(n2!=0)
		   {
			   rem=n2%10;
			   sum+=Math.pow(rem, len);
			   n2/=10;
		   }
		   if(sum==i)
		   {
			   System.out.println(sum);
		   }
	   }
	   return 0;
   }
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range of the number like a to b");
       int a =sc.nextInt();
       int b =sc.nextInt();
       ArmstrongNumber_WithinRange aa = new ArmstrongNumber_WithinRange();
       aa.armstrongWithinRange(a, b);
	}

}
