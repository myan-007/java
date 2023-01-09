package a2oj;

import java.util.Iterator;
import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		i=sc.nextInt();
		while(true) {
			i++;
			if(check(i)) {
				System.out.println(i);
				break;
			}
			
		}
	
	}

	private static boolean check(int i) {
		int[] ar =new int[4];
		ar[0]=(i/1000)%10;
		ar[1]=(i/100)%10;
		ar[2]=(i/10)%10;
		ar[3]=(i/1)%10;
		for (int j = 0; j < ar.length; j++) {
			for (int j2 = 0; j2 < ar.length; j2++) {
				if(j2!=j && ar[j]==ar[j2]) {
					return false;
				}
			}
		}
		return true;
		
		
	}

	
}
