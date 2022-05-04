import java.util.Date;

public final class Z extends B implements Comparable<Z>, Saludar{
	private int i;

	public Z(String s, int i) {
		super(s);
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "Z [i=" + i + "]";
	}

	@Override
	public int compareTo(Z o) {
		return (this.i - o.getI());
	}

	public void saludar() {
		int hora = new Date().getHours();
		if (hora >= 7 && hora <=14)
			System.out.println("Buenos dias");
		else
			if(hora >= 14 && hora <=20)
				System.out.println("Buenas tardes");
			else
				if (hora >= 20)
				System.out.println("Buenas noches");
	}

}
