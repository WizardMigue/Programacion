import java.util.Date;

public class libros extends Biblioteca implements Prestable {
	private boolean prestado;

	public libros(int codigo, String titulo, int anyoPublicacion, boolean prestado, Prestable prestable) {
		super(codigo, titulo, anyoPublicacion);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int devuelveAnyo() {
		return this.getAnyoPublicacion();
	}

	public int devuelvecodigo() {
		return this.getCodigo();
	}

	@Override
	public String toString() {
		return super.toString() + "libros [prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {
		
		
	}

	@Override
	public void devolver() {
		
		
	}

	@Override
	public boolean prestado() {
		
		
		
		return false;
	}

}
