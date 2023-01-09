package a2oj;

import java.util.*;
public class third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,t;
		n=sc.nextInt();
		t=sc.nextInt();
		String s = sc.next();
		char[] st = s.toCharArray();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < st.length; i++) {
			if(st[i]=='B') b.add(i);
		}
//		System.out.println(b);
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < b.size(); j++) {
				if((b.get(j)+1)!=n && st[b.get(j)+1]=='G') {
					st[b.get(j)]='G';
					st[b.get(j)+1]='B';
					b.set(j, b.get(j)+1);
				}
				else {
					continue;
				}
			}
		}
		for (char c : st) {
			System.out.print(c);
		}
	}
}
