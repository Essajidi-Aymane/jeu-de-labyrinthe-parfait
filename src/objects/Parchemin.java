package objects;

import cellule.*;
import grille.Grille;
import java.util.*;

/**
 * @version v1
 * @author group
 */

public class Parchemin {

    private Cell pos;
    private CellObjectif quete;

    // private Cell cellParchemin;

    /**
     * constructor
     * 
     * @param pos   the position
     * @param quete the quest
     */
    public Parchemin(Cell pos, CellObjectif quete) {
        this.pos = pos;
        this.quete = quete;
        // this.cellParchemin=new Cell(this.quete.getCoordX(),this.quete.getCoordY());
    }

    /**
     * return the position of the cell
     * 
     * @return return the position of the cell
     */
    public Cell getPosition() {
        return this.pos;
    }

    /**
     * return the quest to follow
     * 
     * @return return the quest
     */
    public CellObjectif getQuete() {
        return this.quete;
    }
    
    /**give the directions  after using a hint 
     * @param c our cell 
     * @param grille our board 
    */
    public void directionIndice(Cell c, Grille grille) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        int x = grille.getCell(c.getCoordX(), c.getCoordY()).getCoordX();
        int y = grille.getCell(c.getCoordX(), c.getCoordY()).getCoordY();
        if ((this.quete.getCoordX() - x > 0) && (this.quete.getCoordY() - y > 0)) {
            m.put(1, "Sud");
            m.put(2, "Est");
            System.out.println("la direction a suivre est: " + m.get(1) + " " + m.get(2));
        }
        if ((this.quete.getCoordX() - x > 0) && (this.quete.getCoordY() - y < 0)) {
            m.put(1, "Sud");
            m.put(4, "Ouest");
            System.out.println("la direction a suivre est: " + m.get(1) + " " + m.get(4));

        }
        if ((this.quete.getCoordX() - x < 0) && (this.quete.getCoordY() - y > 0)) {
            m.put(3, "Nord");
            m.put(2, "Est");
            System.out.println("la direction a suivre est: " + m.get(3) + " " + m.get(2));

        }
        if ((this.quete.getCoordX() - x < 0) && (this.quete.getCoordY() - y < 0)) {
            m.put(3, "Nord");
            m.put(4, "Ouest");
            System.out.println("la direction a suivre est: " + m.get(3) + " " + m.get(4));

        }
        if ((this.quete.getCoordX() - x == 0)) {
            if (this.quete.getCoordY() - y > 0) {
                m.put(2, "Est");
                System.out.println("la direction a suivre est: " + m.get(2));

            }
            if (this.quete.getCoordY() - y < 0) {
                m.put(4, "Ouest");
                System.out.println("la direction a suivre est: " + m.get(4));

            }

        }
        if ((this.quete.getCoordY() - y == 0)) {
            if (this.quete.getCoordX() - x > 0) {
                m.put(1, "Sud");
                System.out.println("la direction a suivre est: " + m.get(1));

            }
            if (this.quete.getCoordX() - x < 0) {
                m.put(3, "Nord");
                System.out.println("la direction a suivre est :" + m.get(3));

            }

        }

    }


    public String toString() {
        return ("(" + this.getQuete().getCoordX() + "," + this.getQuete().getCoordY() + ")");
    }

}
