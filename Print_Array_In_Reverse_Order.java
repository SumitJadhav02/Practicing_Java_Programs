
public class Print_Array_In_Reverse_Order 
{
  private int printReverseArray(int[] arr)
  {
	  int i;
	   for(i=arr.length-1; i>=0; i-- )
	   {
		   System.out.print(" "+arr[i]);
	   }
	  return 0 ;
  }
	public static void main(String[] args) 
	{
     int[] arr= {1,2,3,4,5,6,7,8,9,10};
     Print_Array_In_Reverse_Order a = new Print_Array_In_Reverse_Order();
     a.printReverseArray(arr);
	}

}
