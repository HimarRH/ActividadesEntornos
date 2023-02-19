package programa;

/**
 * La clase Soldado provee métodos que informan sobre el estado de un objeto soldado como:
 * <u>
 * <li>Salud</li>
 * <li>Numero de balas</li>
 * <li>Capacidad de disparo</li>
 * </u>
 * 
 * @author ubbeck
 * @version 1.0
 */

public class Soldado {

    /* ------------------- ATRIBUTOS ------------------- */

    /**
     * Tipo <b>boolean</b>, estado de salud del soldado, true = muerto : false = vivo
    */
    private boolean estaMuerto;

    /**
     * Tipo <b>int</b>, número de balas disponibles
     */
    private int numeroBalas;

    /* ----------------- CONSTRUCTORES ----------------- */

    /**
     * Constructor por defecto
     */
    public Soldado(){
        super();
    }
    
    /**
     * Constructor con todos los parámetros
     * 
     * @param estaMuerto representa estado del soldado
     * @param numeroBalas representa cantidad de balas disponibles
    */
    public Soldado(boolean estaMuerto, int numeroBalas){
        super();
        this.estaMuerto = estaMuerto;
        this.numeroBalas = numeroBalas;
    }

    /* ----------------- GETTERS ----------------- */

    public boolean isEstaMuerto(){
        return estaMuerto;
    }

    public int getNumeroBalas(){
        return numeroBalas;
    }

    /* ----------------- SETTERS ----------------- */
    
    public void setEstaMuerto(boolean estaMuerto){
        this.estaMuerto = estaMuerto;
    }

    public void setNumeroBalas(int numeroBalas){
        this.numeroBalas = numeroBalas;
    }

    /* ----------------- SOBREESCRITURA ----------------- */

    @Override
    public String toString() {
        return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
    }

    /* ----------------- METODOS PROPIOS ----------------- */

    /**
     * Tipo <b>boolean</b>
     * Informa si el objeto soldado puede disparar comprobando si el entero
     * almacenado en su atributo numeroBalas es estrictamente mayor a cero.
     * 
     * @return true si numeroBalas es mayor a 0, en caso contrario false
    */

    public boolean puedeDisparar(){

        return (this.numeroBalas > 0) ? true : false;
    }

    /**
     * Tipo <b>void</b>
     * El soldado que invoca este método dispara al soldado pasado por parámetro
     * El método disminuye en 1 unidad el número de balas del soldado que lo invoca y
     * cambia el estado del soldado pasado por parámeto (recibe el disparo) a estaMuerto = true
     * 
     * @param sol 
    */

    public void disparar(Soldado sol){

        this.numeroBalas--;
        sol.setEstaMuerto(true);
    }
}