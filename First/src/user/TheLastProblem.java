package user;

import java.util.Scanner;

public class TheLastProblem {

	public static void make(int[][] l) {
		for (int i = 0; i <=1000; i++) {
			l[i][0]=(i+1)*(i+2)/2;
			for (int j = 1; j <= 1000; j++) {
				l[i][j]=l[i][j-1]+j-1+i-1;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] d =new int[1001][1001];
		make(d);
		int t=sc.nextInt();
		while(t-->0) {
			int x1,y1;
			int x2,y2;
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			
			int rs=0;
			for (int i = x1-1; i <=x2-1 ; i++) {
				rs+=d[i][y1-1];
			}
			for (int i = y1-1; i <=y2-1 ; i++) {
				rs+=d[x2-1][i];
			}
			System.out.println(rs);
		}
	

	}

}
