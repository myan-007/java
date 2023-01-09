package user;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		long ans=1,n,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			ans*=i;
		}
		System.out.print("Answer is "+ans);
		
	}

}
