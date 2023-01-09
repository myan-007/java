package user;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		int n;boolean status=true;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for(int i =2;i*i<n;i++)
		{
			if(n%i==0)
			{
				status =false;
			}
		}
		System.out.print("Prime status :"+status);

	}

}
