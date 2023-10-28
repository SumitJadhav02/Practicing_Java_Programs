/* 
 Largest Sum Contiguous Subarray (Kadane’s Algorithm)
  Link : https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 
  */
public class Kadane 
{

	private int lagestSumOfArray(int[] arr)
	{
		int max_so_far = Integer.MIN_VALUE;
		int max_ending = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			max_ending+=arr[i];
			if(max_so_far<max_ending)
			{
				max_so_far=max_ending;
			}
			
			if(max_ending<0)
			{
				max_ending=0;
			}
		}
		return max_so_far;
	}
	public static void main(String[] args) 
	{
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		Kadane k = new Kadane();
		System.out.println(k.lagestSumOfArray(arr));
	}

}
