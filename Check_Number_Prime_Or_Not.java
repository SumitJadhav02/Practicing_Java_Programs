import java.util.Scanner;

public class Check_Number_Prime_Or_Not 
{
	
	public int CheckPrime(int n)
	{
		int i;
        int cnt=0;
        for(i=2; i<n; i++)
        {
        	if(n%i==0)
        	{
        		cnt++;
        	}
        }
        
        if(cnt==0)
        {
        	System.out.println("Number "+n+" is Prime Number...");
        }
        else
        {
        	System.out.println("The Number "+n+" is Not a prime Number ");
        }
		return 0;
	}
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        Check_Number_Prime_Or_Not  prime = new Check_Number_Prime_Or_Not();
        prime.CheckPrime(n);
	}

}
