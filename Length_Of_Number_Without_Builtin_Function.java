import java.util.Scanner;

public class Length_Of_Number_Without_Builtin_Function
{

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number :");
       int n= sc.nextInt();
       int cnt=0;
       while(n!=0)
       {
    	   n=n/10;
    	   cnt++;
       }
       System.out.println(cnt);
	}

}
