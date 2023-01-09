package cf;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int t;
//		t=sc.nextInt();
//		while(t-->0) {
//			int n;
//			n=sc.nextInt();
//			int[] a = new int[n];
//			for (int i = 0; i < n; i++) {
//				a[i]=sc.nextInt();
//			}
//			
//			Arrays.sort(a);
//			if(n==2) {
//				System.out.println(a[0]+" "+ a[1]);
//			}
//			else {
//			int p=0,diff=Integer.MAX_VALUE;
//			for (int i = 1; i < a.length; i++) {
//				if(diff>(a[i]-a[i-1])) {
//					diff=a[i]-a[i-1];
//					p=i;
//				}
//			}
//			
//			for (int i = p; i < a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
//			for (int i = 0; i < p; i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
//			}
////			int n,m;
////			int x,y;
////			n=sc.nextInt();
////			m=sc.nextInt();
////			x=sc.nextInt();
////			y=sc.nextInt();
////			sc.close();
////			System.out.println("1"+" 1 "+n+" "+m);
////			int sum=0;
////			int[] ar = new int[n];
////			for (int i = 0; i < n; i++) {
////				ar[i]=sc.nextInt();
////				sum=sum+ar[i];
////			}
////			if(sum==n) {
////				System.out.println("0");
////			}
////			else if(sum>n){
////				System.out.println(sum-n);
////				
////			}
////			else {
////				System.out.println("1");
////			}
////			
//			
//			
//			
//			
//			
//		}
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		Scanner sc = new Scanner(System.in);
//		int n, q;
//		n=sc.nextInt();
//		q=sc.nextInt();
//		int[] a = new int[n];
//	    for (int i=0;i<n ;i++ ){
//	        a[i]=sc.nextInt();
//	    } 
//	    Arrays.sort(a);
//	    while(q-->0){
//	        int x=sc.nextInt();
//	        check(a,x);    
//	    }
//		
//	}
//	static void check(int[] a,int x){
//	    int start=0;
//	    int end=a.length-1;
//	    int mid=0;
//	    if(x<a[0]) {
//	    	if((a.length)%2==0)
//		        System.out.println("POSITIVE");
//		    else
//		        System.out.println("NEGATIVE");
//	    	return;
//	    }
//	    else if(x>a[a.length-1]) {
//	    	System.out.println("POSITIVE");
//	    	return;
//	    }
//	    while(start<=end){
//	       mid=start+(end-start)/2;
//	        if(a[mid]==x){
//	            System.out.println("0");
//	            return;
//	        }
//	        else if(a[mid]<x){
//	            start=mid+1; 
//	        }
//	        else{
//	            end=mid;
//	        }
//	        if(start==end&& end==mid) break;
////	        System.out.println(mid+" "+a[mid]+" start "+start+" end "+end);
//	    }
//	    if((a.length-(mid))%2==0)
//	        System.out.println("POSITIVE");
//	    else
//	        System.out.println("NEGATIVE");
//	}
	public static void main (String[] args) throws java.lang.Exception
	{
		
			Reader sc = new Reader();
			int t;
			t=sc.nextInt();
			while(t-->0) {
				int n,m;
				n=sc.nextInt();
				m=sc.nextInt();
				
				char[][] a = new char[n][m];
				for (int i = 0; i < n; i++) {
					String s = sc.readLine();
					 for (int j = 0; j <m; j++) {
						a[i][j]=s.charAt(j);
					}
				}
				int f=0;
				for(int i =0;i<n;i++) {
					for(int j=0;j<m;j++) {
						if(a[i][j]=='0') {
							f=f^0;
						}
						else f=f^1;
					}
				}
				if(f==1) System.out.println("YES");
				else System.out.println("NO");
			}
		
		
	}
	static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
}
