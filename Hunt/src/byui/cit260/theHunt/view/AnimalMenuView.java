/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class AnimalMenuView extends View {

    

    
    public AnimalMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Animal Menu                   "
                + "\n-------------------------------"
                + "\n Choose what animal you want to"
                + "\n hunt."
                + "\nA - Alligator"
                + "\nD - Deer"
                + "\nR - Rabbit"
                + "\nP - Pheasant"
                + "\nL - List animal points"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    
@Override
   public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":
                System.out.println("\n You chose to hunt an alligator");
                this.MapView();
                break;
            case "D":
            System.out.println("\n You chose to hunt a deer");
            this.MapView();
            break;
            case "R":
                System.out.println("\n You chose to hunt a rabbit");
                this.MapView();
                break;
                
            case "P":
                System.out.println("\n You chose to hunt a pheasant");
                this.MapView();
                break;
            case "L":
                this.AnimalList();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void MapView() {
        System.out.println("\n MapView function called"); //This will become another view where player chooses the size of the map
    }

    private void AnimalList()  {
        
        this.console.println("Enter where you want to save the file");
        String filePath=this.getInput();
        
        try{
            AnimalMenuView.buildList(filePath);
        }
        catch (Exception ex){
            ErrorView.display(filePath, displayMessage);
        }
        
        
   
    }
    private static void buildList(String filePath)throws IOException {
        String [] aList = new String[] {"Deer is worth 8 pt, \nPheasant is worth 5 pt, "
                + "\nAlligator is worth 15 pt, \nRabbit is worth 7 pt"};
        
        
        
        FileReader in = null;
      FileWriter out = null;

      try {
         for(String object: aList){
            //System.out.println(object);
            out = new FileWriter(filePath);
            out.write(object);
        }
          //in = new FileReader("list.txt");
      }finally {
         if (in != null) {
            in.close();
         }
        if (out != null) {
          out.close();
         }
      }

    }
}
    
  

