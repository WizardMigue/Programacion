import java.util.ArrayList;
import java.util.List;

public class ListaDepartamento {
	private List<Departamento> lista = new ArrayList<Departamento>();

	public ListaDepartamento() {
	}

	public void add(Departamento dep) {
		lista.add(dep);
	}

	public List<Departamento> getListaDepartamento() {
		return lista;
	}

}
