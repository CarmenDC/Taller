package tallerdeCoches;

import java.util.ArrayList;
import java.util.Collection;

import descargaWeb.Averiable;
import descargaWeb.Pieza;

public class Taller <T extends Averiable> {
	
	Collection <T> ListaVehiculos = new ArrayList <T> (); 
	Collection <Pieza> ListaRepuestos = new ArrayList <Pieza>();
	private double costePorHora = 60;
	
	//GETTERS AND SETTERS
	
	Collection<T> getListaVehiculos() {
		return ListaVehiculos;
	}

	Collection<Pieza> getListaRepuestos() {
		return ListaRepuestos;
	}

	void setListaRepuestos(Collection<Pieza> listaRepuestos) {
		ListaRepuestos = listaRepuestos;
	}

	double getCostePorHora() {
		return costePorHora;
	}

	
	
	public void entradaVehiculoTaller (VehiculoConRuedas vehiculo) {
		ListaVehiculos.add((T) vehiculo);
		boolean esReparable;
		for (Pieza pieza: vehiculo.getPiezasReparar()) {
				if (ListaRepuestos.contains(pieza)) {
					esReparable = true;
				}
				else {
					esReparable = false;
					break;
				}
		if (esReparable) {
			System.out.println (vehiculo.toString());
			System.out.println ("Total de horas de reparacion: "+ vehiculo.getNumeroHorasTotalArreglo());
			System.out.println ("Coste total reparacion: "+ (vehiculo.getCostePiezas()+vehiculo.getNumeroHorasTotalArreglo()*costePorHora) + "€");
			
		}
			
		}
	}


}
