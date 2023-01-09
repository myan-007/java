package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Klargest {

	public static void main(String[] args) {
		int k=2;
		
		int[] arr = {1,2,3,4,56,656,7,785,666,5,4,5,6,7,8,4,9,67,64,4,7};
		int n=arr.length;
		Mysolution s = new Mysolution();
		ArrayList<Integer> a =  s.kLargest(arr,n,k); 
		System.out.println(a);
	}
}
 class Mysolution
{
    //Function to return k largest elements from an array.
     ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
    	 PriorityQueue<Integer> p = new PriorityQueue<>(k);
 		
 		for(int i=0;i<n;i++){
             if(i<k) {
             	p.add(arr[i]);
             }
             else {
             	if(p.peek()<arr[i]) {
             		p.remove();
             		p.add(arr[i]);
             	}
             }
         }
 		ArrayList<Integer> a = new ArrayList<>(p);
 		Collections.sort(a,Collections.reverseOrder());
 		return a;
    }
}

