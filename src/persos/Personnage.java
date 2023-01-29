package persos;

import cellule.Cell;
import grille.Grille;
import java.util.*;

/**
 * @version v1
 * @author group
 */

public abstract class Personnage {

    /** attribut 1 */
    protected Cell pos;
    /** attribut 2 */
    protected Grille grille;
    /** attribut 3 */
    protected String name;

    /**
     * constructor
     * 
     * @param pos  the position
     * @param name the name
     */
    public Personnage(Cell pos, String name) {
        this.pos = pos;
        this.name = name;
    }

    /**
     * return the position of the cell
     * 
     * @return return the position of the cell
     */
    public Cell getPos() {
        return this.pos;
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

    public String toString() {
        return this.name;
    }

    /**
     * this method is used to make characters move randomly (except Sphynx and hero)
     * 
     * @param grille
     */
    public void bougePerso(Grille grille) {

        if (!(this instanceof Sphynx)) {

            List<Cell> directions = new ArrayList<Cell>();

            Random rd = new Random();

            if (!(grille.isMurNordPresent(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY())))) {
                if (this.getPos().getCoordX() > 0) {
                    directions.add(grille.getCell(this.getPos().getCoordX() - 1, this.getPos().getCoordY()));
                }
            }
            if (!(grille.isMurEstPresent(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY())))) {
                if (this.getPos().getCoordY() < grille.getNbColonnes() - 1) {
                    directions.add(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY() + 1));
                }
            }
            if (!(grille.isMurSudPresent(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY())))) {
                if (this.getPos().getCoordX() < grille.getNbLignes() - 1) {
                    directions.add(grille.getCell(this.getPos().getCoordX() + 1, this.getPos().getCoordY()));
                }
            }
            if (!(grille.isMurOuestPresent(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY())))) {
                if (this.getPos().getCoordY() > 0) {
                    directions.add(grille.getCell(this.getPos().getCoordX(), this.getPos().getCoordY() - 1));
                }
            }

            int size = directions.size();
            int x = rd.nextInt(size);
            grille.grille[this.getPos().getCoordX()][this.getPos().getCoordY()].removePersonnage(this);
            Cell cellule = directions.get(x);
            int a = cellule.getCoordX();
            int b = cellule.getCoordY();
            this.getPos().setCoordX(a);
            this.getPos().setCoordY(b);
            grille.grille[a][b].addPerso(this);

        }
    }

}