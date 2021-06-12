package com.pabasara.guessrandomnumber;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //greeting message
        System.out.println("\bWelcome!\b");
        System.out.println("Please enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        //get ready
        System.out.println("Are you ready start game?");
        System.out.println("1-YES \t 2-No");
        Scanner scanner1 = new Scanner(System.in);
        int yesOrNo = scanner.nextInt();

        //check ready
        if(yesOrNo != 1){
            System.out.println("See you again! Thank you!");
        }
        else{

            //generate random number
            Random random = new Random();
            int number = random.nextInt( 20) + 1;

            System.out.println("Guess the number from 1 to 20)");
            System.out.println("The random number is : "+ number);

            int count = 0;

            //iterate five times
            while ( count < 5 ){
                System.out.println(5-count + " times remaining");

                //get user input
                Scanner scanner2 = new Scanner(System.in);
                int answer = scanner.nextInt();
                count++;

                if (count == 5){
                    System.out.println("GAME OVER!");
                    System.out.println("The number is : " + number);
                }
                else {
                    if(answer > number){
                        System.out.println( "Hint : more lower number" );
                    }
                    else if (answer < number) {
                        System.out.println("Hint : more larger number");
                    }
                    else {
                        System.out.println("Congratulations!");
                        break;
                    }
                }
            }
        }
    }
}
