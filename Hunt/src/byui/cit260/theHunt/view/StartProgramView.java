/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.model.Player;
import hunt.Hunt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Dragon
 */
public class StartProgramView {
    protected final BufferedReader keyboard = Hunt.getInFile();
    protected final PrintWriter console = Hunt.getOutFile();
    private String promptMessage;
    public StartProgramView () {
        this.promptMessage = "\nPlease enter your name";
        //display the banner when view is created
        this.displayBanner ();
    
}

    private void displayBanner() {
       System.out.println(
       "\n*****************************************"
       + "\n*                                       *"
       + "\n* This is the game of The Hunt          *"
       + "\n* In this game you will hunt various    *"
       + "\n* animals to earn points, your goal     *"
       + "\n* is to get as many points as possible. *"
       + "\n*                                       *"
       + "\n* You will be given some bullets and    *"
       + "\n* a gun. Hunt as many animals as you    *"
       + "\n* can. But watch out for predators! You *"
       + "\n* can put up ammo in the map or buy     *"
       + "\n* some. There are items to help you     *"
       + "\n* hunt the animals better.              *"
       + "\n*                                       *"
       + "\n* Good luck and happy Hunting!          *"
       + "\n*                                       *"
       + "\n*****************************************"
       );
    }

    public void displayStartProgramView() {
       boolean done = false; //set flag to not done
       do {
           //prompt for and get player's name
           String playersName = this.getPlayersName();
           if(playersName.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(playersName);
       }
       while (!done);
    }

    private String getPlayersName() {
        
        String value = "";
        boolean valid = false;
        
        try {
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if(value.length() < 1) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value; value can't be blank");
                continue;
                
            }
            break;
        }
        }
        catch (Exception e){
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
            return null;
        }
        return value;
    }
     
    private boolean doAction (String playersName) {
        if(playersName.length() < 2){
        System.out.println("\n Invalid Player name:"
        + " The name must be greater than one character in length");
        return false;
    }
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
            System.out.println("\nError creating the Player");
            return false;
        }
        this.displayNextView(player);
        return true;
}

    private void displayNextView(Player player) {
       System.out.println("\n=========================="
       +"\n Welcome to the game " + player.getName()
       + "\n Hope you have fun!"
       + "\n=========================="
       );
       
       MainMenuView mainMenuView = new MainMenuView();
       
       mainMenuView.display();
    }
}
    
