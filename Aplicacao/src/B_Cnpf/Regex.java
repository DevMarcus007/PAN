package B_Cnpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static String adicionarMascara(String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})");
		Matcher matcher = pattern.matcher(cnpj);
		
		if(cnpj.length() != 14) {
			System.out.println("Não é CNPF pois não tem 14 dígitos");
			return cnpj;
		}
		else
		{
			return matcher.replaceAll("$1.$2.$3/$4-$5");
		}
	}
		
		public static String adicionarMascaraCPF(String cpf) {
			Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
			Matcher matcher = pattern.matcher(cpf);
			
			if(cpf.length() != 11) {
				System.out.println("Não é CPF pois não tem 11 dígitos");
				return cpf;
			}
			else 
			{
				return matcher.replaceAll("$1.$2.$3-$4");
			}
	
	}

}
