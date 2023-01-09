package begin;

import java.util.*;
import java.awt.Graphics;


public class NewClass {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      int b = sc.nextInt();
      
      
      	for(int i=0 ;i<l;i++) {
      		for(int j=0;j<b;j++) {
      			if(i==0 || j==0 || i==(l-1) || j==(b-1)) {
      				System.out.print("* ");
      			}
      			else {
      				System.out.print("  ");
      			}
      		}
      		System.out.println();
      	}
		
		for(int i=-4;i<=4;i++) {
		for(int j=0;j< Math.abs(i);j++) {
			System.out.print(" ");
		}
		for(int j=Math.abs(i);j<(9-Math.abs(i));j++) {
			
			System.out.print("*");
		}
		for(int j=(9-Math.abs(i));j<9;j++) {
			System.out.print(" ");
		}
		System.out.print("\n");
		}
	}

}
