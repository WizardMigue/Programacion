package Ejercicios;

public class Pizza {
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	//
	private String tamaño;
	private String tipo;
	private String estado;
	
public Pizza() {
	this.estado = "pedida";
	}

public Pizza(String tamaño, String tipo) {
	this.tamaño = tamaño;
	this.tipo = tipo;
	this.estado = "pedida";
	Pizza.totalPedidas++;
}

public static int getTotalPedidas() {
	return Pizza.totalPedidas;
}



public static int getTotalServidas() {
	return Pizza.totalServidas;
}



public String getTamaño() {
	return tamaño;
}

public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public void sirve() {
	if(estado.equals("pedida")) {
		this.estado="servida";
		Pizza.totalServidas++;
	}else {
		System.out.println("esa pizza ya ha sido servida");
	}
}

@Override
public String toString() {
	return "Pizza tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado +"";
}

}


