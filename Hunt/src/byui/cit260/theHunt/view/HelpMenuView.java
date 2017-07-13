
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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
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

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "M":
                this.console.println("\n You input two numbers, "
                        + "\n the X and Y to move to that coordinates");
                break;
            case "B":
                this.console.println("\n You get money from your kills "
                        + "\n to spend. You select what you want and then how "
                        + "\n much you want");
                break;
            case "W":
                this.console.println("\n The weather affects your accuracy. "
                        + "\n You can improve your accuracy by using a jacket.");
                break;
            case "I":
                this.console.println("\n You push 'I' on the keyboard during "
                        + "\n the animal encounter and select the item you want."
                        + "\n You can open the inventory as you are walking around"
                        + "\n by pushing 'I' to enter the invenoty screen.");
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
}
