package user;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class y {

	
//		Scanner sc = new Scanner(System.in);
//	       long t = sc.nextLong();
//	        while(t-->0) {
//	        long n;
//	        n=sc.nextLong();
//	        if(n==1)System.out.println(1);
//	        else System.out.println((n/2)+1);
//	    	}
		
//		Reader sc = new Reader();
//	       long t = sc.nextLong();
//	        while(t-->0) {
//	            int n,k;
//	            n=sc.nextInt();
//	            k=sc.nextInt();
//	            int d=k;
//	            int q=k;
//	            long[] a = new long[n];
//	            for(int i=0;i<n;i++){
//	                a[i]=sc.nextLong();
//	            }
//	            Arrays.sort(a);
//	            BigInteger sum1= new BigInteger("0");
//	            BigInteger sum2= new BigInteger("0");
//	            for(int i=n-1;i>1;i-=2){
//	                sum1 = sum1.add(BigInteger.valueOf(a[i]));
//	                k--;
//	                if(k==0) {
//	                	break;
//	                }
//	            }
//	            for(int i=n-2;i>1;i-=2){
//	                sum2 = sum2.add(BigInteger.valueOf(a[i]));
//	                --d;
//	                if(k==((n-1)/2)) {
//	                	if(d==1) {
//	                		break;
//	                	}
//	                }
//	                else {
//	                	if(d==0) {
//	                		break;
//	                	}
//	                }
//	            }
//	            
//	            if(q==((n-1)/2)) {
//	            	sum2=sum2.add(BigInteger.valueOf(a[0]));
//		            sum2=sum2.add(BigInteger.valueOf(a[1]));
//                }
//                
//	            
//	            
//	            System.out.println(sum1+" "+sum2);
//	        }
//	}
//}
//class Reader {
// final private int BUFFER_SIZE = 1 << 16;
// private DataInputStream din;
// private byte[] buffer;
// private int bufferPointer, bytesRead;
//
// public Reader()
// {
//     din = new DataInputStream(System.in);
//     buffer = new byte[BUFFER_SIZE];
//     bufferPointer = bytesRead = 0;
// }
//
// public Reader(String file_name) throws IOException
// {
//     din = new DataInputStream(
//         new FileInputStream(file_name));
//     buffer = new byte[BUFFER_SIZE];
//     bufferPointer = bytesRead = 0;
// }
//
// public String readLine() throws IOException
// {
//     byte[] buf = new byte[64]; // line length
//     int cnt = 0, c;
//     while ((c = read()) != -1) {
//         if (c == '\n') {
//             if (cnt != 0) {
//                 break;
//             }
//             else {
//                 continue;
//             }
//         }
//         buf[cnt++] = (byte)c;
//     }
//     return new String(buf, 0, cnt);
// }
//
// public int nextInt() throws IOException
// {
//     int ret = 0;
//     byte c = read();
//     while (c <= ' ') {
//         c = read();
//     }
//     boolean neg = (c == '-');
//     if (neg)
//         c = read();
//     do {
//         ret = ret * 10 + c - '0';
//     } while ((c = read()) >= '0' && c <= '9');
//
//     if (neg)
//         return -ret;
//     return ret;
// }
//
// public long nextLong() throws IOException
// {
//     long ret = 0;
//     byte c = read();
//     while (c <= ' ')
//         c = read();
//     boolean neg = (c == '-');
//     if (neg)
//         c = read();
//     do {
//         ret = ret * 10 + c - '0';
//     } while ((c = read()) >= '0' && c <= '9');
//     if (neg)
//         return -ret;
//     return ret;
// }
//
// public double nextDouble() throws IOException
// {
//     double ret = 0, div = 1;
//     byte c = read();
//     while (c <= ' ')
//         c = read();
//     boolean neg = (c == '-');
//     if (neg)
//         c = read();
//
//     do {
//         ret = ret * 10 + c - '0';
//     } while ((c = read()) >= '0' && c <= '9');
//
//     if (c == '.') {
//         while ((c = read()) >= '0' && c <= '9') {
//             ret += (c - '0') / (div *= 10);
//         }
//     }
//
//     if (neg)
//         return -ret;
//     return ret;
// }
//
// private void fillBuffer() throws IOException
// {
//     bytesRead = din.read(buffer, bufferPointer = 0,
//                          BUFFER_SIZE);
//     if (bytesRead == -1)
//         buffer[0] = -1;
// }
//
// private byte read() throws IOException
// {
//     if (bufferPointer == bytesRead)
//         fillBuffer();
//     return buffer[bufferPointer++];
// }
//
// public void close() throws IOException
// {
//     if (din == null)
//         return;
//     din.close();
// }
//}
//
//
// 
// 
//		static int search(int[] a,int end){
//	      int pos=end;
//			if(a[end]>0) return 0;
//			else {
//				int start=1;
//				int j=end-1;
//				int x,y;
//				x=y=Integer.MAX_VALUE;
//				while(start<=j) {
//					if(a[j]==1) {
//						x=end-j;
//						break;
//					}
//					--j;
//				}
//				
//				j=end+1;
//				end=a.length-1;
//				
//				while(j<=end) {
//					if(a[j]==2) {
//						
//						y=j-pos;
//						break;
//					}
//					++j;
//				}
//				
////				System.out.println(x+" "+y);
//				if(x==Integer.MAX_VALUE && y==Integer.MAX_VALUE) return -1;
//				else return Math.min(x, y);
//			}
//			
//	    }
	    
	    
	    
		public static void main (String[] args) throws java.lang.Exception
		{
		Reader sc = new Reader();
		       long t = sc.nextLong();
		        while(t-->0) {
		            int n,m;
		            n=sc.nextInt();
		            m=sc.nextInt();
		            List<Integer> a = new ArrayList<>(n);
		            int[] map1=new int[n+1]; 
		            
		            for(int i=0;i<n;i++){
		            	a.add(i,sc.nextInt());
		            	}
		            precompute(map1,a);
//		            System.out.println(map1+"\n"+map2);
		            for(int i=0;i<m;i++){
		                int b=sc.nextInt();
		                System.out.print(map1[b-1]+" ");
		            }
		            System.out.println();
		            
		        }
		}



		private static void precompute(int[] map1, List<Integer> a) {
			int lastpos=-1;	
			for(int i=0;i<a.size();i++){
				if(a.get(i)==1) {
					map1[i]=0;
					lastpos=i;
				}
				
				else if(lastpos==-1)
				{
            		map1[i]=-1;
				}
				else map1[i]=i-lastpos;
			}
            lastpos=-1;
            for(int i=a.size()-1;i>=0;i--){
				if(a.get(i)==2) {
					map1[i]=0;
					lastpos=i;
				}
				else if(lastpos==-1)
				{
					continue;
            		
				}
				else 
				{
					map1[i]=lastpos-i;
				}
				
				 
					
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


