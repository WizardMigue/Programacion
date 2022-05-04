package Ejercicios;

public class Pizza {
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	//
	private String tama�o;
	private String tipo;
	private String estado;
	
public Pizza() {
	this.estado = "pedida";
	}

public Pizza(String tama�o, String tipo) {
	this.tama�o = tama�o;
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



public String getTama�o() {
	return tama�o;
}

public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
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
	return "Pizza tama�o=" + tama�o + ", tipo=" + tipo + ", estado=" + estado +"";
}

}


