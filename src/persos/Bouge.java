package persos;

import java.util.Scanner;
import java.util.*;

import grille.Grille;
import cellule.*;
import objects.*;

/**
 * interface Bouge
 * 
 * @version v1
 * @author group
 */

public interface Bouge {

	/**
	 * move
	 * 
	 * @param c      the current position
	 * @param grille the grill
	 * @param nbrX   number of lines of the grill
	 * @param nbrY   number of columns of the grill
	 *
	 */
	default void bouge(Cell c, Grille grille, int nbrX, int nbrY, Heros heros) {

		System.out.println("--------------------------------------");
		System.out.println("Veuillez choisir une direction :\n\t");
		System.out.println("\t0 -None. ");

		if (!(grille.isMurNordPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordX() > 0) {
				System.out.println("\t1 -Nord.");
			}
		}
		if (!(grille.isMurEstPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordY() < nbrY - 1) {
				System.out.println("\t2 -Est.");
			}
		}
		if (!(grille.isMurSudPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordX() < nbrX - 1) {
				System.out.println("\t3 -Sud.");
			}
		}
		if (!(grille.isMurOuestPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordY() > 0) {
				System.out.println("\t4 -Ouest.");
			}
		}

		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Votre choix : ");
		int res = scannerInt.nextInt();
		if (res < 0 || res > 4) {
			System.out.println("Reponse inattendue.\n");
		}
		if (res >= 0 && res <= 4 && c.getCoordX() >= 0 && c.getCoordX() < nbrX && c.getCoordY() >= 0
				&& c.getCoordY() < nbrY) {
			System.out.println("--------------------------------------");
			if (res == 0) { // None
				System.out.println("vous etes case (" + c.getCoordX() + "," + c.getCoordY() + ")");
			} else if (res == 1 && c.getCoordX() > 0 && c.getCoordX() < nbrX
					&& (!grille.isMurNordPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) { // Partir au nord
				c.setCoordX(c.getCoordX() - 1);
				System.out.println("vous etes case (" + c.getCoordX() + "," + c.getCoordY() + ")");
			} else if (res == 2 && c.getCoordY() >= 0 && c.getCoordY() < nbrY - 1
					&& (!grille.isMurEstPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) { // Partir Ã  l'est
				c.setCoordY(c.getCoordY() + 1);
				System.out.println("vous etes case (" + c.getCoordX() + "," + c.getCoordY() + ")");
			} else if (res == 3 && c.getCoordX() >= 0 && c.getCoordX() < nbrX - 1
					&& (!grille.isMurSudPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) { // Partir au sud
				c.setCoordX(c.getCoordX() + 1);
				System.out.println("vous etes case (" + c.getCoordX() + "," + c.getCoordY() + ")");
			} else if (res == 4 && c.getCoordY() > 0 && c.getCoordY() <= nbrY - 1
					&& (!grille.isMurOuestPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) { // Partir Ã 
																										// l'ouest
				c.setCoordY(c.getCoordY() - 1);
				System.out.println("vous etes case (" + c.getCoordX() + "," + c.getCoordY() + ")");
			}

		}

		System.out.println(" ici se trouve  : ");
		System.out.println("\t Joueur avec " + heros.getOr() + " or");

		List<Personnage> l = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).getterPerso();
		for (Personnage p : l) {
			if (p instanceof Sphynx) {
				System.out.println(
						"\t Spyhnx --- > " + "(" + heros.getPos().getCoordX() + "," + heros.getPos().getCoordY() + ")");

			}
			if (p instanceof Fous) {
				System.out.println("\t Altruiste2 --- > " + "(" + heros.getPos().getCoordX() + ","
						+ heros.getPos().getCoordY() + ")");

			}
			if (p instanceof Marchand) {
				System.out.println("\t Marchand --- > " + "(" + heros.getPos().getCoordX() + ","
						+ heros.getPos().getCoordY() + ")");

			}
			if (p instanceof Altruistes) {
				System.out.println("\t Altruiste1 --- > " + "(" + heros.getPos().getCoordX() + ","
						+ heros.getPos().getCoordY() + ")");

			}

		}

		List<Joyaux> j = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).getterJoyaux();
		for (Joyaux joyaux : j) {
			if (joyaux instanceof Joyaux) {
				System.out.println(
						"\t Joyaux --- > " + "(" + heros.getPos().getCoordX() + "," + heros.getPos().getCoordY() + ")");
			}
		}

		List<Parchemin> p = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).getterParchemins();
		for (Parchemin parchemin : p) {
			if (parchemin instanceof Parchemin) {
				System.out.println("\t Parchemin --- > " + "(" + heros.getPos().getCoordX() + ","
						+ heros.getPos().getCoordY() + ")");
			}
		}

		System.out.println("--------------------------------------");
		System.out.println("\nTaper 'aide' peut aider ?\t");
	}

}
