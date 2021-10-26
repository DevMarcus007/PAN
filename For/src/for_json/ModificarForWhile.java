package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {

	public static void main(String[] args) {

		// for util se conhece o tamanho do array
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Exercicio: Use um for para imprimir 5 vezes a palavra "Consegui" e o numero
		// de tentativas na frente
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " Consegui");

		}

		// while para quando queremos
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
		Matcher matcher = pattern.matcher(example);

		// verifies full match

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// while pegando so numeros
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("Hello1234goodboy789very2345");
		while (m.find()) {
			System.out.println(m.group());
		}
		
		String text = "John speak and John writes about that,\" \r\r" + "       +\" and John think 2021.10.10 about everything. ";
		
		String nominho = ("John");
		
		Pattern patternNominho = Pattern.compile(nominho);
		
		Matcher matcherNominho = patternNominho.matcher(text);
		
	
		while (matcherNominho.find()) {
			System.out.println("found: " + matcherNominho.group());
		}
		
		int day = 20; switch (day) { case 1: System.out.println("Monday"); break; case 2: System.out.println("Tuesday"); break; case 3: System.out.println("Wednesday"); break; case 4: System.out.println("Thursday"); break; case 5: System.out.println("Friday"); break; case 6: System.out.println("Saturday"); break; case 7: System.out.println("Sunday"); break; default: System.out.println("Looking forward to the Weekend"); } 

	}

}
