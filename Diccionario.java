package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {

	public static void main(String[] args) {
		
		HashMap <String, String> diccionario = new HashMap <String, String>();
		HashMap <String, String> diccionarioCambio = new HashMap <String, String>();
		diccionario.put("alcalde", "mayor");
		diccionario.put("calcetines", "socks");
		diccionario.put("grapas", "staples");
		diccionario.put("tenedor", "fork");
		diccionario.put("sobrina", "niece");
		diccionario.put("premio", "prize");
		diccionario.put("casi", "almost");
		diccionario.put("vago", "lazy");
		diccionario.put("valioso", "precious");
		diccionario.put("papelera", "bin");
		diccionario.put("camion", "lorry");
		diccionario.put("sabroso", "tasty");
		diccionario.put("lana", "wool");
		diccionario.put("frontera", "border");
		diccionario.put("aficionado", "supporter");
		diccionario.put("terrible", "awful");
		diccionario.put("barba", "beard");
		diccionario.put("pastillas", "pills");
		diccionario.put("paciencia", "patience");
		diccionario.put("celoso", "jeaolus");
		
		Scanner sc = new Scanner (System.in);
		
		boolean salir = false;
		String idioma = "ES";
		
		while (!salir) {
			
			System.out.println("Que quieres hacer?");
			System.out.println("1 - Añadir palabra");
			System.out.println("2 - Modificar o corregir palabra");
			System.out.println("3 - Borrar palabra");
			System.out.println("4 - Traducir palabra");
			System.out.println("5 - Sugerencia segun palabra");
			System.out.println("6 - Cambiar el idioma");
			int opcion = sc.nextInt();
			
			
			if (opcion == 1) {
				System.out.println("¿palabra a añadir?");
				String clave = sc.next();
				System.out.println("¿traduccion?");
				String trad = sc.next();
				diccionario.put(clave, trad);
				System.out.println("La palabra "+clave+" y su traduccion "+trad+" ha sido añadido correctamente");
			}
			
			else if (opcion==2) {
				String opcion2 = "";
				do {
					Set<String> prueba = diccionario.keySet();
					System.out.println("Elige la palabra que quieras modificar de las siguientes "+prueba);
					opcion2 = sc.next();
					
				} while(!diccionario.containsKey(opcion2));
				String traduc2 = diccionario.get(opcion2);
				System.out.println("La traduccion de "+opcion2+" es "+traduc2);
				System.out.println("Introduce la nueva traduccion de "+opcion2);
				String traducNuevo = sc.next();
				diccionario.replace(opcion2, traduc2, traducNuevo);
				System.out.println("Ha sido modificado correctamente");
				
			}
			
			else if (opcion == 3) {
				String opcion2 = "";
				do {
					Set<String> prueba = diccionario.keySet();
					System.out.println("Elige la palabra que quieras eliminar de las siguientes "+prueba);
					opcion2 = sc.next();
					
				} while(!diccionario.containsKey(opcion2));
				diccionario.remove(opcion2);
				System.out.println("La palabra "+opcion2+" ha sido eliminada");
				
			}
			
			else if (opcion == 4) {
				System.out.println("introduce la palabra que quieres traducir");
				String palabra = sc.next();
				String traduccion = diccionario.get(palabra);
				System.out.println("La traduccion de "+ palabra + " es "+ traduccion);
			}
			
			else if (opcion == 5) {
				System.out.println("introduce la palabra para ver sugerencias y su traduccion");
				String palabra = sc.next();
				String comparador = "";
				for (String key : diccionario.keySet()) {
					for (int i = 0; i < key.length()-(palabra.length());i++) {
						String guardaKey = key.substring(i, (i+palabra.length()));
						if (guardaKey.equals(palabra) && (!key.equals(comparador))) {
							String traduc3 = diccionario.get(key);
							System.out.println(key+" - "+traduc3);
							comparador = key;
						}
					}
					
				}
				
			}
			
			
			else if (opcion == 6) {
				
				System.out.println("El idioma actual del diccionario es "+idioma);
				System.out.println("Quieres cambiarlo?si/no");
				String cambiarIdioma = sc.next();
				
				if (cambiarIdioma.equalsIgnoreCase("si") && idioma.equalsIgnoreCase("ES")) {
					for (String key : diccionario.keySet()) {
						diccionarioCambio.put(diccionario.get(key), key);
					}
					diccionario = diccionarioCambio;
					diccionarioCambio.clear();
					if (idioma.equalsIgnoreCase("ES")) {
						System.err.println("El diccionario ahora está en ingles-español");
						idioma = "EN";
					}
					else {
						System.err.println("El diccionario ahora está en español-ingles");
						idioma = "ES";
					}
				}
				
				
			}
			
		}
		
		
		
		

	}

}
