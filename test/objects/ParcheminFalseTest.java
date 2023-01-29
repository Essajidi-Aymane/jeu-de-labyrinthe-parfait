package objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.Cell;
import direction.*;
import objects.*;
import grille.Grille;


public class ParcheminFalseTest {

    private Cell pos;
    private Cell fake;
    private ParcheminFalse parcheminFalse;

    @Before
    public void before() {
        this.pos=new Cell(5,7);
        this.fake=new Cell(2,2);
        this.parcheminFalse=new ParcheminFalse(this.pos,this.fake);
    }

    @Test
    public void getPosTest(){
        assertFalse(this.parcheminFalse.getPos().getCoordX()==8 );
        assertEquals(5,this.parcheminFalse.getPos().getCoordX());
        assertEquals(7,this.parcheminFalse.getPos().getCoordY());
    }

    @Test
    public void getFakeTest(){
        assertFalse(this.parcheminFalse.getFake().getCoordX()==0 );
        assertEquals(this.fake.getCoordX(),this.parcheminFalse.getFake().getCoordX());
        assertTrue(2==this.parcheminFalse.getFake().getCoordY());
    }




    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(objects.ParcheminFalseTest.class);
    }
}