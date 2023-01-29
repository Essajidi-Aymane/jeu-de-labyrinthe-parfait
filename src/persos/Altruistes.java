package persos;

import cellule.*;
import objects.Parchemin;

/**
 * @version v1
 * @author group
 */

public class Altruistes extends Personnage {

    private Parchemin indice;

    /**
     * constructor
     * 
     * @param pos    the position
     * @param indice the indice
     */
    public Altruistes(Cell pos, Parchemin indice) {
        super(pos, "Bob-1");
        this.indice = indice;
    }

    public Parchemin getIndice() {
        return this.indice;
    }

}
