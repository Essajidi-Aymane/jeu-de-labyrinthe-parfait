package algo;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cellule.Cell;
import grille.Grille;
import algo.Algo1;

public class Algo1Test {
    private Algo1 algo1;
    private Grille grille;
    private Cell cell0;
    private Cell cell1;
    private Cell cell2;
    private Cell cell3;

   @Before
   public void before() {
      this.grille=new Grille(10,10);
      this.algo1=new Algo1(this.grille);
      this.cell0=this.grille.getCell(0,0);
      this.cell1=this.grille.getCell(9,9);
      this.cell2=this.grille.getCell(9,0);
      this.cell3=this.grille.getCell(4,9);
    }


    @Test
    public void launchAlgo1Test(){

        assertTrue(this.algo1.getGrille().isMurEstPresent(this.cell0));
        assertTrue(this.algo1.getGrille().isMurNordPresent(this.cell1));
        assertTrue(this.algo1.getGrille().isMurEstPresent(this.cell1));
        assertTrue(this.algo1.getGrille().isMurNordPresent(this.cell2));
        assertTrue(this.algo1.getGrille().isMurSudPresent(this.cell3));
        assertTrue(this.algo1.getGrille().isMurOuestPresent(this.cell3));
        this.algo1.launchAlgo1();
        assertEquals(true,this.algo1.getGrille().isMurEstPresent(this.cell1));
        assertEquals(true,this.algo1.getGrille().isMurSudPresent(this.cell1));
        assertFalse(this.algo1.getGrille().isMurEstPresent(this.cell2));   
        assertFalse(this.algo1.getGrille().isMurSudPresent(this.cell3));
        assertFalse(this.algo1.getGrille().isMurSudPresent(this.cell3));
        assertTrue(this.algo1.getGrille().isMurSudPresent(this.cell1));
        assertTrue(this.algo1.getGrille().isMurNordPresent(this.cell0));

    }





    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(algo.Algo1Test.class);
    }
}