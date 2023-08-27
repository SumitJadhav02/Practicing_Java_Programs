
public class Highest_Number_In_Array
{

	private int maxArray(int[] arr)
	{
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value from the array is "+max);
		return max;
	}
	
	public static void main(String[] args) 
	{
       int[] arr= {11,44,55,66,88,99,55,10,203,545,581,555,663,44,444};
       Highest_Number_In_Array m= new Highest_Number_In_Array();
       m.maxArray(arr);
	}

}
