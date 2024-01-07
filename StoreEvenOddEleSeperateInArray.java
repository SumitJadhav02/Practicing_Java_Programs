
/*
Java Program to Store Even & Odd Elements of an Array into Separate Arrays
Given an array with N numbers and separate those numbers into two arrays by odd numbers or even numbers.
The complete operation required O(n) time complexity in the best case.
For optimizing the memory uses, the first traverse through an array and calculate the total number of even and odd numbers in it. 
Create two arrays with size calculated after traversing and start storing them.

Below is the implementation of the above approach:

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	   int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	   int len = arr.length;
	   int i;
	   int evenLength=0, oddLength=0;
	   for(i=0; i<len; i++)
	   {
	       if(arr[i]%2==0)
	       {
	           evenLength++;
	       }
	       else
	       {
	           oddLength++;
	       }
	   }
	   
	   int[] evenArr = new int[evenLength];
	   int[] oddArr = new int[oddLength];
	   
	   int k=0;
	   int l=0;
	   for(i=0; i<len; i++)
	   {
	       if(arr[i]%2==0)
	       {
	           evenArr[k++] = arr[i];
	       }
	       else
	       {
	           oddArr[l++] = arr[i];
	       }
	   }
	   
	   System.out.println("Even number Array :");
	   System.out.println(Arrays.toString(evenArr));
	   
	   	   System.out.println("Odd number Array :");
	   System.out.println(Arrays.toString(oddArr));
	}
}

/*
OUTPUT :

Even number Array :
[2, 4, 6, 8, 10, 12, 14]

Odd number Array :
[1, 3, 5, 7, 9, 11, 13, 15]

*/
