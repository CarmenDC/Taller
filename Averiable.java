package tallerdeCoches;

import java.util.Collection;
import java.util.Date;

public interface Averiable {

	Date fechaEntradaTaller();

	Collection<Pieza> getPiezasArreglo();

	boolean getNecesitaReparacion();

	int getNumeroHorasTotalArreglo();
	
	int getTurnoTaller();

}
