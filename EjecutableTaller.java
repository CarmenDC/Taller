package tallerdeCoches;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;


import descargaWeb.Averiable;
import descargaWeb.Pieza;

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
		
		miTaller.ListaRepuestos.add(Pieza.FARO);
		miTaller.ListaRepuestos.add(Pieza.FRENO);
		miTaller.ListaRepuestos.add(Pieza.FRENO);
		miTaller.ListaRepuestos.add(Pieza.BATERIA);
		miTaller.ListaRepuestos.add(Pieza.RUEDA);
		miTaller.ListaRepuestos.add(Pieza.MANGUITO);
		
		Collection<Pieza> reparacionesCoche1 = new ArrayList<Pieza>();
		reparacionesCoche1.add(Pieza.FRENO);
		reparacionesCoche1.add(Pieza.EMBRAGUE);
		
		Collection<Pieza> reparacionesCoche2 = new ArrayList<Pieza>();
		reparacionesCoche2.add(Pieza.MANGUITO);

		Collection<Pieza> reparacionesMoto1 = new ArrayList<Pieza>();
		reparacionesMoto1.add(Pieza.BATERIA);
		
		coche1.setPiezasReparar(reparacionesCoche1);
		coche2.setPiezasReparar(reparacionesCoche2);
		moto1.setPiezasReparar(reparacionesMoto1);
		
		miTaller.entradaVehiculoTaller(coche1);
		miTaller.entradaVehiculoTaller(coche2);
		miTaller.entradaVehiculoTaller(moto1);
		
		
	}

}
