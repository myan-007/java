package oops;

import java.util.*;
import java.io.*;
class result{
	void case1() {
		System.out.println("1");
	}
	void case2() {
		System.out.println("2");
	}
	void case3() {
		System.out.println("3");
	}
}
/* Name of the class has to be "Main" only if the class is public. */
public class May4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t;
		int n;
		t=sc.nextInt();
		n=t;
		while (t!=0) {
			String g[] = new String[3];
			if(t==n) {
				sc.nextLine();	
			}
			for (int i = 0; i < g.length; i++) {
				g[i]=sc.nextLine();
			}
			
			t--;
		}
	}
}
