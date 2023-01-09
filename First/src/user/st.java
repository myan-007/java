package user;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class st {
	public static void main(String[] args) throws IOException {
		 
		int t;
		Reader sc = new Reader();
		t=sc.nextInt();
		while(t-->0) {
			int n;
			n=sc.nextInt();
			List<Integer> x = new ArrayList<>();
			List<Integer> y = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				x.add(sc.nextInt());
				y.add(sc.nextInt());	
			}
			Collections.sort(x);
			Collections.sort(y);
			
			int xpos=-1;
			int xsum=Integer.MAX_VALUE;
			int tmp=0;int l=0;
			for(int i=n-1;i>=0;i--) {
			
				if(i<=n-3) l=x.get(n-1)-tmp;
				if((x.get(i)-x.get(0)+ l)<xsum) {
					xsum=x.get(i)-x.get(0)+ l;
					xpos=i;
				}
				tmp=x.get(i);
				
			}
			int ysum=Integer.MAX_VALUE;tmp=l=0;
			int ypos=-1;
			for(int i=n-1;i>=0;i--) {
				
				if(i<=n-3) l=y.get(n-1)-tmp;
				if((y.get(i)-y.get(0)+ l)<ysum) {
					ysum=y.get(i)-y.get(0)+ l;
					ypos=i;
				}
				tmp=y.get(i);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			int tmp=0;
//	        int a=-1;
//	        int ans=Integer.MAX_VALUE;
//				for (int i = x.length-1; i>=1; i--) {
//					int g1,g2;
//					g1=g2=0;
//					
//					g1=x[i]-x[0];
//					if(i<=x.length-3) g2=x[x.length-1]-tmp;
//					if(g1+g2<=ans){
//					    ans=g1+g2;
//					    a=i;
//					    
//					}
//					tmp=x[i];
////	 			System.out.println(g1+"- "+g2);	
////	 			System.out.println(i+"= "+ans+". "+a);	
//				}
//				
//				if(x[x.length-1]-x[1]<=ans){
//					    ans=x[x.length-1]-x[1];
//					    a=0;
//					}
//				System.out.println(a);
			
			
			
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
