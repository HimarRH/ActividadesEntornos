package junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Jugador;

public class JugadorTest {
    
    private Jugador jug1;
    private Jugador jug2;
    private Jugador jug3;

    @BeforeEach
    void setUp() throws Exception{

        //Instancias de clase limpias antes de cada @Test
        jug1 = new Jugador(0, 0, 0);
        jug2 = new Jugador(0, 1, 1);
        jug3 = new Jugador(0, 2, 0);
    }

    @AfterEach
    void tearDown() throws Exception{
        
        jug1 = null;
        jug2 = null;
        jug3 = null;
    }

    /**
     * En este test probamos a asignar dorsales a los jugadores
     * dentro del rango [1,30]
    */
    @Test
    public void testDorsalEnRango(){

        int dorsal1, dorsal2, dorsal3;
        dorsal1 = 1;
        dorsal2 = 30;
        dorsal3 = 15;

        jug1.ponerDorsal(dorsal1);
        jug2.ponerDorsal(dorsal2);
        jug3.ponerDorsal(dorsal3);

        assertEquals(dorsal1, jug1.getDorsal());
        assertEquals(dorsal2, jug2.getDorsal());
        assertEquals(dorsal3, jug3.getDorsal());
    }

    /**
     * En este Test probamos a asignar dorsales fuera del rango [1,30]
    */
    @Test
    public void testDorsalFueraRango(){

        int dorsal1, dorsal2, dorsal3;
        dorsal1 = 0;
        dorsal2 = 31;
        dorsal3 = -5;

        jug1.ponerDorsal(dorsal1);
        jug2.ponerDorsal(dorsal2);
        jug3.ponerDorsal(dorsal3);

        assertEquals(-1, jug1.getDorsal());
        assertEquals(-1, jug2.getDorsal());
        assertEquals(-1, jug3.getDorsal());
    }

    /**
     * En este test comprobamos si un juegador es expulsado
     * en funcion del numero de tarjetas que acumula 
    */
    @Test
    public void testExpulsion(){

        //Sin tarjetas
        assertFalse(jug1.estaExpulsado());
        //Tarjeta roja
        assertTrue(jug2.estaExpulsado());
        //Dos tarjetas amarillas
        assertTrue(jug3.estaExpulsado());
    }
}
