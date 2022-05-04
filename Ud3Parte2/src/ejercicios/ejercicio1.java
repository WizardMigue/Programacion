package ejercicios;

public class ejercicio1 {
	private String raza;
	
	private String sexo;
	private String color;
	private boolean mezcla;
	private int edad;
	
	public ejercicio1(String raza, String sexo, String color, int edad) {
		this.raza = raza;
		this.sexo = sexo;
		this.color = color;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public String getSexo() {
		return sexo;
	}

	public String getColor() {
		return color;
	}

	public int getEdad() {
		return edad;
	}
	
	
	public boolean isMezcla() {
		return mezcla;
	}

	public void relincha() {
	    System.out.println("Miauuuu");
	  }
}
