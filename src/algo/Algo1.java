package algo;

import grille.Grille;

/**
 * @version v1
 * @author group
 */

public class Algo1 extends AleatoireAndGetter {

    private static int INDEX_MUR_EST = 0;
    private static int INDEX_MUR_SUD = 1;

    private Grille grille;

    /**
     * constructor
     * 
     * @param grille the grille
     */
    public Algo1(Grille grille) {
        super(grille);
        this.grille = grille;
    }

    /**
     * the method to launch the algo1 (arbre binaire)
     */
    public void launchAlgo1() {

        // ici on rentre dans la dernière ligne
        for (int i = 0; i < this.grille.getNbLignes() - 1; i++) {
            this.grille.openMurSUD(i, this.grille.getNbColonnes() - 1);
            this.grille.openMurNORD(i + 1, this.grille.getNbColonnes() - 1);
        }
        // ici on rentre dans la dernière colonne
        for (int j = 0; j < this.grille.getNbColonnes() - 1; j++) {
            this.grille.openMurEST(this.grille.getNbLignes() - 1, j);
            this.grille.openMurOUEST(this.grille.getNbLignes() - 1, j + 1);
        }
        for (int i = 0; i < this.grille.getNbLignes() - 1; i++) {
            for (int j = 0; j < this.grille.getNbColonnes() - 1; j++) {

                // Si ce n'est pas la case en bas a droite, on rentre dans :
                if (!((i == this.grille.getNbLignes() - 1) && (j == this.grille.getNbColonnes() - 1))) {

                    int random = this.getRandomNumberInRange(0, 1);
                    if (random == Algo1.INDEX_MUR_EST) {
                        this.grille.openMurEST(i, j);
                        this.grille.openMurOUEST(i, j + 1);
                    } else if (random == Algo1.INDEX_MUR_SUD) {
                        this.grille.openMurSUD(i, j);
                        this.grille.openMurNORD(i + 1, j);
                    }

                }

            }

        }

    }
}
