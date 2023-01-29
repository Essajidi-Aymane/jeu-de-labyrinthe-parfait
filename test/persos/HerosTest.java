package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.Cell;
import direction.*;
import objects.*;
import grille.Grille;


public class HerosTest {

    private int nbPersonnage; 
    private Cell pos;
    private int nbActions;
    private Heros heros;

    @Before
    public void before() {
        this.pos=new Cell(7,5);
        this.nbActions=0;
        this.heros=new Heros(this.pos,3);
    }

    @Test
    public void getValJoyauxTest(){
        assertEquals(this.heros.getOr(),3);
        assertFalse(this.heros.getOr()==2);
    }

   /* @Test
    public void payerTest(){
        assertEquals(this.heros.payer(1),2);
        assertFalse(this.heros.payer(1)==3);
    }*/

    @Test
    public void collectingJewelTest(){
        this.heros.collectJewel(3);
        assertFalse(this.heros.getOr()==3);
        assertEquals(this.heros.getOr(), 6);
    }

    @Test
    public void RencontrePersoTest(){
        this.heros.RencontrePerso();
        this.heros.RencontrePerso();
        assertEquals(2,this.heros.getNbPersonnage());
        assertFalse(this.heros.getNbPersonnage()==1);
    }

    @Test
    public void getNbPersonnageTest(){
        assertEquals(this.heros.getNbPersonnage(),0);
        assertFalse(this.heros.getNbPersonnage()==3);
    }

    @Test
    public void getNbActionsTest(){
        assertEquals(this.heros.getNbActions(),0);
        assertFalse(this.heros.getNbActions()==1);
    }

    @Test
    public void gettingActionTest(){
        this.heros.gettingAction();
        assertEquals(1,this.heros.getNbActions());
        assertFalse(this.heros.getNbActions()==0);
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.HerosTest.class);
    }
}