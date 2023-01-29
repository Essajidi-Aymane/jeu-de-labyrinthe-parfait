package persos;

import objects.*;
import cellule.*;

/**
 * @version v1
 * @author group
 */

public class Marchand extends Personnage {

    private static final int PRICE = 3; //the price for a hint
    private Parchemin indice;

    /**
     * constructor
     * 
     * @param position the position
     * @param indice   the index
     * @param or       the gold
     */
    public Marchand(Cell pos, Parchemin indice) {
        super(pos, "Marchand");
        this.indice = indice;
    }

    /**
     * sell a hint to the hero 
     * 
     * @param hero our main character
     */
    public void vendreindice(Heros hero) {
        System.out.println("je vais te vendre l'indice avec " + Marchand.PRICE + " or");
        if (hero.getOr() >= Marchand.PRICE) {
            hero.setOr(hero.getOr() - Marchand.PRICE);
            System.out.println("le but est la position : " + "(" + this.getIndice().toString() + ")");
        } else {
            System.out.println("Desole tu n'as pas assez d'or pour acheter l'indice");
        }
    }

    /** return the character's parchment
    * @return Parchemin the parchment to follow
     */
    public Parchemin getIndice() {
        return this.indice;
    }

    /** return the current static price
    *@return the current price
     */
    public int getPrice(){
        return Marchand.PRICE;
    }

}