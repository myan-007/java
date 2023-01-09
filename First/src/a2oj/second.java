package a2oj;

import java.util.Iterator;
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=y=0;
		int[][] a = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]==1) {
					x=i;
					y=j;
				}
			}
		}
		System.out.println(Math.abs(x-2)+Math.abs(y-2));
		
		
	}
}
