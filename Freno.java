package tallerdeCoches;

public class Freno implements Pieza {
	
	String tipo ="freno";
	double precio = 150;
	int horas = 3;
	
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

	public Freno() {
		super();
	}

		
}


