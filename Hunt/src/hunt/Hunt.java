/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt;
import byui.cit260.theHunt.model.Actor;
import byui.cit260.theHunt.model.AmmoStore;
import byui.cit260.theHunt.model.Animal;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.HitOrMissScene;
import byui.cit260.theHunt.model.HuntScene;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
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
        
        Game openGame = new Game();
        openGame.setAddPlayer("M Kekauoha");
        
        String playerName = openGame.toString();
        System.out.println(playerName);
        
        Map mapLocation = new Map();
        mapLocation.setAnimalChoice("Deer");
        mapLocation.setLocationDesciption("Mountain Range");
        
        String huntLocation = mapLocation.toString();
        System.out.println(huntLocation);
        
        Location field = new Location();
        field.setVisited("Yes");
        
        String fieldLocation = field.toString();
        System.out.println(fieldLocation);
        
        Actor animal = new Actor();
        animal.setName("Yoggie");
        animal.setAnimal("Bear");
        
        String actor = animal.toString();
        System.out.println(actor);
        
        Animal prey = new Animal();
        prey.setAmmoNeeded("30-30");
        prey.setPoints(10);
        prey.setType("Mule Deer");
        
        String huntedPrey = prey.toString();
        System.out.println(huntedPrey);
        
    }
    
}
