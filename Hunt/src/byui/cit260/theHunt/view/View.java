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
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    public View () {
}
    public View(String message){
    this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false; //set flag to not done
       do {
           //prompt for and get player's name
           String value = this.getInput();
           if(value.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(value);
       }
       while (!done);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = null;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            
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
    
}
