package cf;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arrayreordering {
	
	static int gcd(int a,int b) {
		if(b==0)return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		List<Integer> l =new LinkedList<>();
	       long t = sc.nextLong();
	        while(t-->0) {
	        	int n;
	        	n=sc.nextInt();
	        	int[] a= new int[n];
	        	for (int i = 0; i < n; i++) {
	        		a[i]=sc.nextInt();
	        	}
	        	int c=0;int k=0;
				for (int i = 0; i < a.length; i++) {
					if(a[i]%2==0) {
						++k;
						
						c+=(a.length-k);
					}
					else {
						l.add(a[i]);
					}
				}
				for (int i = 0; i< a.length-k; i++) {
					for (int j = i+1; j < a.length-k; j++) {
						if(gcd(l.get(i),2*l.get(j))>1) {
							c++;
						}
						
					}
				}
				
	            System.out.println(c);
	        }
	}
}
class Reader {
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