
public class Duplicate_Number_From_Array 
{
  private int duplicateNumber(int[] arr)
  {
	  int i,j;
	  int cnt=0;
	  for( i=0; i<arr.length; i++)
	  {
		  for(j=i+1; j<arr.length; j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  System.out.println(arr[i]);
			  }
		  }
	  }
	  return 0;
  }
	public static void main(String[] args) 
	{
      int[] arr= {4,5,6,8,421,11,24,57,21,1,2,5};
      Duplicate_Number_From_Array a = new Duplicate_Number_From_Array();
      a.duplicateNumber(arr);
	}

}
