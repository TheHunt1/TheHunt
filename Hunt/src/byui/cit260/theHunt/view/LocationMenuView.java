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
public class LocationMenuView {

    private String menu;
    
    public LocationMenuView (){
        this.menu = ("\n"
                + "\n-------------------------------"
                + "\n   Location Menu                   "
                + "\n-------------------------------"
                + "\n Choose your hunting terrain"
                + "\nR - The Rockies"
                + "\nF - Florida Swamps"
                + "\nW - Western Plains"
                + "\nJ - Jungle"
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
            case "R":
                System.out.println("\n You are hunting in the Rockies");
                this.AnimalMenuView ();
                break;
            case "F":
                System.out.println("\n You are hunting in the Florida Swamps");
            this.AnimalMenuView ();
            break;
            case "W":
                System.out.println("\n You are hunting in the Western Plains");
                this.AnimalMenuView ();
                break;
            case "J":
                System.out.println("\n You are hunting in the jungle");
                this.AnimalMenuView ();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void AnimalMenuView() {
        AnimalMenuView animalMenuView = new AnimalMenuView();
        animalMenuView.displayAnimalMenuView();
    }
    
}
