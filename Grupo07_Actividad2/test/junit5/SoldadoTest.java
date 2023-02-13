package junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.javabeans.Soldado;

class SoldadoTest {

	Soldado sold1 = new Soldado(false, 5);
	Soldado sold2 = new Soldado(true, 0);
	@Test
	
	public void pruebaPuedeDisparar() {
		System.out.println("Test 1");
		
	 assertTrue(sold1.puedeDisparar());
	}
	@Test
	public void pruebaNoPuedeDisparar() {
		System.out.println("Test 2");
		
	 assertFalse(sold2.puedeDisparar());
	}
	
	public void estaMuerto() {
		System.out.println("Test 3");
		
		boolean resultadoEsperado= true;
	assertEquals(sold2.disparar(sold1),resultadoEsperado);
		
	}
	
	

}
