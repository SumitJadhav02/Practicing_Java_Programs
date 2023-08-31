
public class DuplicateElementInTheArray 
{
  private static int FindDuplicateElement(int[] arr)
  {
	  int i, j;
	  int len=arr.length;
	  System.out.print("Duplicate elements are :");
	  for(i=0; i<len; i++)
	  {
		  for(j=i+1; j<len; j++)
		  {
			  if(arr[i]==arr[j] && i!=j)
			  {
				  System.out.print(" "+arr[j]);
			  }
		  }
	  }
	  return 0;
  }
	public static void main(String[] args) 
	{
      int[] arr= {1,2,3,8,5,2,6};
      FindDuplicateElement(arr); 
	}

}
