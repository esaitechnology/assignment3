import java.util.*;


class Guesser{
	int guessNum;
	int guessNum() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Guesser kindly guess the number between 1-10"); 
	guessNum=scan.nextInt();
	return guessNum;
	}
}


class Player{
	int guessNum;
	int guessNum() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Player kindly guess the number from 1-10 only"); 
	guessNum=scan.nextInt();
	return guessNum;
	}
}


class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		while(g.guessNum>10) {
			System.out.println(g.guessNum +" is Out of the range please try again!!");
			System.out.println();
			numFromGuesser=g.guessNum();
		}
	}
		
	void collectNumFromPlayer() {
		Player p1= new Player();
		numFromPlayer1=p1.guessNum();
		while(p1.guessNum>10) {
			System.out.println(p1.guessNum +" is Out of the range please guess again...");
			System.out.println();
			numFromPlayer1=p1.guessNum();
		}
		
		Player p2= new Player();
		numFromPlayer2=p2.guessNum();
		while(p2.guessNum>10) {
			System.out.println(p2.guessNum +" is Out of the range please guess again...");
			System.out.println();
			numFromPlayer2=p2.guessNum();
		}
		
		Player p3= new Player();
		numFromPlayer3=p3.guessNum();	
		while(p3.guessNum>10) {
			System.out.println(p3.guessNum +" is Out of the range please guess again...");
			System.out.println();
			numFromPlayer1=p1.guessNum();
		}
	}
	
	void compare() {
		if(numFromPlayer1==numFromGuesser) {
			if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser) {
				System.out.println("All 3 players won the game");
				System.out.println("Game tied between all the players.... ");
			}
			else if(numFromPlayer3==numFromGuesser) {
				System.out.println("Player1 and Player3 won the game");
				System.out.println("Game tied between Player1 and Player3.... ");
			}
			else if(numFromPlayer2==numFromGuesser) {
				System.out.println("Player1 and Player2 won the game");
				System.out.println("Game tied between Player1 and Player2.... ");
			}
			else {
			System.out.println("Player1 won the game");
			}
		}
		else if(numFromPlayer2==numFromGuesser){
			if(numFromPlayer3==numFromGuesser) {
				System.out.println("Player2 and Player3 won the game");
				System.out.println("Game tied between Player2 and Player3.... ");
			}
			else {
			System.out.println("Player2 won the game");
			}
		}
		else if(numFromPlayer3==numFromGuesser) {
			System.out.println("Player3 won the game");
		}
		else {
			System.out.println("Game lost Try Again!");
		}
			
	}
}


public class GusserGame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		
	}

}
