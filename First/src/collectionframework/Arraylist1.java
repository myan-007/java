package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Arraylist1 {

	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(1);
//		System.out.println(a.size());
//		a.add(2);
//		a.add(45);
//		a.add(34);
//		System.out.println(a.size());
//		a.add(434);
//		a.add(2,90);
//		for (Integer i : a) {
//			System.out.print(i+",");
//		}
		Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        ArrayList<Integer> as =new ArrayList<>();
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<List<Integer>> v =new ArrayList<>();
        ArrayList<String> s1 =new ArrayList<>();
        ArrayList<String> s2 =new ArrayList<>();
        s1.get(0).equals(s2.get(8));
        while(n!=0){
            int d;
            d=sc.nextInt();
            as.add(d);
           
            for(int i=0;i<d;i++){
                a.add(i,sc.nextInt());
              } 
            n--;
        }
        
        n=sc.nextInt();
        while(n!=0){
            int l,in;
            int sum=0;
            l=sc.nextInt();
            in=sc.nextInt();
            for(int i=0;i<as.size();i++) {
            	sum+=as.get(i);
            }
//            System.out.println(sum);
            int sum1=0;
            for(int i=0;i<l;i++) {
            	sum1+=as.get(i);
            }
            int k;
            k=(sum-sum1)+(in-1);
            if(in>as.get(l-1)) {
            	System.out.println("ERROR!");
            }
            else {
            	System.out.println(a.get(k));
            }
            n--;
           
        }
//        
		
	
	}

}
