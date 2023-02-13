package modelo.javabeans;

public class Prueba {

	public static void main(String[] args) {
		Soldado sold1 = new Soldado(false, 5);
		Soldado sold2 = new Soldado(true, 0);
		
		sold2.disparar(sold1);

	}

}
