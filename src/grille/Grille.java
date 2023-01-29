package grille;

import cellule.*;
import direction.Direction;

/**
 * @version v1
 * @author group
 */
public class Grille {
    private int nbLignes;
    private int nbColonnes;
    public Cell[][] grille;

    /**
     * constructor
     * 
     * @param nbLignes   number of lines
     * @param nbColonnes number of columns
     */

    public Grille(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.grille = new Cell[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = new Cell(i, j);
            }
        }

    }

    /**
     * open the EAST wall
     * 
     * @param i the horizontal position of the cell
     * @param j the vertical position of the cell
     */
    public void openMurEST(int i, int j) {
        if (j < this.getNbColonnes() - 1) {
            this.getCell(i, j).getMurs().put(Direction.EST, false);
        }
    }

    /**
     * open the SOUTH wall
     * 
     * @param i the horizontal position of the cell
     * @param j the vertical position of the cell
     */
    public void openMurSUD(int i, int j) {
        if (i < this.getNbLignes() - 1) {
            this.getCell(i, j).getMurs().put(Direction.SUD, false);
        }
    }

    /**
     * open the WEST wall
     * 
     * @param i the horizontal position of the cell
     * @param j the vertical position of the cell
     */
    public void openMurOUEST(int i, int j) {
        if (j > 0) {
            this.getCell(i, j).getMurs().put(Direction.OUEST, false);
        }
    }

    /**
     * open the NORTH wall
     * 
     * @param i the horizontal position of the cell
     * @param j the vertical position of the cell
     */
    public void openMurNORD(int i, int j) {
        if (i > 0) {
            this.getCell(i, j).getMurs().put(Direction.NORD, false);
        }
    }

    /**
     * return the cell with given position
     * 
     * @param i the horizontal position of the cell
     * @param j the vertical position of the cell
     * @return the cell with given position
     */
    public Cell getCell(int i, int j) {
        return this.grille[i][j];
    }

    /**
     * return the number of lines of the grid
     * 
     * @return nbLignes the number of lines
     */
    public int getNbLignes() {
        return this.nbLignes;
    }

    /**
     * return the number of columns of the grid
     * 
     * @return nbLignes the number of columns
     */
    public int getNbColonnes() {
        return this.nbColonnes;
    }

    /**
     * return false if the EAST wall is destroyed
     * 
     * @param cell the current cell
     * @return false if the EAST wall is destroyed, true else
     */
    public Boolean isMurEstPresent(Cell cell) {
        return cell.getMurs().get(Direction.EST);
    }

    /**
     * return false if the SOUTH wall is destroyed
     * 
     * @param cell the current cell
     * @return false if the SOUTH wall is destroyed, true else
     */
    public Boolean isMurSudPresent(Cell cell) {
        return cell.getMurs().get(Direction.SUD);
    }

    /**
     * return false if the West wall is destroyed
     * 
     * @param cell the current cell
     * @return false if the West wall is destroyed, true else
     */
    public Boolean isMurOuestPresent(Cell cell) {
        return cell.getMurs().get(Direction.OUEST);
    }

    /**
     * return false if the North wall is destroyed
     * 
     * @param cell the current cell
     * @return false if the North wall is destroyed, true else
     */
    public Boolean isMurNordPresent(Cell cell) {
        return cell.getMurs().get(Direction.NORD);
    }

    /**
     * return true if two boards have the same dimensions
     * 
     * @param o Object type
     * @return true if two board have the same dimensions false else
     */
    public boolean equals(Object o) {
        if (o instanceof Grille) {
            Grille other = (Grille) o;
            return this.nbLignes == other.nbLignes && this.nbColonnes == other.nbColonnes;
        } else
            return false;
    }

}
