package junit5;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;

import modelo.javabeans.Soldado;

class SoldadoTest {

	Soldado sold1 = new Soldado(false, 5);
	Soldado sold2 = new Soldado(false, 0);
	@Test
	
	public void pruebaPuedeDisparar() {
		System.out.println("Test 1 Hecho");
		
	 assertTrue(sold1.puedeDisparar());
	}
	@Test
	public void pruebaNoPuedeDisparar() {
		System.out.println("Test 2 Hecho");
		
	 assertFalse(sold2.puedeDisparar());
	}
	@Test
	public void soldadoMuere() {
		System.out.println("Test 3 Hecho");	
		sold1.disparar(sold2);
		assertTrue(sold2.isEstaMuerto());
	}
	
	
	@Test
	public void cuantasBalasQuedan() {
		System.out.println("Test 4 Hecho");
		sold1.disparar(sold2);
		int resultadoObtenido = sold1.getNumeroBalas();
		int resultadoEsperado = 4;
		
		
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		
	}
	
	

}
