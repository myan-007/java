package recursion;

public class pow2 {

	static int gcd(int a,int b){
	    if(b==0){
	        return a;
	        
	    }
	    return gcd(b,a%b);
	}

	public static void main(String[] args) {
		System.out.println(gcd(10,4));
		System.out.println(pow(10,10));
		System.out.println(modular(10,10));
	}
	static int pow(int a,int n) {
		
		if(n==1)
			return a;
		if(n%2==0) {
			return pow(a*a,n/2);
		}
		else
			return a*pow(a,n-1);
	
	}
	static int mod= 1000000007;
static long modular(int a,int n) {
//	    long half_ans=1;
		if(n==1) 
			return a;
		if(n%2==0) {
			return (modular(a,n/2)*modular(a,n/2))%mod;
		}
		else
			return (modular(a,n-1)*a)%mod;
//		 half_ans = (modular(a,n/2)*modular(a,n/2))%mod;
//			half_ans = (half_ans*a)%mod;
//			return half_ans;
			
		
	
	}
}
