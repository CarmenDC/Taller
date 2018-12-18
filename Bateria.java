package tallerdeCoches;

public class Bateria implements Pieza {

	String tipo ="bateria";
	double precio = 80;
	int horas = 1;
	
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
	
	public Bateria() {
		super();
	}

}
