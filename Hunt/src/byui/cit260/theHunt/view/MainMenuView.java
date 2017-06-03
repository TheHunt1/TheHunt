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
public class MainMenuView {
    private String menu;
    
    public MainMenuView (){
        this.menu = ("\n"
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
    
    public void displayMainMenuView() {
        boolean done = false; //set flag to not done
       do {
           //prompt for and get player's name
           String menuOption = this.getMenuOption();
           if(menuOption.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(menuOption);
       }
       while (!done);
    }


    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\nEnter your choice");

            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("\nInvalid value; value can't be blank");
                continue;
                
            }
            break;
        }
        return value;
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
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
       gameMenu.displayMenu();
    }


 

    private void saveGame() {
     System.out.println("\n saveGame called");   
        GameControl.createNewGame(Hunt.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingFame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n===================="
                          + "\n  Help Menu"
                          + "\n===================="
                          );
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }


    
}
