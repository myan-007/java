package a2oj;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] sum = new int[3];
		n=sc.nextInt();
		while(n-->0) {
			int x,y,z;
			x=y=z=0;
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			
			sum[0]=sum[0]+x;
			sum[1]=sum[1]+y;
			sum[2]=sum[2]+z;
		}
		
		if(sum[0]==0 && sum[1]==0 && sum[2]==0) {
			System.out.println("YES");
			
		}
		else System.out.println("NO");
		
	}
}
