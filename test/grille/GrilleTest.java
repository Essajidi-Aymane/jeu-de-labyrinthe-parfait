package grille;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Before;
import org.junit.Test;
import grille.Grille;
import cellule.Cell;

public class GrilleTest {

    private Grille grille;
    private Cell cell1;
    private Cell cell2;
    private Cell cell3;
    private Cell cell4;

   @Before
   public void before() {
       this.grille=new Grille(12, 12);
       this.cell1=this.grille.getCell(0,0);
       this.cell2=this.grille.getCell(11,11);
       this.cell3=this.grille.getCell(8,11);
       this.cell4=this.grille.getCell(11,8);
   } 

    @Test 
    public void getCellTest(){
       assertEquals(false,this.cell1==this.grille.getCell(0,1));
       assertEquals(this.cell2,this.grille.getCell(11, 11));
    }

   @Test 
   public void getNbLignesTest(){
       assertEquals(12,this.grille.getNbLignes());
       assertFalse(this.grille.getNbLignes()==13);
   }

   @Test 
   public void getNbColonnesTest(){
       assertEquals(12,this.grille.getNbColonnes());
       assertFalse(this.grille.getNbColonnes()==6);
    }

    

   @Test 
   public void openMurEstTest(){
       assertTrue(this.grille.isMurEstPresent(this.cell4));
       this.grille.openMurEST(11, 8);
       assertTrue(this.grille.isMurEstPresent(this.cell3));
       this.grille.openMurEST(8, 11);
       assertFalse(this.grille.isMurEstPresent(this.cell4));
       assertTrue(this.grille.isMurEstPresent(this.cell3));
    } 
   
   @Test 
   public void openMurOuestTest(){
       assertTrue(this.grille.isMurOuestPresent(this.cell4));
       this.grille.openMurOUEST(11,8);
       assertTrue(this.grille.isMurOuestPresent(this.cell1));
       this.grille.openMurOUEST(0,0);
       assertFalse(this.grille.isMurOuestPresent(this.cell4));
       assertTrue(this.grille.isMurOuestPresent(this.cell1));
    }

   @Test 
   public void openMurNordTest(){
    assertTrue(this.grille.isMurNordPresent(this.cell3));
    this.grille.openMurNORD(8, 11);
    assertTrue(this.grille.isMurNordPresent(this.cell1));
    this.grille.openMurNORD(0, 0);
    assertFalse(this.grille.isMurNordPresent(this.cell3));
    assertTrue(this.grille.isMurNordPresent(this.cell1));
   }

   @Test 
   public void openMurSudTest(){
    assertTrue(this.grille.isMurSudPresent(this.cell1));
    this.grille.openMurSUD(0, 0);
    assertTrue(this.grille.isMurSudPresent(this.cell2));
    this.grille.openMurSUD(11, 11);
    assertFalse(this.grille.isMurSudPresent(this.cell1));
    assertTrue(this.grille.isMurSudPresent(this.cell2));
   }



    // ---Pour permettre l'execution des tests ----------------------

   public static junit.framework.Test suite() {
       return new junit.framework.JUnit4TestAdapter(grille.GrilleTest.class);
    }
}