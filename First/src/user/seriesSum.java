package user;
import java.util.Scanner;
public class seriesSum {
	public static void main(String[] arg)
	{
		int n;
		float ans=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)ans-=1f/i;
			else ans+=1f/i;
		}
		System.out.print("Sum is :"+ans);
	}
	
}
