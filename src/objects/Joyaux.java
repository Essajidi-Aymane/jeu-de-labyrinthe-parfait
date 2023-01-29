package objects;
import cellule.*;

/**
@version v1
@author group */

public class Joyaux {

    private Cell position;
    private int valeur;

    /**constructor
    *@param pos the position
	*@param val the value
     */
    public Joyaux(Cell pos, int val){
        this.position=pos;
        this.valeur=val;
    }

    /** return the current position of the jewel
    *@return return the position of the jewel
     */
    public Cell getPosition(){
        return this.position;
    } 

    /** return the current value of the jewel
    *@return return the value of the jewel
     */
    public int getValeur(){
        return this.valeur;
    }

    /** increment the current value of the jewel
     */
    public void gettingVal(){
        this.valeur++;
    }
}
 