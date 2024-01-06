import java.util.*;
public class Main
{
    public void duplicateCharacter(String str)
    {
        int len = str.length();
        String newStr = str.toLowerCase();
        char[] string = newStr.toCharArray();
        int cnt=0;
        int i,j;
          System.out.println("Duplicate characters  from [ "+str+" ] are :");
        for(i=0; i<len; i++)
        {
            cnt=1;
            for(j=i+1; j<len; j++)
            {
                if(string[i] == string[j])
                {
                    cnt++;
                    string[j]='0';
                }
            }
            
            
          
            if(cnt>1 && string[i]!='0' && string[i]!=' ')
            {
                System.out.print(string[i]+" ");
            }
        }
        
    }
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String :");
	   String str = sc.nextLine();
	   
	   Main main = new Main();
	   main.duplicateCharacter(str);
	}
}
