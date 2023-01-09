package user;
import java.util.*;
import java.lang.*;

class Main
{
	static boolean isValid(int[] ar,int cows,int mid){
		int count =1;
		int lastpos=ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]-lastpos>=mid){
				lastpos=ar[i];
				count++;
			}
			if(count==cows){
				return true;
			}
		}
		return false;
		
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
			int n;
			int k,result=0;
			n=sc.nextInt();
			k=sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
//			System.out.println("hey");
			Arrays.sort(a);
			int s=1,l=n;
			while(s<=l){
				int mid=s+(l-s)/2;
				if(isValid(a,k,mid)){
					s=mid+1;
					result=mid;
				}
				else {
				
					l=mid-1;
				}
			}
			System.out.println(result);
		}
	}
}