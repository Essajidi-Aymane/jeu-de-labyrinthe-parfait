package algo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import cellule.Cell;
import grille.Grille;
import algo.Algo2;


public class Algo2Test {

    private Algo2 algo2;
    private Grille grille;
    private Cell cell0;
    private Cell cell1;
    private Cell cell2;
    private Cell cell3;

   @Before
   public void before() {
      this.grille=new Grille(10,10);
      this.algo2=new Algo2(this.grille);
      this.cell0=this.grille.getCell(0,0);
      this.cell1=this.grille.getCell(9,9);
      this.cell2=this.grille.getCell(9,2);
      this.cell3=this.grille.getCell(4,9);
   }


    @Test
    public void launchAlgo2Test(){

        assertTrue(this.algo2.getGrille().isMurEstPresent(this.cell0));
        assertTrue(this.algo2.getGrille().isMurNordPresent(this.cell1));
        assertTrue(this.algo2.getGrille().isMurEstPresent(this.cell1));
        assertTrue(this.algo2.getGrille().isMurNordPresent(this.cell2));
        assertTrue(this.algo2.getGrille().isMurSudPresent(this.cell3));
        assertTrue(this.algo2.getGrille().isMurOuestPresent(this.cell3));
        this.algo2.launchAlgo2();
        assertEquals(true,this.algo2.getGrille().isMurEstPresent(this.cell1));
        assertEquals(true,this.algo2.getGrille().isMurSudPresent(this.cell1));
        assertFalse(this.algo2.getGrille().isMurEstPresent(this.cell2));   
        assertFalse(this.algo2.getGrille().isMurSudPresent(this.cell3));
        assertFalse(this.algo2.getGrille().isMurSudPresent(this.cell3));
        assertTrue(this.algo2.getGrille().isMurSudPresent(this.cell1));
        assertTrue(this.algo2.getGrille().isMurNordPresent(this.cell0));

    }



    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(algo.Algo2Test.class);
    }
}