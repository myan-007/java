package user;
import java.util.Scanner;
public class Sort2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int a[]= new int[5];
	
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			int minid = i;
			for(int j=i;j<5;j++)
			{
				if(a[j]<a[minid])
				{
					minid=j;
				}
			}
			int t=a[i];
			a[i]=a[minid];
			a[minid]=t; 
		}
		for(int n: a)
		{
			System.out.print(n+" ");
		}
	}
}
