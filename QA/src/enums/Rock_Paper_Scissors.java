package enums;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
       
		play();
		
      
	}
	
	public static void play() {
		Move playerInput = null;
		Scanner s = new Scanner(System.in);
        System.out.println("Please enter “1” for scissors, “2” for rock, or “3” for paper.");
        int playerChose = s.nextInt();
        
        if(playerChose == 1) 
        	playerInput = Move.SCISSORS;
        else if (playerChose == 2)
        	playerInput = Move.ROCK;
        else
        	playerInput = Move.PAPER;
		
        System.out.println("You chose: " + playerInput);
        call(playerInput);
        
	}
	
	
	public static boolean call(Move call) {
		Move computerChoice = null;
		Random comp = new Random();
        int rand = comp.nextInt(3) + 1;
		
        if(rand==1)
        	computerChoice = Move.ROCK;
        else if(rand==2)
        	computerChoice = Move.SCISSORS;
        else 
        	computerChoice = Move.PAPER;
        
        System.out.println("Computer chose " + computerChoice);
        generateWinner(call, computerChoice);
        return computerChoice == call;	
        
        
	}
	
	public static boolean generateWinner(Move playerInput, Move computerChoice) {
		if(computerChoice == playerInput) {
			System.out.println("The game is a draw!");
		}
		else if(computerChoice == Move.ROCK && playerInput == Move.SCISSORS) {
			System.out.println("You Lose!");
		}
		else if(computerChoice == Move.SCISSORS && playerInput == Move.PAPER) {
			System.out.println("You Lose!");
		}
		else if(computerChoice == Move.PAPER && playerInput == Move.ROCK) {
			System.out.println("You Lose!");
		}
		else {
			System.out.println("You Win");
		}
		
		return false;
		
	}
	
	
}
