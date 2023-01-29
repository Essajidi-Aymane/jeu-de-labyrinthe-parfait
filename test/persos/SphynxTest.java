package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import objects.*;
import grille.Grille;


public class SphynxTest {

    private Cell pos;
    private Grille grille;
    private CellObjectif cellObj;
    private Parchemin parchemin; 
    private Sphynx sphynx;

    @Before
    public void before() {
        this.grille=new Grille(10,10);
        this.pos=new Cell(5,7);
        this.cellObj=new CellObjectif(this.grille);
        this.parchemin=new Parchemin(this.pos,this.cellObj);
        this.sphynx=new Sphynx(this.pos,this.parchemin);
    }

    @Test
    public void getParcheminTest(){
        assertNotNull(this.sphynx.getParchemin().getQuete());
        assertEquals(this.sphynx.getParchemin().getPosition().getCoordY(),7);
        assertTrue(this.sphynx.getParchemin().getPosition().getCoordX()==5);
    }


    @Test
    public void getEnigmeTest(){
        assertEquals(this.sphynx.getEnigme().substring(0,10),"on peut me");
        assertTrue(this.sphynx.getEnigme().endsWith("donc?"));
    }



    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.SphynxTest.class);
    }
}