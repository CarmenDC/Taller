package tallerdeCoches;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;


public class EjecutableTaller {

	public static void main(String[] args) throws ParseException {
		
		Taller<Averiable> miTaller = new Taller<>();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Coche coche1 = new Coche ("Seat", "Azul", format.parse("05/11/2018"));
		coche1.setMatricula("3333JJJ");
		Coche coche2 = new Coche ("Fiat", "Rojo", format.parse("11/10/2018"));	
		coche2.setMatricula("0202KHJ");
		Moto moto1 = new Moto ("BMW", "negro", format.parse("25/10/2018"));
		moto1.setMatricula("0001GJJ");
		
		Freno freno1 = new Freno();
		Bateria bateria1 = new Bateria();
		Embrague embrague1 = new Embrague();
		Freno freno2 = new Freno();
		Bateria bateria2 = new Bateria();
				
		miTaller.ListaRepuestos.add(freno1);
		miTaller.ListaRepuestos.add(bateria1);
//		miTaller.ListaRepuestos.add(embrague1);
		miTaller.ListaRepuestos.add(bateria2);
		miTaller.ListaRepuestos.add(freno2);
	
		
		Collection<Pieza> reparacionesCoche1 = new ArrayList<Pieza>();
		reparacionesCoche1.add(freno1);
		reparacionesCoche1.add(bateria1);
		
		Collection<Pieza> reparacionesCoche2 = new ArrayList<Pieza>();
		reparacionesCoche2.add(embrague1);

		Collection<Pieza> reparacionesMoto1 = new ArrayList<Pieza>();
		reparacionesMoto1.add(freno2);
		
		coche1.setPiezasReparar(reparacionesCoche1);
		coche2.setPiezasReparar(reparacionesCoche2);
		moto1.setPiezasReparar(reparacionesMoto1);
		
		miTaller.entradaVehiculoTaller(coche1);
		miTaller.entradaVehiculoTaller(coche2);
		miTaller.entradaVehiculoTaller(moto1);
		
		System.out.println("El orden de vehículos a arreglar del Taller es: ");
		for (Averiable vehiculo : miTaller.ListaVehiculosConPiezas) {
			System.out.println(vehiculo.toString());
		}
		for (Averiable vehiculo : miTaller.ListaVehiculosSinPiezas) {
			System.out.println(""+vehiculo.toString()+" esperando piezas");
		}
		
		
	}

}
