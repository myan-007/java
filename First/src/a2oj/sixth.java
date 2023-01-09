package a2oj;

import java.util.Scanner;

public class sixth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[3][3];
		int[][] rs = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ar[i][j]=sc.nextInt();
				if(ar[i][j]%2==0) {
					ar[i][j]=0;
				}
				else ar[i][j]=1;
			}
		}
		
		
		
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rs[i][j]+=ar[i][j];
				if(ar[i][j]==1) {
					
					if(i+1<3)
					rs[i+1][j]++;
					if(i-1>=0)
					rs[i-1][j]++;
					if(j+1<3)
					rs[i][j+1]++;
					if(j-1>=0)
					rs[i][j-1]++;
				}
			}
		
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(rs[i][j]%2==0) {
					System.out.print(1);
				}
				else 
					System.out.print(0);
			}
			System.out.println();
		}
		/*
		 * 101		201		211
		 * 100		201		211
		 * 101		101		111
		 */
		
		
		
	}

}
