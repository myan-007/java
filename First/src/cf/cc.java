package cf;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class cc {
	public static void main(String[] args) throws IOException {
		
//		int t=r.nextInt();
//		while(t-->0) {
//			int a;
//			a=r.nextInt();
//			String temp = Integer. toString(a);
//			int[] ar = new int[temp. length()];
//			for (int i = 0; i < temp. length(); i++)
//			ar[i] = temp. charAt(i) - '0';
//		int n;
//		n=r.nextInt();
//		
//	
//		for (int i = 0; i <n; i++) {
//			
//			String str=r.readLine();
////			System.out.print(str+" ");
//			char[] s = new char[str.length()];
//			s=str.toCharArray();
//			boolean f=true;
////			System.out.print(ar[i]+" ");
////			for (char c : s) {
////				System.out.print(c+" ");
////			}
//            if(s.length<=4)
//            {
//            	System.out.println("Error");
//              
//            }
//			else if(s[0]!='<' && s[1]!='/' && s[s.length-2]!='>') {
//				System.out.println("Error");
//			}
//			else {
//			for (int j = 2; j < str.length()-3; j++) {
////				System.out.print(s[j]+" "+(int)s[j]+" ");
//				if(!((s[j]>96 && s[j]<123) || (s[j]>47 && s[j]<58))) {
//					f=false;
//					break;
//				}
//			}
//			if(f)
//			System.out.println("Success");
//			else System.out.println("Error");
//			}
//			
//				
////			}
//			
//			
		Scanner sc = new Scanner(System.in);
	    int t;
	    t=sc.nextInt();
	    
	    while(t-->0){
	    	int n;
	    	n=sc.nextInt();
	        int[] ar = new int[n];
	        List<Integer> even = new ArrayList<>();
	        List<Integer> odd = new ArrayList<>();
	        
	        for (int i = 0; i <n; i++) {
				ar[i]=sc.nextInt();
				if(ar[i]%2==0)
					even.add(ar[i]);
				else
					odd.add(ar[i]);
				
			}
	       System.out.println(even);
	       System.out.println(odd);
	        for (Integer integer : even) {
				System.out.print(integer+" ");
			}
	        for (Integer integer : odd) {
				System.out.print(integer+" ");
			}
	    }
	}

}