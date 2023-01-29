package cellule;

import java.util.*;
import grille.Grille;

/**
 * @version v1
 * @author group
 */

public class CellObjectif {

    private int coordX;
    private int coordY;
    private boolean IsCellObjectifVisited;

    /**
     * constructor
     * 
     * @param coordX the horizontal position
     * @param coordY the vertical position
     */
    public CellObjectif(Grille grille) {
        this.coordX = 8;
        this.coordY = 3;
        this.IsCellObjectifVisited=false;
    }

    /**
     * return a random number between min and max
     * 
     * @param min the minimum
     * @param max the maximum
     * @return return the random number
     */
    public int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * return the horizontal position of current cell
     * 
     * @return the hoizontal position
     */
    public int getCoordX() {
        return this.coordX;
    }

    /**
     * return the vertical position of current cell
     * 
     * @return the vertical position
     */
    public int getCoordY() {
        return this.coordY;
    }

    /** the hero on cell objectif
     */
    public void herosOnCellObjectif(){
        this.IsCellObjectifVisited=true;
    }

    /**
    *@return the state of cell objectif true if visited, false else
     */
    public boolean getIsCellObjectifVisited(){
        return this.IsCellObjectifVisited;
    }

}
