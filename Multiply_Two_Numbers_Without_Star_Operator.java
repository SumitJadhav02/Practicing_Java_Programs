import java.util.Scanner;

public class Multiply_Two_Numbers_Without_Star_Operator
 {

	public int multiplicationWithoutStarOperator(int x, int y)
	{
		int i;
		int sum=0;
		for(i=1; i<=x; i++)
		{
			sum+=y;
		}
		System.out.println(x+" x "+y+" = "+sum);
		return 0;
	}
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the two numbers for performing multiplication :");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 Multiply_Two_Numbers_Without_Star_Operator star = new Multiply_Two_Numbers_Without_Star_Operator();
	 star.multiplicationWithoutStarOperator(a, b);
	}

}
