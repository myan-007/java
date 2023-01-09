package begin;

public class Heart {

	public static void main(String[] args) {
		
		for(double i=0;i<50;i++) {
			for(double j=0;j<50;j++) {
				double k = Math.pow((Math.pow(i, 2)+ Math.pow(j, 2)-1),3);
				double m = (Math.pow(i, 2) * Math.pow(j, 3));
				if(k==m) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<2;i++) {
			System.out.print(" ");
			for(int j=0;j<2;j++) {
				System.out.print("*");
			}
			System.out.print("  ");
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<(9-i);j++) {
				
				System.out.print("*");
			}
			
			System.out.print("\n");
			}
	}

}
