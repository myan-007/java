package coh;
import java.util.*;
class player{
	int player_choice;
	int comp_choice;
	String comp_ans;
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	player(){
		comp_choice =rn.nextInt(3); 
		switch(comp_choice)
		{
		case 0: comp_ans="STONE"; break;
		case 1: comp_ans="PAPER"; break;
		case 2: comp_ans="SCISSOR"; break;
		}
		}
	void getInput() {
		this.player_choice=sc.nextInt();
		}
	void playerWins() {
		System.out.println("YOU WON");
		}
	void compWins() {
		System.out.println("YOU LOST");
		}
	void draw() {
		System.out.println("MATCH DRAW!!");
	}
	
}

public class Game {

	static void stonepaperscissor() {
		player p1 = new player();
		System.out.println("Enter 0 for stone\nEnter 1 for paper\nEnter 2 for scissor");
		p1.getInput();
		if(p1.player_choice==p1.comp_choice) {
			p1.draw();
			System.out.println("COMPUTER CHOICE :"+p1.comp_ans);
		}
		else if(p1.player_choice==0 && p1.comp_choice==1 || p1.player_choice==1 && p1.comp_choice==2 ||p1.player_choice==2 && p1.comp_choice==0  ) {
			p1.compWins();
			System.out.println("COMPUTER CHOICE :"+p1.comp_ans);
		}
		else {
		  p1.playerWins();
		  System.out.println("COMPUTER CHOICE :"+p1.comp_ans);
		}
		System.out.println("------------------------------------------------------");
		stonepaperscissor();
	}
	public static void main(String[] args) {
		
		stonepaperscissor();
		
	}

}
