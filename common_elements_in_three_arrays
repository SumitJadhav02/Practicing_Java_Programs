/* Find common elements in three sorted arrays
   Program Link : https://onlinegdb.com/T6mUMWhiB
Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80

Input: 
ar1[] = {1, 5, 5} 
ar2[] = {3, 4, 5, 5, 10} 
ar3[] = {5, 5, 10, 20} 
Output: 5, 5


*/

public class Main
{
    
    public static int commonElements(int[] a, int[] b, int[] c)
    {
        int al = a.length;
        int bl = b.length;
        int cl = c.length;
        
        for(int i=0; i<al; i++)
        {
            for(int j=0; j<bl; j++)
            {
                for(int k=0; k<cl; k++)
                {
                    if(a[i]==b[j])
                    {
                        	if(b[j]==c[k])
                        	{
                        	    	System.out.println(c[k]);
                        	}
                    }
                }
            }
        }
        
        return 0;
    }
	public static void main(String[] args)
	{
	    int[] a ={10,20,30,40,50,60};
	    int[] b ={50,60,70,80,90,100,};
	    int[] c ={40,50,60,70,80};
	    
	
		commonElements(a, b, c);
	}
}
