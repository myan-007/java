package cf;

import java.util.Scanner;
import java.util.*;

public class findarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t-->0) {
			int n,a,b;
			n=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			String st;
			st=sc.next();
			char ar[] = st.toCharArray();
			char lastc=ar[0];
			int c=0;
			int i=0;
			while(i<n) {
				int j=i;
				while(j<n && ar[i]==ar[j]) {
					j++;
				}
				c++;
				i=j;
			}
			int p=(c/2)+1;
//			System.out.println(p);
			System.out.println(Math.max((n*(a+b)), ((a*n)+(p*b))));
			
		}

	}

}
