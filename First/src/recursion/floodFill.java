package recursion;

public class floodFill {

	public static void main(String[] args) {
		int a[][]= {{1,1,1,1},{2,1,2,1},{1,2,3,3},{1,2,2,2}};
		floodfill(a,0,0,0,1);
		printmatrix(a);
	}
	public static void floodfill(int b[][],int r,int c,int tofill,int prevfill) {
	
		int row=b.length;
		int col=b[0].length;
		if(r<0 || c<0 || r>=row || c>=col) {
			return;
		}
		if(b[r][c] != prevfill) {
			return;
		}
		b[r][c]=tofill;
		
		floodfill(b,r,c-1,tofill,prevfill);
		floodfill(b,r-1,c,tofill,prevfill);
		floodfill(b,r,c+1,tofill,prevfill);
		floodfill(b,r+1,c,tofill,prevfill);
		
	}
	public static void printmatrix(int b[][]){
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

