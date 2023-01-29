package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.Cell;
import direction.*;
import objects.*;
import grille.Grille;


public class FousTest {

    private ParcheminFalse indiceFalse;
    private Cell pos;
    private Cell fake;
    private Fous fou;

    @Before
    public void before() {
        this.pos=new Cell(5,7);
        this.fake=new Cell(2,1);
        this.indiceFalse=new ParcheminFalse(this.pos,this.fake);
        this.fou=new Fous(this.pos,this.indiceFalse);
    }

    @Test
    public void getIndiceFalseTest(){
        assertFalse(this.fou.getIndiceFalse().getPos().getCoordX()==0 );
        assertTrue(this.fou.getIndiceFalse().getPos().getCoordY()==7 );
        assertEquals(this.fou.getIndiceFalse().getFake().getCoordX(),2);
        assertEquals(this.fou.getIndiceFalse().getFake().getCoordY(),1);
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.FousTest.class);
    }
}