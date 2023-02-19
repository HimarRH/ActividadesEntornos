package programa;

/**
 * La clase Jugador provee métodos que gestionan e informan sobre el estado de un objeto jugador como:
 * <u>
 * <li>Dorsal: consulta y modificación</li>
 * <li>Numero tarjetas amarillas</li>
 * <li>Numero tarjetas rojas</li>
 * </u>
 * 
 * @author ubbeck
 * @version 1.0
 */

public class Jugador {
    
    /* ------------------- ATRIBUTOS ------------------- */
    private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;

    /* ------------------- CONSTRUCTORES ------------------- */

    /**
     * Constructor por defecto
    */
    public Jugador(){
        super();
    }

    /**
     * Constructor con todos los parametros
     * 
     * @param dorsal
     * @param numeroTarjetasAmarillas
     * @param numeroTarjetasRojas
    */
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas){
        
        super();
        this.dorsal = dorsal;
        this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
        this.numeroTarjetasRojas = numeroTarjetasRojas;
    }

    /* ----------------- GETTERS ----------------- */

    public int getDorsal(){
        return dorsal;
    }

    public int getNumeroTarjetasAmarillas(){
        return numeroTarjetasAmarillas;
    }

    public int getNumeroTarjetasRojas(){
        return numeroTarjetasRojas;
    }

    /* ----------------- SETTERS ----------------- */

    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }

    public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas){
        this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
    }

    public void setNumeroTarjetasRojas(int numeroTarjetasRojas){
        this.numeroTarjetasRojas = numeroTarjetasRojas;
    }

    /* ----------------- SOBREESCRITURA ----------------- */

    @Override
    public String toString() {
        return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
                + ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
    }

    /* ----------------- METODOS PROPIOS ----------------- */

    /**
     * Tipo <b>void</b>
     * Este método asigna el número de dorsal pasado por parámetro al jugador
     * si este es mayor o igual que 1 y menor o igual que 30
     * 
     * @param dorsal
     */
    public void ponerDorsal(int dorsal){

       this.dorsal = (dorsal >= 1 && dorsal <= 30) ? dorsal : -1;
    }

    /**
     * Tipo <b>boolean</b>
     * Comprueba si el jugador es expulsado en función del número de tarjetas
     * - 2 amarillas -> expulsado
     * - 1 roja -> expulsado
     * 
     * @return true si el jugador tiene 2 tarj amarillas o una tarjeta roja
    */
    public boolean estaExpulsado(){

        return (numeroTarjetasAmarillas == 2 || numeroTarjetasRojas == 1) ? true : false;
    }
}
