import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import com.thoughtworks.xstream.*;

public class Ejer02_C1 {
	
	public static void main(String[] args)
			throws TransformerFactoryConfigurationError, TransformerException, IOException {
		File fichero = new File("Documentos/departamento.dat");
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream dataIS = new ObjectInputStream(filein);
		System.out.println("Comienza el proceso de creación del fichero XML..");
		ListaDepartamento listaper = new ListaDepartamento();
		try {
			while (true) {
				Departamento dep = (Departamento) dataIS.readObject();
				listaper.add(dep);
			}
		} catch (EOFException | ClassNotFoundException eo) {
		}
		dataIS.close();
		try {
			XStream xstream = new XStream();
			xstream.alias("ListaDepartamento", ListaDepartamento.class);
			xstream.alias("DatosDepartamento", Departamento.class);
			xstream.addImplicitCollection(ListaDepartamento.class, "lista");
			xstream.toXML(listaper, new FileOutputStream("Documentos/departamentos02.xml"));
			System.out.println("Creado fichero XML...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}