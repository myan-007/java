package user;


import java.util.*;
public class InsertSort {
	
	static int min(int a[],int j) {
		int min=j;
		for (int i =j; i < a.length; i++) {
			if(a[i]<a[min])
			{
				min=i;
				
			}
		}
		return min;
	}
	
public static void main(String[] args) {
	
	int a[];
	Scanner sc= new Scanner(System.in);
	a = new int[5];
	for (int i=0;i<5;i++) {
		a[i]=sc.nextInt();
		
	}
	
	int min;
	int t;
	for(int i=0 ;i<a.length;i++)
	{
		min=min(a,i);
		
		t=a[i];
		a[i]=a[min];
		a[min]=t;
		
	}
	for (int i : a) {
		System.out.print(i+" ");
	}
}
}
/*
5 4 3 2 1
1 4 3 2 5
1 2 3 4 5
*/