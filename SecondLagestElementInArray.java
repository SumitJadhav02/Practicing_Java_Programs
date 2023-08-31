
public class SecondLagestElementInArray 
{
   private static int SecondLargeElement(int[] arr)
   {
	   int i,j;
	   int temp;
	   int len=arr.length;
	   for(i=0; i<len; i++)
	   {
		   for(j=i+1; j<len; j++)
		   {
			   if(arr[i]<arr[j])
			   {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   
	   System.out.println("The second lagest element is "+arr[1]);
	   return 0;
   }
	public static void main(String[] args) 
	{
      int[] arr= {10,12,45,32,15,62,85};
      SecondLargeElement(arr);
	}

}
