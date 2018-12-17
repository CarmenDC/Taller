package tallerdeCoches;

import java.util.Date;

public interface Matriculable {
	
	String getMatricula();
	
	default boolean comprobarValidez() {
		return false;
	}
	
	default Date getFechaMatriculacion() {
		return null;
	}

}
