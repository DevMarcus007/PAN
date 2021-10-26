package B_Cnpf;

public class Programa {
	
	public static void main(String[] args) {
		System.out.println(Regex.adicionarMascara("1234567890123"));
		
		System.out.println(Regex.adicionarMascara("80267302000160"));
		
		System.out.println(Regex.adicionarMascaraCPF("123456789012"));
		
		System.out.println(Regex.adicionarMascaraCPF("41746870052"));
	}

}
