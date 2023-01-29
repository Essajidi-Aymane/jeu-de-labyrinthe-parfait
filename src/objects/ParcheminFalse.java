package objects;

import cellule.*;

/**
 * @version v1
 * @author group
 */

public class ParcheminFalse {

    private Cell pos;
    private Cell fake;

    /**
     * constructor
     * 
     * @param pos  the position
     * @param fake the fake cell
     */

    public ParcheminFalse(Cell pos, Cell fake) {
        this.pos = pos;
        this.fake = fake;
    }

    public Cell getPos() {
        return this.pos;
    }

    public Cell getFake() {
        return this.fake;
    }
}
