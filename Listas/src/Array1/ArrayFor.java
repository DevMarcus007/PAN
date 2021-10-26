package Array1;

import java.util.ArrayList;

public class ArrayFor {
	
	public static void main(String[] args) {
		
		ArrayList<String> pessoas = new ArrayList();
		
		pessoas.add("Luiza");
		pessoas.add("Gabriel");
		pessoas.add("Laura");
		pessoas.add("Marcio");
		System.out.println("------ Todas as Pessoas ------");
		
		for (String pessoinha: pessoas) {
			System.out.printf(" Posição %s \n", pessoinha);
		}
		
		
		System.out.println("------ Começa com L ------");
		for (String pessoinha: pessoas) {
			if (pessoinha.charAt(0) == 'L') {
				System.out.printf(" Posição %s \n", pessoinha);
			}
		}
		
		System.out.println("------ Pessoas e Indices ------");
		System.out.println("Indo um por um");
		int i = 0;
		for (String pessoinha: pessoas) {
			System.out.printf("Posição %d- %s \n", i, pessoinha);
			i++;
		}
		
		
	}

}
