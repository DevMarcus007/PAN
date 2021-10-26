package Array1;

import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMapinho = new HashMap<>();
		hashMapinho.put("procuro", "fui achado hash");
		hashMapinho.put("procuro2", "fui achado hash2");
		
		String value = hashMapinho.get("procuro2");
		System.out.println(value);
		
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("topico 1 da lista de achou");
		lista.add("topico 2 da lista de achou");
		
		String str1 = lista.get(1);
		System.out.println(str1);
	}

}
