import java.util.*;
public class MoveArraysToEndPreserveOrder
{
    private static void moveArraysToEnd(int[] arr, int len)
    {
        if(len ==0 || len ==1)
        {
            return;
        }
        
        int z=0;
        int nz=0;
        
        while(nz < len)
        {
            if(arr[nz] != 0)
            {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }
            else
            {
                nz++;
            }
        }
        
        System.out.print(Arrays.toString(arr));
        
    }
	public static void main(String[] args) 
	{
	  int[] arr = {5,0,1,0,4,0,2,0,3};
	  int l = arr.length;
	  moveArraysToEnd(arr,l);
	}
}
