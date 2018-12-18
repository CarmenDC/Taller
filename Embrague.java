package tallerdeCoches;

public class Embrague implements Pieza {

	String tipo ="embrague";
	double precio = 250;
	int horas = 5;
	
	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public int gethorasArreglo() {
		return horas;
	}

	public Embrague() {
		super();
	}

	
}
