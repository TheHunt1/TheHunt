/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt;
import byui.cit260.theHunt.model.AmmoStore;
import byui.cit260.theHunt.model.HitOrMissScene;
import byui.cit260.theHunt.model.HuntScene;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.PlayerStatus;
import byui.cit260.theHunt.model.WeaponStore;
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
        
        AmmoStore ammoStore = new AmmoStore ();
        ammoStore.setAmmoPrices(10);
        ammoStore.setAmmoQuanity(5);
        ammoStore.setPlayermoney(50);
        
        String ammoStoreInfo = ammoStore.toString();
        System.out.println(ammoStoreInfo);
        
        HitOrMissScene hitMiss = new HitOrMissScene ();
        hitMiss.setAnimal("Rabbit");
        hitMiss.setHitOrMiss("Hit");
        hitMiss.setPoints(2);
        
        String message = hitMiss.toString();
        System.out.println(message);
        
        HuntScene scene = new HuntScene();
        scene.setAnimalName("bear");
        scene.setAnimalPoints(10);
        scene.setDescription("An animal appears");
        scene.setSceneType("Danger!");
        
        String info = scene.toString();
        System.out.println(info);
        
        Inventory bag = new Inventory();
        bag.setAmmo(20);
        bag.setAmmoStore("Open Store");
        bag.setFood("Apple");
        bag.setGear("jacket");
        
        String contents = bag.toString();
        System.out.println(contents);
        
        PlayerStatus status = new PlayerStatus();
        status.setEnergy(100);
        status.setMoney(70);
        status.setName("Name");
        
        String stat = status.toString();
        System.out.println(stat);
        
        WeaponStore weapon = new WeaponStore();
        weapon.setPlayerMoney(70);
        weapon.setWeaponPrices(30);
        
        String purchase = weapon.toString();
        System.out.println(purchase);
    }
    
}
