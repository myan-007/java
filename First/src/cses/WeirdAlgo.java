package cses;

import java.util.Scanner;

public class WeirdAlgo {
public static void main(String[] args) {
	
	long n;
	Scanner sc = new Scanner(System.in);
	n= sc.nextLong();
//	System.out.print(n+" ");
	start(n);
	sc.close();
}

private static void start(long n) {
	if(n==1) {
		System.out.println(1);
		return;
	}
	
	if(n%2==0) {
		System.out.print(n+" ");
		n=n/2;
		
		start(n);
	}
	else {
		System.out.print(n+" ");
		n=(n*3)+1;
		
		start(n);
	}
	
	
	
	
	
}
}
