package randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	     Random random = new Random();
		Scanner inputguess = new Scanner(System.in);
		int random1 = random.nextInt(100)+1;
		System.out.println("Randomnumber is: "+random1); //this line is to know what is random number 
		int guess=-1;
		
		int count=0;
		int k= 0;
		while(guess != random1 && k<5) 
        {
      	 count++;
      	System.out.print("Guess the random number: ");
     	 guess = inputguess.nextInt();
		   if(guess>random1) {
			System.out.println("Guess value is too heigh");
			k++;
		   
		   }else if(guess<random1){
			System.out.println("Guess value is too low");
			k++;
		     }else {
		    	 System.out.println("yes you guessed right number "
		    	 		+ "yes random number is: "+random1);
		     }
		  }
		
		System.out.println("you have taken "+count+" tries");
	
      	

        }}
