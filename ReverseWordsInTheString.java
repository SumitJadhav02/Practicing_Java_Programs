

/*
Program Link : https://onlinegdb.com/TNb_gGk5T
*/


import java.util.Arrays;
public class ReverseWordsInTheString
{
    private static String reverseWorlds(String str)
    {
      String[] strArr=str.split("\\s+");
      System.out.println(Arrays.toString(strArr));
      
      int len =strArr.length;
      String ans ="";
      for(int i=len-1; i>0; --i)
      {
          ans+=strArr[i]+" ";
      }
      ans+=strArr[0];
      System.out.println(ans);
      return ans;   
    }
    
	public static void main(String[] args) 
	{
	    String str = "Hi my name is Lakhan";
		reverseWorlds(str);
	}
}
