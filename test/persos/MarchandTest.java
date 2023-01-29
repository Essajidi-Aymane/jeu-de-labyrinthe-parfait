package persos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import cellule.*;
import direction.*;
import objects.*;
import grille.Grille;


public class MarchandTest {

    private int or;
    private Parchemin indice;
    private Cell pos;
    private CellObjectif cellObj;
    private Grille grille;
    private Marchand marchand;
    private Heros heros;

    @Before
    public void before() {
        this.grille=new Grille(10,10);
        this.pos=new Cell(5,7);
        this.cellObj=new CellObjectif(this.grille);
        this.indice=new Parchemin(this.pos,this.cellObj);
        this.heros=new Heros(this.pos,8);
        this.marchand=new Marchand(this.pos,this.indice);
    }


    @Test
    public void vendreindiceTest(){
        this.marchand.vendreindice(this.heros);
        assertEquals(this.heros.getOr(),5);
        assertFalse(this.heros.getOr()==8);
        this.marchand.vendreindice(this.heros);
        assertEquals(this.heros.getOr(),2);
        assertFalse(this.heros.getOr()==5);
    }

    @Test
    public void getIndiceTest(){
        assertNotNull(this.marchand.getIndice().getQuete());
        assertEquals(this.marchand.getIndice().getPosition().getCoordY(),7);
        assertTrue(this.marchand.getIndice().getPosition().getCoordX()==5);
    }

    @Test
    public void getOrTest(){
        assertEquals(this.marchand.getPrice(),3);
        assertFalse(this.marchand.getPrice()==0);
    }


    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(persos.MarchandTest.class);
    }
}