package user;


import java.util.*;
import java.util.regex.Pattern;

public class Strings {

	
	static void Anagram(String a,String b) {
		boolean flag = true;
		int[] ca= new int[127];
		Arrays.fill(ca, 0);
		for(int i =0;i<a.length();i++) {
			
			if((int)a.charAt(i)<91)
			{
				++ca[(int)a.charAt(i)];
				++ca[(int)a.charAt(i)+32];
			}
			else {
				++ca[(int)a.charAt(i)];
				++ca[(int)a.charAt(i)-32];
			}
			System.out.println(a.charAt(i)+"  "+ca[(int)a.charAt(i)]);
		}
		System.out.println("\n\n\n");
		for(int i =0;i<b.length();i++) {
			if((int)b.charAt(i)<91)
			{
				
				--ca[(int)b.charAt(i)];
				--ca[(int)b.charAt(i)+32];;
			}
			else {
				--ca[(int)b.charAt(i)];
				--ca[(int)b.charAt(i)-32];
			}
			
			System.out.println(b.charAt(i)+"  "+ca[(int)b.charAt(i)]);
		}
		for(int i =0;i<127;i++) {
			if(ca[i]!=0)
			{
				flag=false;
				break;
			}
		}
		if(flag) System.out.println("anagram");
		else System.out.println("not anagram");
	}
	
	
	
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
//        String B=sc.next();
//        sc.close();
//        System.out.println(A.length()+B.length());
//        if (A.compareTo(B)>=0) {
//        	System.out.println("Yes");
//		}
//        else {
//			System.out.println("No");
//		}
//        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
//        A.substring(0,1);
        //abba    //madam
        //even   //odd
        //0-1	// 0-1
//        boolean c=false;
//        for(int i=0,j=A.length()-1;i<A.length()/2;j--,i++) {
//        	if(A.charAt(i)==A.charAt(j)) {
//        		c=true;
//        		continue;
//        	}
//        	else
//        	{
//        		c=false;
//        		break;
//        	}
//         }
//        if(c) System.out.println("Yes");
//        else System.out.println("No");
//        Anagram("Hello","hello");
        String[] t = A.split("[\\s\\-\\.\\'\\?\\,\\_\\@]+");
        for (String a : t) {
        	
            System.out.println(a);
        }
       Pattern.compile(A);
       double tn;
       
    }
     
}

