package a2oj;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		st=sc.next();
		char[] ar = st.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]=='.') System.out.print(0);
			else if(ar[i]=='-') {
				if(ar[i+1]=='.') {
						i++;
					 System.out.print(1);
				}
				else {
					i++;
					 System.out.print(2);
				}
					
			}
		}
	}
}
