package Oops;
import java.util.Random;
import java.util.Scanner;

class Game{
	int number;
	int noOfGuesses;
	int inputNumber;
	
	public int getnoOfGuesses() {
		return noOfGuesses;
	}
	public void setnoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	Game(){
		Random ran = new Random();
		this.number = ran.nextInt(100);
	}
	void userInput() {
		System.out.print("Guess The Number: ");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber == number) {
			System.out.format("Yes You Guess it Right,it was %d\n Your No. of Guesses is %d",number,noOfGuesses);
			return true;
		}
		else if(inputNumber < number){
			System.out.println("Too Low...");
		}
		else if(inputNumber > number) {
			System.out.println("Too High...");
		}
		return false;
	}
}

public class GuessTheGame {

	public static void main(String[] args) {
		Game g = new Game();
		boolean b = false;
		while(!b) {
			
			g.userInput();
			b = g.isCorrectNumber();
		}
	}

}
