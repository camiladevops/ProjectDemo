package utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTests {
	
	@Test
	public void testSuma() {
	  int resultado = CalculadoraClass.suma(2,3);
	  int esperado = 5;
	  assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
	  int resultado = CalculadoraClass.resta(2,3);
	  int esperado = 5;
	  assertEquals(esperado, resultado);
	}

}
