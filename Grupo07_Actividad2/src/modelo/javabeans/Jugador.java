/**
 * El objetivo de la <b>clase jugador<b> se encarga de los dorsales de cada jugador y controlar las tarjetas amarillas y rojas.
 * 
 * @author himar
 * @version 1.0
 */

package modelo.javabeans;

public class Jugador {
	// ATRIBUTO DE CLASE
	/**
	 * Valor númerico para el dorsal.
	 */
	private int dorsal;

	/**
	 * Valor numérico de la cantidad de Tarjetas Amarillas.
	 */
	private int numeroTarjetasAmarillas;

	/**
	 * Valor numérico de la cantidad de Tarjetas Rojas
	 */
	private int numeroTarjetasRojas;

	public Jugador() {
		super();
	}

	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}

	/**
	 * El método recibe un número entero en forma de dorsal y lo califica como
	 * dorsal. Es decir si el número recibido está entre 1 y 30, ese dorsal será el
	 * número correcto de dorsal. Pero si se situa fuera de 1 y de 30, se le
	 * asignara como dorsal el número pasado menos 1.
	 * 
	 * @param dorsal, el dorsal que queremos establecer.
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Esté método se encarga de informar sobre si procede expulsar o no al jugador
	 * en función de las tarjetas recibidas. De tal forma que si: Tiene 1 tarjeta
	 * amarilla: No es expulsado. Tiene 2 tarjetas amarillas: Es expulsado. Tiene 1
	 * tarjeta roja: Es expulsado.
	 * 
	 * @param expulsado. Es un valor booleano.
	 * @return true si cumple con lo dispuesto en el if, es decir tiene 2 tarjetas
	 *         amarillas o 1 tarjeta roja.
	 */

	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}
