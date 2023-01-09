package coh;


class help{
	int f;
	int g;
	help(int f){
		this.f=f;
		g=0;
	}
	help(){
		f=0;
	} 
}
public class Constructors {
public static void main(String[] args) {
	
	help d = new help();
	help f = new help(1);
	System.out.println(d.f);
	System.out.println(f.f);
}
	
}
