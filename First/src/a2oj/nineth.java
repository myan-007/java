package a2oj;

import java.util.*;
import java.util.Scanner;

public class nineth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n;
		n=sc.nextLong();
		int c=0;
		List<Integer> ar = int_tointar(n);
		for (Integer integer : ar) {
			if(integer==4 || integer==7) {
				c++;
			}
		}
		if(c==4 || c== 7) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

	static List<Integer> int_tointar(Long n) {
		
		List<Integer> ar = new ArrayList<>();
		while(n>0) {
			ar.add((int)(n%10));
			n=n/10;
		}
		
//		System.out.println(ar);
		return ar;
	}

}
