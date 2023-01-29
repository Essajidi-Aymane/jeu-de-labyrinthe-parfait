package persos;

import java.util.*;

import cellule.*;
import objects.*;
import grille.Grille;

public interface Utilise {

	/**
	 * use objects
	 * 
	 * @param grille
	 * @param heros
	 * @param c
	 */
	default void utilise(Grille grille, Heros heros, Cell c) {
		Joyaux j = null;
		Parchemin p = null;
		System.out.println("--------------------------------------");
		System.out.println("Que voulez-vous utiliser ? ");
		System.out.println("\t 0 -None");
		Boolean foundJoyaux = false;
		Boolean foundParchemin = false;

		List<Joyaux> listeJoyaux = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY())
				.getterJoyaux();
		for (Joyaux joyaux : listeJoyaux) {
			if (joyaux instanceof Joyaux) {
				System.out.println("\t 1 -Joyaux.");
				foundJoyaux = true;
				j = joyaux;
			}
		}

		List<Parchemin> listeParchemin = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY())
				.getterParchemins();
		for (Parchemin parchemin : listeParchemin) {
			if (parchemin instanceof Parchemin) {
				System.out.println("\t 2 -parchemin.");
				foundParchemin = true;
				p = parchemin;
			}
		}

		Scanner scan1 = new Scanner(System.in);
		int answer = scan1.nextInt();
		if (answer == 0) {
			System.out.println("None.");
		} else if (answer == 1 && foundJoyaux) {
			System.out
					.println("Joueur avec " + heros.getOr() + " or utilise un joyau de valeur " + j.getValeur() + " .");
			heros.collectJewel(j.getValeur());
			grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).removeJoyaux(j);
			System.out.println("Joueur avec " + heros.getOr() + " .");
		} else if (answer == 2 && foundParchemin) {
			System.out.println("Joueur avec " + heros.getOr() + " or utilise un parchemin");
			grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).removeParchemin(p);
			System.out.println("Le but est la position :" + p.toString());
		}

	}

}