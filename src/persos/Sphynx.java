package persos;

import cellule.*;
import objects.Parchemin;
import java.util.Scanner;

/**
 * @version v1
 * @author group
 */

public class Sphynx extends Personnage {

    private String enigme;
    private String enigme1;
    private String enigme2;
    private Parchemin parchemin;
    private static int nbIndice = 1;

    /**
     * constructor
     * 
     * @param pos    the position
     * @param indice the indice
     */
    public Sphynx(Cell pos, Parchemin parchemin) {
        super(pos, "Sphynx");
        this.parchemin = parchemin;
        this.enigme = "on peut me trouver au fond d'un bateau de peche ou au milieu d'un court de tennis.Qui suis-je donc?";
        this.enigme1 = "Je ne peux pas marcher, j ai pourtant un dos et quatre pieds. Qui suis-je ?";
        this.enigme2 = " Je ne fais pas de bruit quand je me reveille mais je reveille tout le monde. Qui suis-je ?";
    }

    /**
     * return the parchment to follow
     * 
     * @return the parchment
     */
    public void interroger() {
        if (Sphynx.nbIndice > 3) {
            Sphynx.nbIndice = 1;
        } else {
            switch (Sphynx.nbIndice) {
                case 1:

                    System.out.println(
                            "Repondez a la question suivante pour gagner un indice : (appuyez sur 1 ou 2 ou 3 ).\n");

                    System.out.println(this.enigme);
                    System.out.println("\t1-filet");
                    System.out.println("\t2-ballon");
                    System.out.println("\t3-pelouse");
                    Scanner scan2 = new Scanner(System.in);
                    int res = scan2.nextInt();
                    if (res == 1) {

                        Sphynx.nbIndice++;
                        System.out.println("\nBravo !, voici l'indice : Le but est a la position : ("
                                + this.getParchemin().toString() + ")");

                    } else {
                        System.out.println("Mauvaise reponse :( .");
                    }
                    break;
                case 2:
                    System.out.println(
                            "Repondez a la question suivante pour gagner un indice : (appuyez sur 1 ou 2 ou 3 ).\n");

                    System.out.println(this.enigme1);
                    System.out.println("\t1-un homme");
                    System.out.println("\t2-une chaise");
                    System.out.println("\t3-un meuble ikea");
                    Scanner scan3 = new Scanner(System.in);
                    int res1 = scan3.nextInt();
                    if (res1 == 2) {
                        Sphynx.nbIndice++;
                        System.out.println("\nBravo !, voici l'indice : Le but est a la position : ("
                                + this.getParchemin().toString() + ")");

                    } else {
                        System.out.println("Mauvaise reponse :( .");
                    }

                    break;
                case 3:
                    System.out.println(
                            "Repondez a la question suivante pour gagner un indice : (appuyez sur 1 ou 2 ou 3 ).\n");

                    System.out.println(this.enigme2);
                    System.out.println("\t1-un coq");
                    System.out.println("\t2-l'alarme");
                    System.out.println("\t3-le soleil");
                    Scanner scan4 = new Scanner(System.in);
                    int res2 = scan4.nextInt();
                    if (res2 == 3) {
                        Sphynx.nbIndice++;
                        System.out.println("\nBravo !, voici l'indice : Le but est a la position : ("
                                + this.getParchemin().toString() + ")");

                    } else {
                        System.out.println("Mauvaise reponse :( .");
                    }
                    break;

            }
        }

    }

    /** return the current parchment of the sphynx
    *@return the parchment of the sphynx
     */
    public Parchemin getParchemin() {
        return this.parchemin;
    }

    /** return l'enigme
    *@return String the enigme
    */
    public String getEnigme(){
        return this.enigme;
    }

    /** return l'enigme1
    *@return String the enigme1
    */
    public String getEnigme1(){
        return this.enigme1;
    }

    /** return l'enigme2
    *@return String the enigme2
    */
    public String getEnigme2(){
        return this.enigme2;
    }

}
