
public class PrintNum1To100WithoutLoop
{
	
	public static int  printNum(int num)
	{
		if(num<=100)
		{
			System.out.print(num);
			num++;
			printNum(num);
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		
	     int num=1;	
         printNum(num);
	}

}
