package algo;

import java.util.*;
import grille.Grille;

/**
 * @version v1
 * @author group
 */

public class AleatoireAndGetter {

    /**
     * attribut grille is protected
     */
    protected Grille grille;

    /**
     * constructor
     * 
     * @param grille the grille
     */
    public AleatoireAndGetter(Grille grille) {
        this.grille = grille;
    }

    /**
     * return a random number between min and max
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
     * return the grill
     * @return return the grill
     */
    public Grille getGrille() {
        return this.grille;
    }

}
