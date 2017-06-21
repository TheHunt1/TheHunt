/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import hunt.Hunt;
import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class MainMenuView extends View {
    
    public MainMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Main Menu                   "
                + "\n-------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }

@Override
    public boolean doAction(String value) {
       
        value = value.toUpperCase();
        
        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "G":
            this.startExistingGame();
            break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(Hunt.getPlayer());
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }
    private void saveGame() {
     System.out.println("\n saveGame called");   
        GameControl.createNewGame(Hunt.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }


    private void startExistingGame() {
        System.out.println("*** startExistingFame function called ***");
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    
}
