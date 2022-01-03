/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Game {
    private int level = 0;
    
    public Game(){
        int guessNumber = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int randomNumber = (int)(Math.random() * 100) + 1;
            for(int i = 10; i > 0; i--){
            System.out.println("You have " + i + " guess(es)");
            try{
                guessNumber = sc.nextInt();
                
                if(guessNumber > randomNumber)
                    System.out.println("It's less");
                else if(guessNumber < randomNumber)
                    System.out.println("It's more");
                else {
                    System.out.println("You have won");
                    this.level ++;
                    break;
                }
                
            } catch(Exception e){
                System.out.println("Invalid input, please try again");
            }
        }
        }
        
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    
}
