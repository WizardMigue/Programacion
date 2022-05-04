package _03colecciones2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapPalabras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> traduccion = new HashMap<String, String>();

		traduccion.put("calculadora", "calculator");
		traduccion.put("perro", "dog");
		traduccion.put("gato", "cat");
		traduccion.put("lista", "list");
		traduccion.put("coche", "car");

		traduccion.put("correcto", "correct");
		traduccion.put("programa", "program");
		traduccion.put("destruccion", "destruction");
		traduccion.put("ejemplo", "example");
		traduccion.put("valor", "value");

		traduccion.put("moneda", "coin");
		traduccion.put("verificar", "check");
		traduccion.put("coleccion", "colection");
		traduccion.put("proyecto", "proyect");
		traduccion.put("numero", "number");

		traduccion.put("titulo", "title");
		traduccion.put("encabezado", "header");
		traduccion.put("articulo", "article");
		traduccion.put("introduccion", "introduction");
		traduccion.put("oro", "gold");

		System.out.println("Dame la palabra en español: ");
		String palabra = s.next();
		Iterator it = traduccion.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			String clave = (String) (e.getKey());
			if (clave.equals(palabra.toLowerCase()))
				System.out.println(e.getKey() + " " + e.getValue());
		}

		System.out.printf("\n5 palabras al azar: ");
		for (String key : traduccion.keySet()) 
	        System.out.println(Math.random());
		
			
		
	}

} // de la clase
