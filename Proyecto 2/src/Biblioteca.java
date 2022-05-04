
public class Biblioteca {

	private int codigo;
	private String titulo;
	private int anyoPublicacion;

	public Biblioteca(int codigo, String titulo, int anyoPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyoPublicacion = anyoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	@Override
	public String toString() {
		return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", anyoPublicacion=" + anyoPublicacion + "]";
	}

}
