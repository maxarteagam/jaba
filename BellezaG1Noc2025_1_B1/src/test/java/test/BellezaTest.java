package test;

import model.Belleza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BellezaTest {
    
    public static Belleza bel = new Belleza();
    
    public BellezaTest() {
    }
    
    @Test
    public void testDeterminarPorcentaje(){
        //Belleza bel = new Belleza();
        float resultado = bel.determinarPorcentaje(3, 5, 1500000);
        Assertions.assertEquals(5.0, resultado, 0.0);
    }
    
    @Test
    public void testValorDescuento(){
      //Belleza bel = new Belleza();
      float resultado = bel.valorDescuento(1000000, 50);
      Assertions.assertEquals(500000.0, resultado, 0.0, "Carlos");
    }
    
    @Test
    public void testValorPagar(){
        //Belleza bel = new Belleza();
        float resultado = bel.valorPagar(2000000, 100000);
        Assertions.assertEquals(1900000.0, resultado, 0.0);
    }
    
    @Test
    public void testContar(){
        //Belleza bel = new Belleza();
        int resultado = bel.contar(0);
        Assertions.assertEquals(1, resultado, 0);
    }
    
    @Test
    public void testAcumular(){
        //Belleza bel = new Belleza();
        float resultado = bel.acumular(100, 1050);
        Assertions.assertEquals(1150, resultado, 0.0);
    }
    
    @Test
    public void testSumar3ValoresInt(){
        //Belleza bel = new Belleza();
        int resultado = bel.sumar3Valores(5, 7, 8);
        Assertions.assertEquals(20, resultado, 0.0);
    }
    
    @Test
    public void testSumar3ValoresFloat(){
        //Belleza bel = new Belleza();
        float resultado = bel.sumar3Valores((float)5.5, (float)7, (float)8);
        Assertions.assertEquals(20.5, resultado, 0.0);
    }
    
    @Test
    public void testCalcularPorcentaje(){
        //Belleza bel = new Belleza();
        float resultado = bel.calcularPorcentaje(50, 100);
        Assertions.assertEquals(50.0, resultado, 0.0);  
    }
           
}
