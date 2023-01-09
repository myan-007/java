package recursion;

public class Pattern1 {
	static void p1(int n,char c)
	{
	
		if(n==0)return ;
		p1(n-1,c);
		for(int i=0;i<n;i++)
		{
			System.out.print(c);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		
		p1(6,'$');
	}

}
