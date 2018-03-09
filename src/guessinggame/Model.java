/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;
/**
 *
 * @author kevindeng
 */
public class Model {
    //this is the area where I declare my global vairables
    //for the number I'm think of..
    private int theNumber;
    private String status;
    int numTries;
    //what do I want my model to be able to do
    
    void newGame(){
        //this is where I will think up my random numbers
        //from range 1-500
        Random r = new Random();
        theNumber = r.nextInt(500)+1;
        numTries = 0;
        //setup status message so GUI can display it 
        status = "Hello, enter your guess...";
        
    }
    
    void processUserGuess(int guess){
        //this is where I will see what the users guess is
        //and decide on what message to give them
        //notice that this method accpets an int
        
        if(guess > theNumber){
           numTries = numTries + 1;
           status = guess + " is too high";
        }
        else if(guess < theNumber){
           numTries = numTries + 1;
           status = guess + " is too low";
        }
        else{
           numTries = numTries + 1;
           status = guess + " is correct!";
        }
    }
    
    String getStatus(){
        return status;
    }
    
}

