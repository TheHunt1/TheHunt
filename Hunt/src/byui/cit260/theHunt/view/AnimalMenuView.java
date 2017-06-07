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
public class AnimalMenuView {
private String menu;
    
    public AnimalMenuView (){
        this.menu = ("\n"
                + "\n-------------------------------"
                + "\n   Animal Menu                   "
                + "\n-------------------------------"
                + "\n Choose what animal you want to"
                + "\n hunt."
                + "\nA - Alligator"
                + "\nD - Deer"
                + "\nR - Rabbit"
                + "\nP - Pheasant"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    public void displayAnimalMenuView() {
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
            case "A":
                System.out.println("\n You chose to hunt an alligator");
                break;
            case "D":
            System.out.println("\n You chose to hunt a deer");
            break;
            case "R":
                System.out.println("\n You chose to hunt a rabbit");
                break;
            case "P":
                System.out.println("\n You chose to hunt a pheasant");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
  
}
