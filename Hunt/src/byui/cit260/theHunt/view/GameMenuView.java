
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class GameMenuView {
    private String menu;
    
    public GameMenuView (){
        this.menu = ("\n"
                + "\n-------------------------------"
                + "\n   Game Menu                   "
                + "\n-------------------------------"
                + "\nL - Select the loctaion"
                + "\nD - Display Player Info"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    public void displayGameMenuView() {
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
            case "L":
                this.SelectLocation();
                break;
            case "D":
            this.PlayerInfo();
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
    

    private void SelectLocation() {
        System.out.println("SelectLocation called");
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.displayLocationMenuView();
       
    }

    private void PlayerInfo() {
        System.out.println("PlayerInfo function called");
    }
    
}


