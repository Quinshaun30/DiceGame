import java.util.Scanner;
import java.util.Random;
public class Game {

	public void play() {
		// TODO Auto-generated method stub
	      // get input from user
	      Scanner scnr = new Scanner(System.in);
	      System.out.print("How much do you want to bet? ");                                                 
	      int enteredBet = scnr.nextInt(); 
	      System.out.print("What number do you choose ? ");
	      int enteredNum = scnr.nextInt(); 
	   
	      // generate the die roll 
	      Random randGen = new Random();
	      int dieNum  =  randGen.nextInt(6) + 1;
	      int dieNum2  =  randGen.nextInt(6) + 1;
	      System.out.println("The dice are " + dieNum + " and " + dieNum2);
	      
	      if(enteredNum == dieNum || enteredNum == dieNum2 )
	      System.out.println("You win " + enteredBet * 50 + " dollars!");
	      
	      else if(enteredNum < dieNum || enteredNum < dieNum2 || enteredNum > dieNum || enteredNum > dieNum2)
	    	  System.out.println("Sorry you lose");
	      

		
	}

}
