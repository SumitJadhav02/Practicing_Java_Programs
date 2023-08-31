
public class BubbleSort 
{

	public static void main(String[] args) 
	{
      int[] arr= {10,9,8,7,6,5,4,3,2,1};
      int cnt;
      int temp;
      int len=arr.length;
      for(int i=0; i<len; i++)
      {
    	  cnt=0;
    	  for(int j=0; j<len-1-i; j++)
    	  {
    		 if(arr[j]>arr[j+1])
    		 {
    			 temp=arr[j];
    			 arr[j]=arr[j+1];
    			 arr[j+1]=temp;
    			 cnt=1;
    		 }
    		 
    		 if(cnt==0)
    		 {
    			 break;
    		 }
    	  }
      }
      
      for(int i=0; i<len; i++)
      {
    	  System.out.print(" "+arr[i]);
      }
	}

}
