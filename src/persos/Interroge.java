package persos;

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

public interface Interroge {

	default void interroge(List<Personnage> listePerso, Grille grille,
			Cell c, Personnage sphynx, Heros heros, Personnage marchand, Personnage altruiste,
			ParcheminFalse parchFaux) {

		System.out.println("--------------------------------------");
		System.out.println("Qui voulez-vous interroger ? ");
		System.out.println("\t 0 -None");
		Boolean foundSphynx = false;
		Boolean foundFou = false;
		Boolean foundMarchand = false;
		Boolean foundAltruiste = false;

	
		List<Personnage> l = grille.getCell(heros.getPos().getCoordX(), heros.getPos().getCoordY()).getterPerso();
		for (Personnage p : l) {
			if (p instanceof Sphynx) {
				System.out.println("\t 1 -Sphynx.");
				foundSphynx = true;

			}
			if (p instanceof Fous) {
				System.out.println("\t 2 -Altruiste2.");
				foundFou = true;

			}
			if (p instanceof Marchand) {
				System.out.println("\t 3 -Marchand.");
				foundMarchand = true;

			}
			if (p instanceof Altruistes) {
				System.out.println("\t 4 -Altruiste1.");
				foundAltruiste = true;
			}

		}

		Scanner scan1 = new Scanner(System.in);
		int answer = scan1.nextInt();
		if (answer == 0) {
			System.out.println("None.");
		}

		else if (answer == 1 && foundSphynx) {
			System.out.println("Joueur avec " + heros.getOr() + " or interroge Sphynx.");
			heros.RencontrePerso();
			((Sphynx) sphynx).interroger();
		}

		else if (answer == 2 && foundFou) {
			System.out.println("Joueur avec " + heros.getOr() + " or interroge altruiste.");
			heros.RencontrePerso();
			System.out.println("le but est probablement la position : (" + parchFaux.getFake().getCoordX() + ","
					+ parchFaux.getFake().getCoordY() + ")");
		}

		else if (answer == 3 && foundMarchand) {
			System.out.println("Joueur avec " + heros.getOr() + " or interroge Marchand.");
			heros.RencontrePerso();
			// heros.gettingOr();
			((Marchand) marchand).vendreindice(heros);
		}

		else if (answer == 4 && foundAltruiste) {
			System.out.println("Joueur avec " + heros.getOr() + " or interroge altruiste-1.");
			heros.RencontrePerso();
			((Altruistes) altruiste).getIndice().directionIndice(c, grille);
		} else {
			System.out.println("Mauvaise reponse :( .");
		}
		System.out.println("--------------------------------------");

		System.out.println("\nTaper 'aide' peut aider ?\t");

	}

}