package loop;

import java.util.ArrayList;
import java.util.List;

public class pattern1 {

	public static void main(String[] args)
	{
//		int n=8;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n-i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("% ");
//			}
//			System.out.println();
//		}
		List<List<Integer>> v =new ArrayList<>();
		v.add(new ArrayList<Integer>());
		v.add(new ArrayList<Integer>());
		v.add(new ArrayList<Integer>());
		v.add(new ArrayList<Integer>());
		v.add(new ArrayList<Integer>());
		v.get(0).add(88);
		v.get(0).add(35);
		v.get(0).add(845);
		v.get(0).add(83);
		v.get(0).add(88);
		v.get(0).add(35);
		v.get(0).add(845);
		v.get(0).add(83);
		v.get(1).add(4);
		v.get(2).add(84);
		v.get(3).add(5);
		v.get(4).add(4);
		System.out.println(v.get(0).size());
		
	}
}
