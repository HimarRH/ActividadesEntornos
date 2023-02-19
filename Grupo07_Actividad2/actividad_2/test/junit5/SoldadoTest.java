package junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Soldado;

public class SoldadoTest {
    
    private Soldado sol1;
    private Soldado sol2;

    @BeforeEach
    void setUp() throws Exception{
        //Instancias de clase limpias antes de cada @Test
        sol1 = new Soldado(false, 1);
        sol2 = new Soldado(false, 0);
    }

    @AfterEach
    void tearDown() throws Exception{
        sol1 = null;
        sol2 = null;
    }

    /**
     * En este Test probamos que un soldado con
     * un numero de balas mayor a cero puede disparar
    */
    @Test
    public void testPuedeDisparar(){

        assertTrue(sol1.puedeDisparar());
    }

    /**
     * En este Test probamos que un soldado con un numero de balas
     * menor o igual a cero, no puede disparar 
    */
    @Test
    public void testNoPuedeDisparar(){

        assertFalse(sol2.puedeDisparar());
    }

    /**
     * En este Test comprobamos el numero de balas que tienen los soldados
     */
    @Test
    public void testNumBalas(){

        //Soldado 1, 1 bala
        assertEquals(1, sol1.getNumeroBalas());
        //Soldado 2, 0 balas
        assertEquals(0, sol2.getNumeroBalas());
    }

    /**
     * En este test comprobamos:
     * - Que el soldado 1 puede disparar
     * - Que al disparar, el soldado 1 pierde una bala
     * - Que el soldado 2, al recibir el disparo, muere 
    */
    @Test
    public void testDisparo(){
        
        //El soldado 1 puede disparar
        assertTrue(sol1.puedeDisparar());
        //El solado 1 dispara al soldado 2
        sol1.disparar(sol2);
        //El solado 1 pierde una bala al disparar
        assertEquals(0, sol1.getNumeroBalas());
        //El soldado 2 muere
        assertTrue(sol2.isEstaMuerto());
    }
}
