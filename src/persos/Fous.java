package persos;

import cellule.*;
import objects.*;

/**
 * @version v1
 * @author group
 */

public class Fous extends Personnage {

    private ParcheminFalse indiceFalse;

    /**
     * constructor
     * 
     * @param pos    the position
     * @param indice the indice
     */
    public Fous(Cell pos, ParcheminFalse indiceFalse) {
        super(pos, "Bob-2");
        this.indiceFalse = indiceFalse;
    }

    /**
     * getter of fake hint
     * 
     * @return fake hint
     */
    public ParcheminFalse getIndiceFalse() {
        return this.indiceFalse;
    }
}
