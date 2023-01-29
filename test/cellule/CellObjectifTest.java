package cellule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import grille.Grille;


public class CellObjectifTest {

    private CellObjectif cellObj0;
    private CellObjectif cellObj1;
    private Grille grille;

    @Before 
    public void before(){
        this.grille=new Grille(10,10);
        this.cellObj0=new CellObjectif(this.grille);
        this.cellObj1=new CellObjectif(this.grille);
    }

    @Test
    public void isCellObjectifVisitedTest(){
        assertEquals(false, this.cellObj0.getIsCellObjectifVisited());
        this.cellObj0.herosOnCellObjectif();
        assertEquals(false, this.cellObj1.getIsCellObjectifVisited());
        this.cellObj1.herosOnCellObjectif();
        assertTrue(this.cellObj0.getIsCellObjectifVisited());
        assertTrue(this.cellObj1.getIsCellObjectifVisited());
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(cellule.CellObjectifTest.class);
    }

}