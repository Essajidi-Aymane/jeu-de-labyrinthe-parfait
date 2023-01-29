package main;

import java.util.*;

import algo.*;
import cellule.*;
import direction.Direction;
import grille.Grille;
import objects.*;
import persos.*;

public class MainAlgo {

	private static int STATUS = 0;
	private static int tour = 1;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEntrez le nombre des lignes de la grille :\t");
		int nbrX = scanner.nextInt();
		System.out.println("\nEntrez le nombre des colonnes de la grille :\t");
		int nbrY = scanner.nextInt();
		Grille grille = new Grille(nbrX, nbrY);

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\nVeuillez choisir quel algorithme vous voulez utiliser (Algo1 ou Algo2) :\t");
		String algo = scanner1.nextLine();
		if (algo.equals("Algo1")) {
			// arbre binaire
			Algo1 algo1 = new Algo1(grille);
			algo1.launchAlgo1();
			for (int x = 0; x < nbrY; x++) {
				System.out.print("+---");
			}
			System.out.println("+");
			String laby = "|";
			for (int i = 0; i < nbrX; i++) {
				System.out.print(laby);

				for (int j = 0; j < nbrY; j++) {
					if (grille.getCell(i, j).getMurs().get(Direction.EST)) {
						System.out.print(grille.getCell(i, j).toString1());
					} else {

						System.out.print(grille.getCell(i, j).toString2());
					}
				}
				System.out.print("\n");
				String plus = "+";
				System.out.print(plus);
				for (int y = 0; y < nbrY; y++) {
					if (grille.getCell(i, y).getMurs().get(Direction.SUD)) {

						System.out.print(grille.getCell(i, y).toString3());
					} else {

						System.out.print(grille.getCell(i, y).toString4());

					}
				}
				System.out.print("\n");

			}
		} else if (algo.equals("Algo2")) {
			// side winder
			Algo2 algo2 = new Algo2(grille);
			algo2.launchAlgo2();
			for (int x = 0; x < nbrY; x++) {
				System.out.print("+---");
			}
			System.out.println("+");
			String laby = "|";
			for (int i = 0; i < nbrX; i++) {
				System.out.print(laby);

				for (int j = 0; j < nbrY; j++) {
					if (grille.getCell(i, j).getMurs().get(Direction.EST)) {
						System.out.print(grille.getCell(i, j).toString1());
					} else {

						System.out.print(grille.getCell(i, j).toString2());
					}
				}
				System.out.print("\n");
				String plus = "+";
				System.out.print(plus);
				for (int y = 0; y < nbrY; y++) {
					if (grille.getCell(i, y).getMurs().get(Direction.SUD)) {

						System.out.print(grille.getCell(i, y).toString3());
					} else {

						System.out.print(grille.getCell(i, y).toString4());
					}
				}
				System.out.print("\n");

			}
		} else {
			System.out.println("\nSaisie incorrecte \t");
			System.exit(STATUS);
		}

		List<Personnage> listePerso = new ArrayList<Personnage>();
		List<Joyaux> listeJoyaux = new ArrayList<Joyaux>();
		List<Parchemin> listeParchemin = new ArrayList<Parchemin>();
		Cell c = grille.getCell(0, 0);
		CellObjectif co = new CellObjectif(grille);
		Heros heros = new Heros(c, 0);
		int cpt1 = 0;
		Random rd = new Random();

		while (cpt1 < 15) {
			int x = rd.nextInt(10);
			int y = rd.nextInt(10);
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			Joyaux joyau = new Joyaux(grille.getCell(x, y), rd.nextInt(1, 4));
			Parchemin parchemin = new Parchemin(grille.getCell(a, b), co);
			listeJoyaux.add(joyau);
			listeParchemin.add(parchemin);
			cpt1++;
		}

		int cpt2 = 0;
		ParcheminFalse parchFaux = new ParcheminFalse(grille.getCell(rd.nextInt(10), rd.nextInt(10)),
				grille.getCell(rd.nextInt(10), rd.nextInt(10)));

		while (cpt2 < 5) {
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);

			Personnage sphynx = new Sphynx(grille.getCell(a, b), listeParchemin.get(rd.nextInt(15)));
			listePerso.add(sphynx);
			cpt2++;
		}

		int cpt3 = 0;
		while (cpt3 < 5) {
			int x = rd.nextInt(10);
			int d = rd.nextInt(10);

			Personnage fous = new Fous(grille.getCell(x, d), parchFaux);
			listePerso.add(fous);
			cpt3++;
		}

		int cpt4 = 0;
		while (cpt4 < 5) {

			int e = rd.nextInt(10);
			int f = rd.nextInt(10);

			Personnage marchand = new Marchand(grille.getCell(e, f), listeParchemin.get(rd.nextInt(15)));
			listePerso.add(marchand);
			cpt4++;

		}

		int cpt5 = 0;
		while (cpt5 < 5) {

			int g = rd.nextInt(10);
			int h = rd.nextInt(10);

			Personnage altruiste = new Altruistes(grille.getCell(g, h), listeParchemin.get(rd.nextInt(15)));
			listePerso.add(altruiste);
			cpt5++;
		}
		for (Personnage pers : listePerso) {
			int x = pers.getPos().getCoordX();
			int y = pers.getPos().getCoordY();
			grille.grille[x][y].addPerso(pers);
		}
		for (Parchemin parchemin : listeParchemin) {
			int x = parchemin.getPosition().getCoordX();
			int y = parchemin.getPosition().getCoordY();
			grille.grille[x][y].addParchemin(parchemin);
		}
		for (Joyaux j : listeJoyaux) {
			int x = j.getPosition().getCoordX();
			int y = j.getPosition().getCoordY();
			grille.grille[x][y].addJoyaux(j);
		}

		System.out.println("\n-------------------------------------------------");
		System.out.println("Vous etes case (0,0).\n");
		System.out.println("Que voulez-vous faire, Taper 'aide' peut aider ?");
		String msg = scanner1.nextLine();

		while (!(msg.equals("quitte"))) {

			if (tour % 3 == 0) {
				for (Personnage p : listePerso) {
					p.bougePerso(grille);
				}
			}
			tour++;

			if (msg.equals("aide")) {
				heros.gettingAction();
				System.out.println("\n RQ:nombre de personnes rencontrees est de : " + heros.getNbPersonnage());
				Heros.aide();
			}
			if (msg.equals("bouge")) {
				heros.gettingAction();
				System.out.println("\n RQ:nombre de personnes rencontrees est de : " + heros.getNbPersonnage());
				heros.bouge(c, grille, nbrX, nbrY, heros);
				if (c.getCoordX() == co.getCoordX() && c.getCoordY() == co.getCoordY()) {
					if (heros.getOr() >= 4) {
						System.out.println("\nFelicitations, vous avez gagne !, le jeu est fini :)\n");
						System.out.println("Vous avez rencontres au total : " + heros.getNbPersonnage()
								+ " personnages,\n Vous avez effectue : " + heros.getNbActions()
								+ "actions, \n Et vous finissez avec : " + heros.getOr() + " Or.\n");
						System.exit(STATUS);
					} else {
						System.out.println("\nDesole tu n'as pas assez d'or pour finir le jeu .\n");
						System.out.println("\nIl vous reste "+(4-heros.getOr())+" or a ramasser pour finir .\n");
					}
				}
			} else if (msg.equals("regarde")) {
				heros.gettingAction();
				System.out.println("\n RQ:nombre de personnes rencontrees est de : " + heros.getNbPersonnage());
				heros.regarde(c, grille, nbrX, nbrY, heros);
			} else if (msg.equals("interroge")) {
				heros.gettingAction();
				System.out.println("\n RQ:nombre de personnes rencontrees est de : " + heros.getNbPersonnage());
				heros.interroge(listePerso, grille, c, listePerso.get(rd.nextInt(5)), heros,
						listePerso.get(rd.nextInt(10, 15)), listePerso.get(rd.nextInt(15, 20)), parchFaux);
			} else if (msg.equals("utilise")) {
				heros.gettingAction();
				System.out.println("\n RQ:nombre de personnes rencontrees est de : " + heros.getNbPersonnage());
				heros.utilise(grille, heros, c);
			}

			if ((!msg.equals("aide")) && (!msg.equals("regarde")) && (!msg.equals("interroge"))
					&& (!msg.equals("utilise")) && (!msg.equals("bouge"))) {
				System.out.println(Heros.sentError());
			}

			msg = scanner1.nextLine();
		}

		if (msg.equals("quitte")) {
			System.exit(STATUS);
		}

	}

}
