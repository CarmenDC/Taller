package tallerdeCoches;



import java.util.Collection;
import java.util.Date;


public class Moto  extends VehiculoConRuedas {


	
	public Moto(String modelo, String color, Date date) {
		super(modelo, color, date);
	}

	@Override
	public Collection<Pieza> getPiezasArreglo() {
		return this.getPiezasReparar();
	}

	@Override
	public boolean getNecesitaReparacion() {
		return false;
	}
	
	@Override
	public int getNumeroHorasTotalArreglo() {
		int tiempo = 0;
		for (Pieza pieza : this.getPiezasReparar()) {
			tiempo += pieza.gethorasArreglo();
		}
		return tiempo;
	}

	@Override
	public double getCostePiezas() {
		double coste = 0;
		for (Pieza pieza : this.getPiezasReparar()) {
			coste += pieza.getPrecio();
		}
		return coste;
	}
	
}


