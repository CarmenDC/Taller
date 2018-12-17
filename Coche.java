package tallerdeCoches;


import java.util.Collection;
import java.util.Date;

import descargaWeb.Pieza;

public class Coche extends VehiculoConRuedas{
	

	public Coche(String modelo, String color, Date fecha) {
		super(modelo, color, fecha);
		
	}



	@Override
	public Collection<Pieza> getPiezasArreglo() {
		return this.getPiezasReparar();
	}

	@Override
	public boolean getNecesitaReparacion() {
		return necesitaReparacion;
	}

	@Override
	public int getNumeroHorasTotalArreglo() {
		int tiempo = 0;
		for (Pieza pieza : this.getPiezasReparar()) {
			tiempo += pieza.getTiempo();
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
