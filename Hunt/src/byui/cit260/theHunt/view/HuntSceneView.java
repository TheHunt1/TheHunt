/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

/**
 *
 * @author Dragon
 */
public class HuntSceneView extends View{
    public HuntSceneView () {
        
    super ("\n"
                + "\n-------------------------------"
                + "\n   Hunt Scene                   "
                + "\n-------------------------------"
                + "\nI - Open Inventory"
                + "\nS - Shot"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
   
@Override
   public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.InventoryView();
                break;
            case "S":
            this.AccuracyCalc();
            break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void InventoryView() {
        System.out.println("InventoryView called");
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
       
 
    }

    private void AccuracyCalc() {
        System.out.println("AccuracyCalc function called");
    }
}

