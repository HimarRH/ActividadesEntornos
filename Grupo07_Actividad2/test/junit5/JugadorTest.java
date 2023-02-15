package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.javabeans.Jugador;

class JugadorTest {
	Jugador jug1 = new Jugador(0, 2, 0);
	Jugador jug2 = new Jugador(0, 1, 1);
	Jugador jug3 = new Jugador(0, 0, 0);
	
	@Test
	void pruebaEstaExpulsadoAmarillas() {
		System.out.println("Test 1");
		assertTrue(jug1.estaExpulsado());
	}
	@Test
	void pruebaEstaExpulsadoRojas() {
		System.out.println("Test 2");
		assertTrue(jug2.estaExpulsado());
	}
	@Test
	void pruebaNoEstaExpulsado() {
		System.out.println("Test 3");
		assertFalse(jug3.estaExpulsado());
	}
	@Test
	void esDorsalCorrecto() {
		System.out.println("Test 4");
		jug1.ponerDorsal(17);
		int resultadoObtenido = jug1.getDorsal();
		int resultadoEsperado = 17;
		
		assertEquals(resultadoObtenido,resultadoEsperado);
		
	}
	@Test
	void dorsalFueraDeParametro() {
		System.out.println("Test 5");
		jug2.ponerDorsal(35);
		int resultadoObtenido = jug2.getDorsal();
		int resultadoEsperado = -1;
		
		assertEquals(resultadoObtenido,resultadoEsperado);
	}
	
	
}
