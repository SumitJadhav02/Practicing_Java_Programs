import java.util.Scanner;

public class RotateArrayByKStepsToLeft 
{

	private static void rotate(int[] a , int k)
	{
		
		
		for(int i=0; i<k; i++)
		{
		int first = a[0];
		
		for(int j=0; j<a.length-1; j++)
		{
			a[j] = a[j+1];
		}
		
		a[a.length-1]=first;
		}
		
		for(int j=0; j<=a.length-1; j++)
		{
			System.out.print(" "+a[j]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
       int[] arr = {10,11,12,13,14,15,16,17,18,19,20};
       
       System.out.println("Enter by how many steps you want to rotate given array?");
       int k = sc.nextInt();
       
       rotate(arr,k);
	}

}
