package practice;
import java.util.Scanner;
public class lcs_dp {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two strings");
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		int len1=s1.length()+1;
		int len2=s2.length()+1;
		int dp[][]=new int[len1][len2];
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				dp[i][j]=0;
			}
		}
		for(int i=1;i<len1;i++)
		{
			for(int j=1;j<len2;j++)
			{
				dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j-1]+1);
				}
			}
		}
		System.out.println(dp[len1-1][len2-1]);
	}

}
