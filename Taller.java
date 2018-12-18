package tallerdeCoches;

import java.util.ArrayList;
import java.util.Collection;


public class Taller <T extends Averiable> {
	
	Collection <T> ListaVehiculosConPiezas = new ArrayList <T> ();
	Collection <T> ListaVehiculosSinPiezas = new ArrayList <T> (); 
	Collection <Pieza> ListaRepuestos = new ArrayList <Pieza>();
	private double costePorHora = 60;
	
	//GETTERS AND SETTERS
	
	Collection<T> getListaVehiculosSinPiezas() {
		return ListaVehiculosSinPiezas;
	}
	
	Collection<T> getListaVehiculosConPiezas() {
		return getListaVehiculosConPiezas();
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
		boolean esReparable=false;
		for (Pieza pieza: vehiculo.getPiezasReparar()) {
				if (ListaRepuestos.contains(pieza)) {
					esReparable = true;
				}
				else {
					esReparable = false;
					ListaVehiculosSinPiezas.add((T) vehiculo);
					break;
				}
		}
		
		if (esReparable) {
			ListaVehiculosConPiezas.add((T) vehiculo);
			System.out.println (vehiculo.toString());
			System.out.println ("Total de horas de reparacion: "+ vehiculo.getNumeroHorasTotalArreglo());
			System.out.println ("Coste total reparacion: "+ (vehiculo.getCostePiezas()+vehiculo.getNumeroHorasTotalArreglo()*costePorHora) + "€");
			System.out.println("");			
		}
		
		if (!esReparable) {
			System.out.println("Faltan piezas para: " + vehiculo.toString());
			System.out.println("");	
		}
	}


}
