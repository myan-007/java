package cses;

import java.util.Scanner;

public class CountingRooms {

	public static int dx[]={0,0,1,-1};
	 public static int dy[]={1,-1,0,0};
	 String ds="RLDU";
	 public static int n,m;
	 
	 static boolean possible(int x,int y){
		 	//cout<<n<<" "<<m<<" "<<x<<" "<<y<<" possible"<<endl;
		 
		     return (x<n && x>=0 && y<m && y>=0);
		 }
	 public static int[][] vis = new int[n][m];
	public static void main(String[] args) {
		   
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		char[][] in = new char[n][m];
		
		for(int i=0;i<n;i++) {
			String  s =sc.next();
			for(int j=0;j<m;j++) {
				in[i][j]= s.charAt(j);
			}
		}
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(in[i][j]=='.' && vis[i][j]==0) {
					dfs(i,j,in);
					
				}
				
			}
		}
		
	}
	
	
	static void dfs(int x,int y,char[][] in) {
		if(!possible(x,y)||vis[x][y]!=-1||in[x][y]==0)return ;
		vis[x][y]=1;
		
		for(int i=0;i<4;i++){
			int nx=x+dx[i],ny=y+dy[i];
			dfs(nx,ny,in);
		}
		
		
	}

}
