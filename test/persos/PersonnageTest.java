package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.Cell;
import direction.*;
import objects.*;
import grille.Grille;


public class PersonnageTest {

    private Cell pos;
    String name;

    @Before
    public void before() {
        this.pos=new Cell(7,5);
        this.name="Personnage";
    }


    @Test
    public void getPosTest(){
        assertFalse(this.pos.getCoordX()==0 );
        assertEquals(7,this.pos.getCoordX());
        assertEquals(5,this.pos.getCoordY());
    }

    @Test
    public void toStringNameTest(){
        assertTrue(this.name.equals("Personnage"));
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.PersonnageTest.class);
    }
}