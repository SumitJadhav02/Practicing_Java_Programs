
public class Minimum_Value_From_Array 
{
	
	private int minimumArray(int[] arr)
	{
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		System.out.println("The minimum number from the list of the array is "+min);
		return 0;
	}
	public static void main(String[] args) 
	{
       int[] arr= {4,2,8,6,52,3,45,22,3};
       Minimum_Value_From_Array a = new Minimum_Value_From_Array();
       a.minimumArray(arr);
	}
}
