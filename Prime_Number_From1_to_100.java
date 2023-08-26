
public class Prime_Number_From1_to_100 
{
	public int PrimeNumberList1_to_100()
	{
		int cnt=0;
		int i,j;
		for(i=1; i<=100; i++)
		{
			for( j=2; j<=i-1; j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(" "+i);
			}
			else
			{
				cnt=0;
			}
			
			
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Prime_Number_From1_to_100 p = new Prime_Number_From1_to_100();
		p.PrimeNumberList1_to_100();
	}
}
