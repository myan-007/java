package user;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++) {
		
		ar[i]=sc.nextInt();
	}
	int t;
	t=sc.nextInt();
	search(ar,n,t);
	rotationalsearch(ar,n,t);
}

private static void rotationalsearch(int[] ar, int n, int t) {
	int start=0;
	int end = n-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(ar[mid]==t) {
			System.out.println(mid);
			return;
		}
		else { if(ar[mid]>=ar[start]) {
				if( ar[mid]>t && t>ar[start]) {
					end=mid-1;
				}	
				else {
					start=mid+1;
				}
		}
			else if(ar[mid]<ar[end]) {
				if(ar[mid]<t && t<ar[end]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}
		
	}
	System.out.println(-1);
}

private static void search(int[] ar, int n, int t) {
	

	int start=0,end=n-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(ar[mid]==t) {
			System.out.println(mid+1);return;
			}
		else if(t<ar[mid]) {
			end=mid-1;
		}
		else
			start=mid+1;
	}
	System.out.println(-1);
}
}
