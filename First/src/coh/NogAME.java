package coh;
import java.util.*;
class Game1{
	Random rn = new Random();
	int originalno;
	int enteredno; 
	int guesses;
	Game1(){
		originalno =rn.nextInt(100);
		if(originalno>=0 && originalno<=100) {
			System.out.println("The targeted number is between 0 and 100");
		}
		guesses=0;
		}
	void enterNo() {
		Scanner sc= new Scanner(System.in);
		enteredno=sc.nextInt();
	}
	void smaller() {
		System.out.println("Entered number is smaller");
		guesses++;
	}
	void bigger() {
		System.out.println("Entered number is bigger");
		guesses++;
	} 
}
public class NogAME {

	public static void main(String[] args) {
		
		Game1 g = new Game1();
	   
	    while(true) {
	    	g.enterNo();
	    	if(g.enteredno==g.originalno) break; 
	    	if(g.enteredno>g.originalno)  g.bigger();
	    	if(g.enteredno<g.originalno) g.smaller();	
	    }
	    System.out.println("GAME OVER");
		System.out.println("Total number of guesses are :"+g.guesses);
		
	}

}
