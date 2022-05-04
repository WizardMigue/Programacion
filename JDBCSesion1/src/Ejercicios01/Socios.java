package Ejercicios01;

public class Socios {

	private int socioID;
	private String nombre;
	private int estatura;
	private int edad;
	private String localidad;

	public Socios(int socioID, String nombre, int estatura, int edad, String localidad) {
		this.socioID = socioID;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}

	/**
	 * @return the socioID
	 */
	public int getSocioID() {
		return socioID;
	}

	/**
	 * @param socioID the socioID to set
	 */
	public void setSocioID(int socioID) {
		this.socioID = socioID;
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
	 * @return the estatura
	 */
	public int getEstatura() {
		return estatura;
	}

	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
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
		return "Socios [socioID = " + socioID + " | nombre = " + nombre + " | estatura = " + estatura + " | edad = "
				+ edad + " | localidad = " + localidad + "]";
	}
}
