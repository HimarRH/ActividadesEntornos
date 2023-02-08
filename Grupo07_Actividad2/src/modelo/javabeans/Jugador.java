package modelo.javabeans;

public class Jugador {

	private int dorsal;
	private int numeroTarjetasAmarillas;
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

	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

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
