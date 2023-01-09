package cses;

//import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Missingnumber {

	 

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 long n;
		Map<Long,Integer> m = new  HashMap<>();
		n= sc.nextInt();
		long[] a= new long[(int)n];
		for(long i=1;i<=n;i++) {
			
			m.put(i,0);
		}
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextLong();
			m.replace(a[i], 1);
		}
//		System.out.println(m);
		for(long i=1;i<=n;i++) {
			if(m.get(i)==0) {
				System.out.println(i);
				break;
			}
		}
	}	
}
