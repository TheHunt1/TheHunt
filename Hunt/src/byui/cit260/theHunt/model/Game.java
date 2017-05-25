/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MW
 */
public class Game implements Serializable {
    
    private String mapSelect;
    private String addPlayer;    

    public String getMapSelect() {
        return mapSelect;
    }

    public String getAddPlayer() {
        return addPlayer;
    }

    public void setAddPlayer(String addPlayer) {
        this.addPlayer = addPlayer;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.mapSelect);
        hash = 47 * hash + Objects.hashCode(this.addPlayer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.mapSelect, other.mapSelect)) {
            return false;
        }
        if (!Objects.equals(this.addPlayer, other.addPlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "mapSelect=" + mapSelect + ", addPlayer=" + addPlayer + '}';
    }
    
    
    
}
