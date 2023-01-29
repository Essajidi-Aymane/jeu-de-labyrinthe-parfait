package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import objects.*;
import grille.Grille;


public class AltruistesTest {

    private Parchemin indice ; 
    private Cell pos;
    private CellObjectif cellObj;
    private Grille grille;
    private Altruistes altruiste;

    @Before
    public void before() {
        this.grille=new Grille(10,10);
        this.pos=new Cell(7,5);
        this.cellObj=new CellObjectif(this.grille);
        this.indice=new Parchemin(this.pos,this.cellObj);
        this.altruiste=new Altruistes(this.pos,this.indice);
    }

    @Test
    public void getIndiceTest(){
        assertNotNull(this.altruiste.getIndice().getQuete());
        assertEquals(this.altruiste.getIndice().getPosition().getCoordY(),5);
        assertTrue(this.altruiste.getIndice().getPosition().getCoordX()==7);
    }


    


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.AltruistesTest.class);
    }
}