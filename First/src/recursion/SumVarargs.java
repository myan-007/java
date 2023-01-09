package recursion;

public class SumVarargs {

	static int sum(int ...is) {
		int sum=0;
		System.out.println();
		
		for (int i : is) {
			sum+=i;
		}
		return sum;
	}
	static int sum(int n) {
		
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sum(n-1);		
		}
		
	}
	static int power(int a,int b) {
		if(b==1) {
			return a;
		}
		if(b%2==0)
		{
			return power(a*a,b/2);
		}
	return a*power(a,b-1);
	}
	static int paths(int n,int m) {
		if(n==1 || m==1) return 1;
		return paths(n,m-1)+paths(n-1,m);
	}
	public static void main(String args[])
	{
		System.out.println(sum(5));
		System.out.println(power(5,7));
		System.out.println(paths(4,4));
	}
}
