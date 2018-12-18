package tallerdeCoches;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public abstract class VehiculoConRuedas extends Vehiculo implements Averiable {
	
  int numeroDeRuedas;
  String matricula;
  boolean necesitaReparacion = false;
  Collection <Pieza> piezasReparar = new ArrayList<Pieza>(); 
  Date fechaTaller; 
  int ordenTaller; 
    
	
  //GETTERS AND SETTERS
	public String getMatricula() {
		return matricula;
	}
	
		void setMatricula(String matricula) {
      this.matricula = matricula;
  }
 
	boolean isNecesitaReparacion() {
			return necesitaReparacion;
	}

	void setNecesitaReparacion(boolean necesitaReparacion) {
			this.necesitaReparacion = necesitaReparacion;
	}

	Collection<Pieza> getPiezasReparar() {
			return piezasReparar;
	}

	void setPiezasReparar(Collection<Pieza> piezasReparar) {
			this.piezasReparar = piezasReparar;
	}

	Date getFechaTaller() {
		return fechaTaller;
	}

	void setFechaTaller(Date fechaTaller) {
		this.fechaTaller = fechaTaller;
	}
			
	int getOrdenTaller() {
		return ordenTaller;
	}

	void setOrdenTaller(int ordenTaller) {
		this.ordenTaller = ordenTaller;
	}
	
	
	//CONSTRUCTORES
  public VehiculoConRuedas () {
      this(null, null, null);
  	
  }
    
  public VehiculoConRuedas(String modelo, String color, Date fecha) {
	   	super(modelo, color);
	   	matricula=getMatricula();
	   	fechaTaller=fecha;

	}

	@Override
  public String toString() {
      return "Placa " + matricula + " - " + modelo + " (" + getColor() + ") ";
  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoConRuedas other = (VehiculoConRuedas) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

	  @Override
		public Date fechaEntradaTaller() {
			return fechaTaller;
		}

	public double getCostePiezas() {
		double costeTotalPiezas =0;
		for (Pieza pieza : piezasReparar) {
			costeTotalPiezas += pieza.getPrecio();
		}
		return costeTotalPiezas;
	}

	@Override
	public int getTurnoTaller() {
		return getOrdenTaller();
	}



	
}
