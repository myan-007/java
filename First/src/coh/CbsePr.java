package coh;
import java.util.Scanner;
public class CbsePr {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;float sum=0;
	for(int i=0;i<5;i++)
	{
		System.out.print("enter the marks of subject"+(i+1)+": ");
		n=sc.nextInt();
		sum+=n;
	}
	System.out.println("Percentage:"+sum/5);

	}	
}
