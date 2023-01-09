package user;

import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("heyyy");
		int a=0,b=1,c=1,n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(c+" ");
		    c=a+b;
		    a=b;
		    b=c;
		}

	}

}
