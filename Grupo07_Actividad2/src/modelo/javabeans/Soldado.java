package modelo.javabeans;
/**
 * El objetivo de la clase soldado es saber si este está vivo o muerto, además de saber la cantidad de balas que tiene el soldado
 * y si las puede disparar.
 * @author himar
 * @version 1.0
 *
 */

public class Soldado {
/*--ATRIBUTOS DE CLASE--*/
	/**
	 * estaMuerto es un atributo de clase boolean que nos indica como se encuentra el soldado. Será tru si está muerto y false si está vivo.
	 */
	private boolean estaMuerto;
/**
 * numeroBalas es un atributo de clase integer que nos dice el número de balas que tiene la clase soldado.
 */
	private int numeroBalas;

	public Soldado() {
		super();
	}

	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}
/**
 * El método puedeDisparar nos indica si la clase soldado se encuentra en posición de disparar introduciendo el número 
 * de balas de la clase soldado.Para ello se construye a través de un if, donde prueba si el número de balas es mayor que 0 o no.
 * 
 * @return un valor booleano, si hay balas retorna un true y si no hay balas retorna un false.
 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}
	
	/** 
	 * El método disparar nos dice que el soldado está muerto. Para ello se crea un objeto soldado y con el atributo
	 * esta muerto.
	 * @param sol
	 */

	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}
