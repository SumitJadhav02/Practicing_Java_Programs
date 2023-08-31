
public class SecondSmallestElementInArray
{
   private static int secondSmallestNumber(int[] arr)
   {
	   int len=arr.length;
	   int i, j;
	   int temp;
	   
	   for(i=0; i<len; i++)
	   {
		   for(j=i+1; j<len; j++)
		   {
			   if(arr[i]>arr[j])
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   System.out.println("The second minumum number in the array is "+arr[1]);
	   return 0;
   }
	
	public static void main(String[] args) 
	{
     int[] arr= {11,33,44,12,25,31,55,88,23};
     secondSmallestNumber(arr);
	}

}
