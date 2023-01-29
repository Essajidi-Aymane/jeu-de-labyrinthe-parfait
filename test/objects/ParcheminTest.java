package objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import objects.*;
import grille.Grille;


public class ParcheminTest {

    private Cell pos;
    private CellObjectif cellObjectif;
    private Grille grille;
    private Cell cellParchemin;
    private Parchemin parchemin;

    @Before
    public void before() {
        this.grille=new Grille(10,10);
        this.pos=new Cell(5,7);
        this.cellObjectif=new CellObjectif(this.grille);
        this.cellParchemin=new Cell(3,4);
        this.parchemin=new Parchemin(this.pos,this.cellObjectif);
    }

    @Test
    public void getPositionTest(){
        assertFalse(this.parchemin.getPosition().getCoordX()==0 );
        assertEquals(5,this.parchemin.getPosition().getCoordX());
        assertTrue(7==this.parchemin.getPosition().getCoordY());
    }

   @Test
    public void getQueteTest(){
        assertNotNull(this.parchemin.getQuete().getCoordX());
        assertNotNull(this.parchemin.getQuete().getCoordY());
    }

    /*@Test
    public void getCellParcheminTest(){
        assertFalse(this.cellParchemin.getCoordX()==0 );
        assertNotNull(this.parchemin.getCellParchemin().getCoordX());
        assertNotNull(this.parchemin.getCellParchemin().getCoordY());
    }*/


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(objects.ParcheminTest.class);
    }
}