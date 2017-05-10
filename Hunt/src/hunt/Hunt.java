/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt;
import byui.cit260.theHunt.model.Player;
/**
 *
 * @author Dragon
 */
public class Hunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Monica M");
        playerOne.setEnergy(100);
        playerOne.setX_axis(4);
        playerOne.setY_axis(10);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
