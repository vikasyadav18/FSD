package SimplilearnProject;
import java.util.*;
public class LongestIncreasingSubsequence
{
	public static void main(String[] args) 
	{
	    int res=0;
	    int t=1;
	    int arr[]={10, 22, 9, 33, 21, 50, 41, 60 }; //10 22 33 50 60
	    int n=arr.length;
	    int check=0;
	    for(int i=0;i<n;i++)
	    {
	        check=arr[i];
	        for(int j=i;j<n-1;j++)
	        {
	            if(check<arr[j+1])
	            {
	                check=arr[j+1];
	               // System.out.println("j="+arr[j+1]);
	                t++;
	            }
	        }
	        if(res<=t)
	        {
	            res=t;
	        }
	        t=1;
	    }
	    System.out.println(res);		
	}
}
