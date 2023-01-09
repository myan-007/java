package user;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solutioncc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
//	    Scanner sc = new Scanner(System.in);
//	    int t= sc.nextInt();
//	    while(t--!=0) {
//	        int D,d,a,b,c;
//	        D=sc.nextInt();
//	        d=sc.nextInt();
//	        a=sc.nextInt();
//	        b=sc.nextInt();
//	        c=sc.nextInt();
//	       // System.out.println(a);
//	       // System.out.println(b);
//	       // System.out.println(c);
//	        int total=0;
//	        total=D*d;
//	        int ans=0;
//	       // System.out.println(total);
//	            if(total>=10 && total<21){
//	            ans+=a;
//	            total=total-10;
//	            }
//	           // System.out.println(total);
//	           // System.out.println("Ans= "+ans);
//		        if(total>=21 && total<42){
//	            ans+=b;
//	            total=total-21;
//	           // System.out.println("Ans= "+ans);
//	            }
//		        if(total>=42){
//	            ans+=c;
//	           // System.out.println("Ans= "+ans);
//	            }
//	            System.out.println(ans);
//	        }
		Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t--!=0) {
	        int g,n;
	        g= sc.nextInt();
	        n= sc.nextInt();
	        int people=0;
	        int[] d = new int[10];
	        for(int i=0;i<10;i++){
	            d[i]=sc.nextInt();
	            if(i>g-1){
	                people+=d[i];
	            }
	        }
	        int days,rdays;
	        long st;
	        st=sc.nextLong();
	        int k=0;
	        days=(people/n)+1;
	        rdays=people%n;
	        if(rdays!=0){
	            k=(d[g-1]+rdays)/n;
	           }
	       int max,min;
	       max=days+k;
	       min=days;
	        System.out.println(min+" "+max);
	        
	        
	        } 
	    }
}

