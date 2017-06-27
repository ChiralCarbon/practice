package practice;
import java.util.Scanner;

public class Longest_increasing_subsequence {
	public static int longest(int arr[])
	{
		int i=0;
		int max_=1;
		int dp[]=new int[arr.length];
		for(i=0;i<arr.length;i++)
		{
			dp[i]=1;
		}
		for(i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					if((dp[j]+1)>dp[i])
						dp[i]=dp[j]+1;
				}
			}
			if(dp[i]>max_)
				max_=dp[i];
		}
		return max_;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println(longest(arr));
	}
}
