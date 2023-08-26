import java.util.Scanner;

public class Prime_Numbers_Between_Range
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range as a to b :");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int i,j;
       int cnt=0;
       
       for(i=a; i<=b; i++)
       {
    	   for(j=2; j<=i-1; j++)
    	   {
    		   if(i%j==0)
    		   {
    			   cnt++;
    		   }
    	   }
    	   
    	   if(cnt==0)
    	   {
    		   System.out.println(" "+i);
    	   }
    	   else
    	   {
    		   cnt=0;
    	   }
       }
	}
}
