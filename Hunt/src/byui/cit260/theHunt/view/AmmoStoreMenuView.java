/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author MW
 */
public class AmmoStoreMenuView {
        private String menu;
    
    public AmmoStoreMenuView () {
        this.menu = ("\n"
                + "\n---------------------------------"
                + "\n      Ammo Store              "
                + "\n---------------------------------"
                + "\nW - Ammunition list (including cost)"
                + "\nP - Purchase ammunition"
                + "\nB - Back");   
    }
    
    public void displayWeaponStoreMenuView() {
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
            case "W":
                System.out.println("\n*** Display list of available weapons"
                + "\nincluding the price.");
                break;
            case "P":
                System.out.println("\nUse the money you earned from your kills "
                + "\nto purchase a ammunition. Here you will select and purchase "
                + "\nammunition");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}
