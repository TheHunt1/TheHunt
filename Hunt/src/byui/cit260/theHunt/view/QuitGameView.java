/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author daniel.freitas
 */
public class QuitGameView {
    private String menu;
    public QuitGameView(){
        this.menu = "-------------------------------\n"
                  + "         ***Quit Game***       \n"
                  + "-------------------------------\n"
                  + "Are you sure you want to quit the game?\nY - Yes\nN - No\n"
                  + "-------------------------------";
    }
    void displayMainMenuView() {
        boolean done = false; //set flag to not done
       do {
           //prompt for and get player's name
           String menuOption = this.getMenuOption();
           
           done = this.doAction(menuOption);
       } while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
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
            case "Y":
                GameControl.quitGame();
            case "N":
            new MainMenuView().displayMainMenuView();
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
}
