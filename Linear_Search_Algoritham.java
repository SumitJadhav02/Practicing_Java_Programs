
public class Linear_Search_Algoritham {

	private static int linearSearch(int[] arr, int len,int element)
	{
		int i;
		int cnt=0;
		for(i=0; i<len; i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+" is found at "+(i+1)+" position :");
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("Element not found in the list :");
		}
		return 0;
	}
	public static void main(String[] args)
	{
      int[] arr= {45,23,63,12,75,94,32,15,12,16,18,94,96,32};
      int len=arr.length;
      int element=23;
      linearSearch(arr,len,element);
	}

}
