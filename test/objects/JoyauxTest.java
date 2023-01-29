package objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import objects.*;
import grille.*;


public class JoyauxTest {

    private Cell position;
    private Cell otherPosition;
    private int valeur;
    private Joyaux joyaux;

    @Before
    public void before() {
        this.position=new Cell(5,7);
        this.otherPosition=new Cell(3,2);
        this.valeur=4;
        this.joyaux=new Joyaux(this.position,this.valeur);
    }

    @Test
    public void getPositionTest(){
        assertFalse(this.joyaux.getPosition().getCoordX()==this.otherPosition.getCoordX() );
        assertEquals(5,this.joyaux.getPosition().getCoordX());
        assertEquals(7,this.joyaux.getPosition().getCoordY());
    }

    @Test
    public void getValeurTest(){
        assertEquals(4,this.joyaux.getValeur());
        assertFalse(7==this.joyaux.getValeur());
    }

    @Test
    public void gettingValTest(){
        this.joyaux.gettingVal();
        assertFalse(8==this.joyaux.getValeur());
        assertEquals(5,this.joyaux.getValeur());
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(objects.JoyauxTest.class);
    }
}