import java.io.Serializable;

public class Departamento implements Serializable {

	private int numDepartamento;
	private String nombre;
	private String localidad;

	public Departamento(int numDepartamento, String nombre, String localidad) {
		this.numDepartamento = numDepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	/**
	 * @return the numDepartamento
	 */
	public int getNumDepartamento() {
		return numDepartamento;
	}

	/**
	 * @param numDepartamento the numDepartamento to set
	 */
	public void setNumDepartamento(int numDepartamento) {
		this.numDepartamento = numDepartamento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Departamento [numDepartamento=" + numDepartamento + ", nombre=" + nombre + ", localidad=" + localidad
				+ "]";
	}

}
