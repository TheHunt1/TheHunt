/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Daniel Melo
 */
public class WeaponMenuView {
    private String menu;
    
    public WeaponMenuView (){
        this.menu = ("\n"
                + "\n-------------------------------"
                + "\n   Weapon Menu                   "
                + "\n-------------------------------"
                + "\n Choose your hunting weapon"
                + "\nS - Sniper"
                + "\nB - Bow and Arrow"
                + "\nR - Rifle"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    public void displayLocationMenuView() {
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
            case "S":
                System.out.println("\n You are hunting with a Sniper");
                this.GameMenuView ();
                break;
            case "B":
                System.out.println("\n You are hunting with a bow and a arrow");
            this.GameMenuView ();
            break;
            case "R":
                System.out.println("\n You are hunting with a Rifle");
                this.GameMenuView ();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void GameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
}
