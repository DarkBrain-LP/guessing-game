/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author LENOVO
 */
public class Player {
    private String playerName;
    private int higthLevel = 0;
    
    public void playGame(){ Game gm = new Game();}
    
    public Player(String playerName) { this.playerName = playerName; }
    
    public String getPlayerName() { return playerName; }

    public int getHigthLevel() { return higthLevel; }

    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public void setHigthLevel(int higthLevel) { this.higthLevel = higthLevel; }

    @Override
    public String toString() {
        return "Player : " + "Name = " + playerName + ", Higth Level = " + higthLevel ;
    }
    
    
}
