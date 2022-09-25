package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Diccionario2 {

	public static void main(String[] args) {
		
		HashMap <String, String> diccionario = new HashMap <String, String>();

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
			
		Random random = new Random();
		ArrayList<String> keys = new ArrayList<String>(diccionario.keySet());

		int contador = 0;
		int correctas = 0;
		int incorrectas = 0;
		while (contador<5) {
			
			String randomkey = keys.get(random.nextInt(keys.size()));
			
			System.out.println("Traduce al ingles "+randomkey);
			String respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase(diccionario.get(randomkey))) {
				System.out.println("La respuesta es correcta");
				correctas++;
			}
			else {
				System.err.println("La respuesta es incorrecta");
				incorrectas++;
			}
			contador++;
		}
		
		System.out.println("Has tenido "+correctas+" respuestas correctas");
		System.out.println("Has tenido "+incorrectas+" respuestas incorrectas");
			
		

	}

}
