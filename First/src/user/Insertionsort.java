package user;

public class Insertionsort {
public static void main(String[] args) {
	
	int s[]= {1,32,5,1,45,345};
	sort(s);
	for (int i : s) {
		System.out.print(i+" ");
	}
}

private static void sort(int[] s) {
	for(int i=1;i<s.length;i++) {
		int temp=s[i];
		int j=i-1;
		while(j>=0 && s[j]>temp) {
			s[j+1]=s[j];
			j--;
		}
		s[j+1]=temp;
		
	}
	
}
}
