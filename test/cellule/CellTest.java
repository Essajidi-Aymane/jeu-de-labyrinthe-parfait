package cellule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;

public class CellTest {

    private Cell cell1;
    private Cell cell2;
    private Cell cellBis2;

   @Before
   public void before() {
        this.cell1=new Cell(10,15);
        this.cell2=new Cell(5,7);
        this.cellBis2=new Cell(5,7);
    }

    @Test
    public void allMursArePresentAtCreation(){
        assertTrue(this.cell1.getMurs().get(Direction.EST));
        assertTrue(this.cell1.getMurs().get(Direction.OUEST));
        assertTrue(this.cell1.getMurs().get(Direction.NORD));
        assertTrue(this.cell1.getMurs().get(Direction.SUD));
    }

    @Test 
    public void getCoordXTest(){
        assertEquals(10,this.cell1.getCoordX());
        assertEquals(5,this.cell2.getCoordX());
        assertFalse(this.cell1.getCoordX()==11);
    }
    @Test 
    public void getCoordYTest(){
        assertEquals(15,this.cell1.getCoordY());
        assertEquals(7,this.cell2.getCoordY());
        assertFalse(this.cell1.getCoordY()==11);
    }

    @Test
    public void equalsTest(){
        Boolean bool1=this.cell1.equals(this.cell2);
        assertEquals(false,bool1);
        Boolean bool2=this.cell2.equals(this.cellBis2);
        assertEquals(bool2,true);
    }

    @Test 
    public void cellIsVisitedTest(){
        assertFalse(this.cell1.isCellVisited());
        this.cell1.visitCell();
        assertTrue(this.cell1.isCellVisited());
        assertFalse(this.cell2.isCellVisited());
        this.cellBis2.visitCell();
        assertTrue(this.cellBis2.isCellVisited());
    }



    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(cellule.CellTest.class);
    }
}