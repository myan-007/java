package cf;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class gm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			
			String st;
			st = sc.nextLine();
			char[] a = st.toCharArray();
			
			int l = search(a,'a');
//			System.out.println(l);
			if(l<0) {
				System.out.println("no");
				continue;
			}
			int r;
			r=l;
			boolean f = true;
			for (int i = 1; i < a.length; i++) {
				int pos=search(a, (char)('a'+i));
//				System.out.println((char)('a'+i));
				if(pos<0 || (pos!=l-1 && pos!=r+1)) {
					f=false;
					break;
				}
				else {
					l=Math.min(l, pos);
					r=Math.max(r, pos);
				}
			}
			if(f) System.out.println("yes");
			else System.out.println("no");

		}

	}

	private static int search(char[] a, char c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(a[i]==c) {
				return i;
			}
			
		}
		return -1;
	}

	
}