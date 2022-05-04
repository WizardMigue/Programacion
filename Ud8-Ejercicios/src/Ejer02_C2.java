import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;

public class Ejer02_C2 {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream();
		xstream.alias("ListaPersonasMunicipio", ListaDepartamento.class);
		xstream.alias("DatosPersona", Departamento.class);
		xstream.addImplicitCollection(ListaDepartamento.class, "lista");

		ListaDepartamento listadoTodas = (ListaDepartamento) xstream.fromXML(new FileReader("Documentos/departamentos.xml"));
		System.out.println("Número de Personas: " + listadoTodas.getListaDepartamento().size());
		List<Departamento> listaPersonas = new ArrayList<Departamento>();
		listaPersonas = listadoTodas.getListaDepartamento();

		Iterator iterador = listaPersonas.listIterator();
		while (iterador.hasNext()) {
			Departamento p = (Departamento) iterador.next();
			System.out.println("Nombre: " + p.getNombre() + ", Nacionalidad: " + p.getLocalidad());
		}
		System.out.println("Fin del listado....");
	}

}
