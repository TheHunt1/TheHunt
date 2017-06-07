
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
public class HelpMenuView {

   private String menu;
    
    public HelpMenuView (){
        this.menu = ("\n"
                + "\n-------------------------------"
                + "\n   Help Menu                   "
                + "\n-------------------------------"
                + "\nM - How to move"
                + "\nB - How to buy items"
                + "\nW - What does the weather do"
                + "\nI - How to open your invenorty"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    public void displayHelpMenuView() {
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
            case "M":
                System.out.println("\n You input two numbers, "
                + "\n the X and Y to move to that coordinates");
                break;
            case "B":
            System.out.println("\n You get money from your kills "
            + "\n to spend. You select what you want and then how "
            + "\n much you want");
            break;
            case "W":
                System.out.println("\n The weather affects your accuracy. "
                + "\n You can improve your accuracy by using a jacket.");
                break;
            case "I":
                System.out.println("\n You push 'I' on the keyboard during "
                + "\n the animal encounter and select the item you want."
                + "\n You can open the inventory as you are walking around"
                + "\n by pushing 'I' to enter the invenoty screen.");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    } 
}
