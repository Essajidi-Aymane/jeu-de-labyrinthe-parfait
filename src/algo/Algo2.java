package algo;

import cellule.*;
import direction.Direction;
import grille.Grille;
import java.util.*;
import java.util.HashMap;

/**
 * @version v1
 * @author group
 */

public class Algo2 extends AleatoireAndGetter {

    private Grille grille;
    private List<Cell> cells;
    private Map<Integer, Boolean> res;

    /**
     * constructor
     * 
     * @param grille the grille
     */
    public Algo2(Grille grille) {
        super(grille);
        this.grille = grille;
        this.cells = new ArrayList<Cell>();
        this.res = new HashMap<Integer, Boolean>();
    }

    /**
     * the method to launch the algo2 (sidewinder)
     */
    public void launchAlgo2() {

        this.res.put(0, false); // mur detruit
        this.res.put(1, true); // mur present

        for (int i = 0; i < this.grille.getNbLignes() - 1; i++) {
            for (int j = 0; j < this.grille.getNbColonnes(); j++) {

                if (j == this.grille.getNbColonnes() - 1) {
                    this.grille.getCell(i, j).getMurs().put(Direction.EST, true);
                } else {
                    this.grille.getCell(i, j).getMurs().put(Direction.EST,
                            this.res.get(this.getRandomNumberInRange(0, 1)));
                    if (this.grille.getCell(i, j).getMurs().get(Direction.EST) == false) {
                        this.grille.getCell(i, j + 1).getMurs().put(Direction.OUEST, false);
                    }
                }
                if (this.grille.getCell(i, j).getMurs().get(Direction.EST) == true) {
                    cells.add(this.grille.getCell(i, j));
                    for (Cell cell : cells) {
                        cell.getMurs().put(Direction.SUD, false);
                        this.grille.getCell(cell.getCoordX() + 1, cell.getCoordY()).getMurs().put(Direction.NORD,
                                false);
                    }
                }
            }
        }
        for (int y = 0; y < this.grille.getNbColonnes() - 1; y++) {
            this.grille.openMurEST(this.grille.getNbLignes() - 1, y);
            this.grille.openMurOUEST(this.grille.getNbLignes() - 1, y + 1);
        }
    }

}
