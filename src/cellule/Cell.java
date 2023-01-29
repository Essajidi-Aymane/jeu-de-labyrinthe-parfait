package cellule;

import java.util.*;
import direction.*;
import persos.Personnage;
import objects.*;

/**
 * @version v1
 * @author group
 */

public class Cell {

	/** attribut 1 */
	protected Map<Direction, Boolean> murs;
	/** attribut 2 */
	protected int coordX;
	/** attribut 3 */
	protected int coordY;
	protected boolean visit;

	protected List<Personnage> perso;
	protected List<Parchemin> parchemin;
	protected List<Joyaux> joyaux;

	/**
	 * constructor
	 * 
	 * @param coordX the horizontal position
	 * @param coordY the vertical position
	 */
	public Cell(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.murs = new HashMap<>();
		this.perso = new ArrayList<Personnage>();
		this.parchemin = new ArrayList<Parchemin>();
		this.joyaux = new ArrayList<Joyaux>();
		murs.put(Direction.SUD, true);
		murs.put(Direction.EST, true);
		murs.put(Direction.OUEST, true);
		murs.put(Direction.NORD, true);
		this.visit=false;
	}

	/**
	 * return the walls
	 * 
	 * @return the map of walls, Direction are keys, values are of type Boolean
	 */
	public Map<Direction, Boolean> getMurs() {
		return this.murs;
	}

	/**
	 * return the horizontal position of current cell
	 * 
	 * @return the hoizontal position
	 */
	public int getCoordX() {
		return this.coordX;
	}

	/**
	 * return the vertical position of current cell
	 * 
	 * @return the vertical position
	 */
	public int getCoordY() {
		return this.coordY;
	}

	/**
	* return the state of the cell
	*@return boolean the state of the cell, true if 
	it's visited false else
	 */
	 public boolean isCellVisited(){
		return this.visit;
	}

	/** make the current cell visited
	 */
	public void visitCell(){
		this.visit=true;
	}


	/**
	 * change the horizontal position of the cell
	 * 
	 * @param x the new horizontal position
	 */
	public void setCoordX(int x) {
		this.coordX = x;
	}

	/**
	 * change the vertical position of the cell
	 * 
	 * @param x the new vertical position
	 */
	public void setCoordY(int y) {
		this.coordY = y;
	}

	/**
	 * return true if two cells have the same dimensions
	 * 
	 * @param o Object type
	 * @return true if two cells have the same dimensions, false else
	 */
	public boolean equals(Object o) {
		if (o instanceof Cell) {
			Cell other = (Cell) o;
			return this.coordX == other.coordX && this.coordY == other.coordY;
		} else
			return false;
	}

	/**
	 * return a string
	 * 
	 * @return return a string
	 */
	public String toString1() {
		return " X |";
	}

	/**
	 * return a string
	 * 
	 * @return return a string
	 */
	public String toString2() {
		return " X  ";
	}

	/**
	 * return a string
	 * 
	 * @return return a string
	 */
	public String toString3() {
		return "---+";
	}

	/**
	 * return a string
	 * 
	 * @return return a string
	 */
	public String toString4() {
		return "   +";
	}

	/**
	 * getter return a list of persons in the cell
	 * 
	 * @return return List
	 */
	public List<Personnage> getterPerso() {
		return this.perso;
	}

	/**
	 * getter return list of parchments
	 * 
	 * @return List of parchments
	 */
	public List<Parchemin> getterParchemins() {
		return this.parchemin;
	}

	/**
	 * getter return List of jewels in a cell
	 * 
	 * @return list of jewels
	 */
	public List<Joyaux> getterJoyaux() {
		return this.joyaux;
	}

	/**
	 * add a person to the list of persons in this cell
	 * 
	 * @param p personnage (person)
	 */
	public void addPerso(Personnage p) {
		this.perso.add(p);
	}

	/**
	 * add a parchment to the list of parchments in this cell
	 * 
	 * @param parchemin parchment
	 */
	public void addParchemin(Parchemin parchemin) {
		this.parchemin.add(parchemin);
	}

	/**
	 * add a jewel to the list of jewels in this cell
	 * 
	 * @param j jewel
	 */
	public void addJoyaux(Joyaux j) {
		this.joyaux.add(j);
	}

	/**
	 * remove a jewel from the list of jewels
	 * 
	 * @param j a jewel that we want to remove
	 */
	public void removeJoyaux(Joyaux j) {
		this.joyaux.remove(j);
	}

	/**
	 * remove a parchment from the list of parchments
	 * 
	 * @param p parchment
	 */

	public void removeParchemin(Parchemin p) {
		this.parchemin.remove(p);
	}

	/**
	 * remove a person from the list of persons
	 * 
	 * @param personnage a person
	 */
	public void removePersonnage(Personnage personnage) {
		this.perso.remove(personnage);
	}

}