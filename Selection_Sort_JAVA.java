import java.util.Scanner;
public class Selection_Sort_JAVA 
{
	
	private static int selectSort(int[] a,int len)
	{
		int i,j;
		int temp;
		int min;
		for(i=0; i<len; i++)
		{
			min=i;
			for(j=i+1; j<len; j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(i=0; i<len; i++)
		{
			System.out.print(" "+a[i]);
		}
		return 0;
	}

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of the length of thee array :");
       int len=sc.nextInt();
       int[] a= new int[len];
       System.out.println("Enter the array :");
       int i;
       for(i=0; i<len; i++)
       {
    	   a[i]=sc.nextInt();
       }
       selectSort(a,len);
       
	}

}
