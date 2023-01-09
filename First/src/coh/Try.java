package coh;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		boolean t = true;
		int ar[] = {1,2,3};
		while(t) {
			System.out.println("Enter the index of the array element :");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			try
			{
				System.out.println("Elememt :"+ar[i]);
				t=false;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index");
			}
		}
	}

}
