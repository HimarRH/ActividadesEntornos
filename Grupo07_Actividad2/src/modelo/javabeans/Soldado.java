package modelo.javabeans;

public class Soldado {

	private boolean estaMuerto;

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

	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}
