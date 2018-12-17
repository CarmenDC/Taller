package tallerdeCoches;

public class Vehiculo implements Coloreable, ConMasa, Matriculable {
	String modelo;
    String color;
    double masa;

    
       /* (non-Javadoc)
	 * @see mipaquete.Coloreable#getColor()
	 */
    @Override
	public String getColor() {
        return color;
    }


	public void setColor(String color) {
        this.color = color;
    }
    
    public Vehiculo() {
    	super();
    }
    
    public Vehiculo (String color) {
        this();
        setColor(color); // como ya tengo el setter lo utilizo
    }
    
    public Vehiculo (String modelo, String color) {
        this(color);
        this.modelo = modelo;
    }

	@Override
	public double getMasa() {
		return masa;
	}


	@Override
	public String getMatricula() {
		return null;
	}


}
