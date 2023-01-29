package persos;

import java.util.Scanner;
import java.util.*;

import cellule.*;
import objects.*;
import direction.Direction;
import grille.Grille;

/**
 * interface Regarde
 * 
 * @version v1
 * @author group
 */

public interface Regarde {

	/**
	 * see around
	 * 
	 * @param c    the current position
	 * @param nbrX number of lines of the grill
	 * @param nbrY number of columns of the grill
	 *
	 */
	default void regarde(Cell c, Grille grille, int nbrX, int nbrY, Heros heros) {

		System.out.println("--------------------------------------");
		System.out.println("vous etes case(" + c.getCoordX() + "," + c.getCoordY() + ") ");
		if (!(grille.isMurNordPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordX() > 0) {
				System.out.println("\t Nord : case (" + (c.getCoordX() - 1) + "," + c.getCoordY() + ").");
			}
		}
		if (!(grille.isMurEstPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordY() < nbrY - 1) {
				System.out.println("\t Est : case (" + c.getCoordX() + "," + (c.getCoordY() + 1) + ").");
			}
		}
		if (!(grille.isMurSudPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordX() < nbrX - 1) {
				System.out.println("\t Sud : case (" + (c.getCoordX() + 1) + "," + c.getCoordY() + ").");
			}
		}
		if (!(grille.isMurOuestPresent((grille.getCell(c.getCoordX(), c.getCoordY()))))) {
			if (c.getCoordY() > 0) {
				System.out.println("\t Ouest : case (" + c.getCoordX() + "," + (c.getCoordY() - 1) + ").");
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