
public abstract class B { // abstract no puede tener objetos
	private static int cuenta = 0;

	private static int getcuenta() {
		return cuenta;
	}

	private String s;
	private final int r = 2;

	public B(String s) {
		cuenta++;
		this.s = s;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public static void setCuenta(int cuenta) {
		B.cuenta = cuenta;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getR() {
		return r;
	}

	public final void metodoX() {
		this.getR();
	}

	@Override
	public String toString() {
		return "B [instancia=" + s + ", r=" + r + "]";
	}

}
