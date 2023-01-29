package algo;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import algo.*;
import grille.*;

public class AleatoireAndGetterTest{

    private Grille grille;
    private Algo1 algo1;
    private int valRandom0;

    @Before
    public void before(){
        this.grille=new Grille(10,10);
        this.algo1=new Algo1(this.grille);
        this.valRandom0=this.algo1.getRandomNumberInRange(0,1);
    }


    @Test
    public void getRandomNumberInRangeTest(){
        assertEquals(0,this.valRandom0);
    }

    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(algo.AleatoireAndGetterTest.class);
    }

}