/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import hunt.Hunt;
import java.io.PrintWriter;

/**
 *
 * @author Dragon
 */
public class ErrorView {
   private static final PrintWriter errorFile = Hunt.getOutFile();
   private static final PrintWriter logFile = Hunt.getLogFile();
   
   public static void display(String className, String errorMessage) {
       errorFile.println(
               "-----------------------------------"
       + "\n- ERROR - " + errorMessage
       + "\n----------------------------------");
       
       logFile.println(className + " - " + errorMessage);
   }
}
