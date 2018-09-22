
import java.util.Scanner;

/* Progaram: GuessingGame
 * GuessingGame.java
 * Summary: User Makes Guess of Interger between 1 and 10000
 * Author: Kriztofer Scott
* September 22 , 2018 
 */


import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Random rand = new Random();
     Scanner scan = new Scanner(System.in);
     int randInt = rand.nextInt(10000) + 1;
     int max=10000, min=1, counter=1;

     while(true){
         try{
             System.out.printf("Guess my number. It's between %d and %d:\n",  min, max);
             int guess = Integer.parseInt(scan.nextLine());

             if((guess>randInt && guess<=10000)){
                 System.out.println(guess + " Lower!"); 
                 max=guess;
             }
             else if(guess<randInt && guess>=1){
                 System.out.println(guess + " Higher!"); 
                 min=guess;
             }
             else if(guess==randInt){
                 System.out.println(guess + " Correct! After " + counter + " attempts");
                 break;
            } 
            counter++;   
         }
         catch(NumberFormatException e){
             System.out.println("Please Insert Only Integers!");
             continue;
             
         }
     }
     scan.close();
  }
}