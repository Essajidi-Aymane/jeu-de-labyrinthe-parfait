# l2s4-projet-2022

# Indication
## Compilation du projet
Depuis la racine du projet:  
- javac -sourcepath src -d classes ./src/main/MainAlgo.java
## Exécution du projet
- java -classpath classes main.MainAlgo
## Compilation/Exécution des Tests
`algo: Algo1Test.java et Algo2Test.java`
- javac -classpath ./test4poo.jar ./test/algo/Algo1Test.java
- javac -classpath ./test4poo.jar ./test/algo/Algo2Test.java
- java -jar ./test4poo.jar algo.Algo1Test
- java -jar ./test4poo.jar algo.Algo2Test  

`cellule: CellTest.java et CellObjectifTest`
- javac -classpath ./test4poo.jar ./test/cellule/CellTest.java 
- javac -classpath ./test4poo.jar ./test/cellule/CellObjectifTest.java 
- java -jar ./test4poo.jar cellule.CellTest  
- java -jar ./test4poo.jar cellule.CellObjectifTest 

`grille: GrilleTest.java`
- javac -classpath ./test4poo.jar ./test/grille/GrilleTest.java 
- java -jar ./test4poo.jar grille.GrilleTest


`objects: JoyauxTest.java et ParcheminFalseTest.java et ParcheminTest.java`
- javac -classpath ./test4poo.jar ./test/objects/JoyauxTest.java
- javac -classpath ./test4poo.jar ./test/objects/ParcheminFalseTest.java 
- javac -classpath ./test4poo.jar ./test/objects/ParcheminTest.java 
- java -jar ./test4poo.jar objects.JoyauxTest
- java -jar ./test4poo.jar objects.ParcheminFalseTest
- java -jar ./test4poo.jar objects.ParcheminTest

`persos: AltruistesTest.java FousTest.java HerosTest.java MarchandTest.java PersonnageTest.java et SphynxTest.java`
- javac -classpath ./test4poo.jar ./test/persos/AltruistesTest.java
- javac -classpath ./test4poo.jar ./test/persos/FousTest.java
- javac -classpath ./test4poo.jar ./test/persos/HerosTest.java
- javac -classpath ./test4poo.jar ./test/persos/MarchandTest.java
- javac -classpath ./test4poo.jar ./test/persos/PersonnageTest.java
- javac -classpath ./test4poo.jar ./test/persos/SphynxTest.java
- java -jar ./test4poo.jar persos.AltruistesTest
- java -jar ./test4poo.jar persos.FousTest
- java -jar ./test4poo.jar persos.HerosTest
- java -jar ./test4poo.jar persos.MarchandTest
- java -jar ./test4poo.jar persos.PersonnageTest
- java -jar ./test4poo.jar persos.SphynxTest


## Docstring
- javadoc -sourcepath src -d docs algo cellule grille objects persos main


# Equipe
```
- Essajidi Aymane  
- Elfakhouri Yasser 
- Zeggane Yathmas 
- Bennine Ismail 
```

# Sujet

[Le sujet 2022](https://www.fil.univ-lille1.fr/portail/index.php?dipl=L&sem=S4&ue=Projet&label=Documents)

# Livrables

## Livrable 1
- Modélisation du labyrinthe:
    - Choix des algorithmes de génération du labyrinthe
        - Algorithme1 : **Side Winder**
        - Algorithme2 : **Arbre binaire**
## Livrable 2
- Modélisation des objets et personnages:
    - Les objets dans ```objects```, que l'on peut trouver en parcourant le labyrinthe.
    - Les personnage dans ```persos```, représentant les personnes qui se trouvent dans le labyrinthe, sachant que le jeu est controlé par le **héros**.
## Livrable 3
- Modélisation des actions:
    - Les actions dans ```persos``` sous forme d'interface, chaque action est implémenté par le personnage qui peut effectuer cette action.
## Livrable 4
-   Modélisation finale et complète:
    - Vérification de l'arborescance des dossiers.
# Journal de bord

## Semaine 1
-   Conception du labyrinthe.
-   Proposition des algos de génération du labyrinthe.
    -   Choix des deux algos à implenter pour réaliser ce jeu du labyrinthe.

## Semaine 2
-   Algorithme d'**arbre binaire** et du **side winder**.
## Semaine 3
-   Débuter par un diagramme UML pour représenter le choix des classes et des packages à utiliser.
## Semaine 4
-   Modélisation du plateau de jeu (Grille).
    -   Modélisation des cellules de la grille et leur tests.
## Semaine 5
-   Mise à jour de l'implantation de l'algo 1 (Arbre binaire).
-   Suite des tests des classes *Grille* et *Cell*
## Semaine 6
-   Début de l'implantation de l'algorithme2 (Side winder).
-   Algo1 dernière version.
## Semaine 7
-   Tests sur l'algo1:
    -    Début de l'implantation de la classe *MainAlgo*.
-   Début des tests de l'algo2 dans le main.
## Semaine 8
-   Fin des tests de Algo1 et Algo2.
-   Début de la modélisation des personnage et objets.
## Semaine 9
-   Tests de la grille.
-   Fin des tests de la classe *CellObjectif* représentant la cellule objective à atteindre.
-   génération de la docstring des méthodes
## Semaine 10
-   Début de modélisation des interfaces d'actions *action* *bouge* et *interroge*.
-   Tests des actions dans le main ainsi que avec les tests unitaires.
## Semaine 11
-   Mise à jour de la docstring.
-   Makefile.
-   Jar exécutable.
## Semaine 12
-   Fin des Tests.
-   Vérification arborescance.
-   Vérification du bon déroulement du jeu.