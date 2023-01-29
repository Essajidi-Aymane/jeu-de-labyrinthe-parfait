package persos;

import cellule.*;

/**
 * @version v1
 * @author group
 */

public class Heros extends Personnage implements Regarde, Bouge, Interroge, Utilise {

    private int nbPersonnage;
    private int or;
    private int nbActions;

    /**
     * constructor
     * 
     * @param pos the position
     * @param or  the gold
     */
    public Heros(Cell pos, int or) {
        super(pos, "Heros");
        this.or = or;
        this.nbPersonnage = 0;
        this.nbActions = 0;
    }

    /**
     * return the hero's gold
     * 
     * @return return the hero's gold
     */
    public int getOr() {
        return this.or;
    }

    /**
     * this method is used to modify the hero's gold
     * 
     * @param price
     */
    public void setOr(int price) {
        this.or = price;

    }

    /**
     * this method is used to add the value of the collected Jewel
     * 
     * @param value value of Jewel
     */
    public void collectJewel(int value) {
        this.or += value;
    }

    /**
     * meet a personnage and increment the current number of personnage
     */
    public void RencontrePerso() {
        this.nbPersonnage += 1;
    }

    /** return the current number of personnage
     * @return return the number of personnage
     */
    public int getNbPersonnage() {
        return this.nbPersonnage;
    }

    /**return the number of actions
     * @return return the number of actions
     */
    public int getNbActions() {
        return this.nbActions;
    }

    /** this method is used to increment the number of actions 
     */
    public void gettingAction() {
        this.nbActions++;
    }

    /**
     * demand help
     */
    public static void aide() {
        System.out.println("-------------------------------------------------");
        System.out.println("aide -> visualiser ce message d'aide");
        System.out.println("quitte -> quitter le jeu");
        System.out.println("interroge -> interroge un personnage");
        System.out.println("bouge -> bouger le joueur");
        System.out.println("regarde -> voir autour");
        System.out.println("utilise -> utiliser un objet");
        System.out.println("-------------------------------------------------");
        System.out.println("\nTaper 'aide' peut aider ?\t\n");
    }

    /**  return a sentence of error
     * @return String the sentence of error
     */
    public static String sentError() {
        return "Reponse inattendue. Taper 'aide' peut aider : ";
    }

}
