package ejercicio_collecciones2;

public class Producto {

	private int codigo;
	private String nombre;
	private String tipo;
	private Double Precio;
	private int stock;

	public Producto() {

	}

	public Producto(int codigo, String nombre, String tipo, Double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		Precio = precio;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", Precio=" + Precio
				+ ", stock=" + stock + "]";
	}

}
