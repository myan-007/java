package user;

public class Anagram {

	public static void main(String[] args) {
		String a,b;
		a="cat";
		b="act";
		boolean isanagram = false;
		boolean visited[]= new boolean[b.length()];
		
		for(int i=0;i<a.length();i++)
		{
			
			for(int j=0;j<b.length();j++)
			{
				
				if(b.charAt(j) == a.charAt(i) && !visited[j])
				{
					
					isanagram  =  true;
					visited[j] = true;
					break;
				}
			}
			if(!isanagram) 
				break;
		}
		if(isanagram)
			System.out.println("yes they are anagram");
		else
			System.out.println("yes they are not anagram");
	}
	
}
