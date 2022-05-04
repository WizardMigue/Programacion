import java.util.Date;

public class revistas extends Biblioteca {
	private int numero;

	public revistas(int codigo, String titulo, int anyoPublicacion, int numero) {
		super(codigo, titulo, anyoPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int devuelveAnyo() {
		return this.getAnyoPublicacion();
	}
	
	public int devuelvecodigo() {
		return this.getCodigo();
	}

	@Override
	public String toString() {
		return super.toString() + "revistas [numero=" + numero + "]";
	}

}
