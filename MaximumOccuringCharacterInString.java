
public class MaximumOccuringCharacterInString 
{
	public static void main(String[] args) 
	{
      String name="sumeet";
      int len= name.length();
      int[] arr = new int[127];
      
      for(int i=0; i<len; i++)
      {
    	  arr[name.charAt(i)]=arr[name.charAt(i)]+1;
      }
      
      int max=arr[0];
      char c=' ';
      for(int i=0; i<len; i++)
      {
    	  if(arr[name.charAt(i)]>max)
    	  {
    		  max=arr[name.charAt(i)];
    		  c=name.charAt(i);
    	  }
      }
      System.out.println("The maximum occuring character is "+c);
	}

}
