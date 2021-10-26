package staticMethod;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println(Product.resultado(10,50));
		
		Product name = new Product();
		System.out.println(name.mudeNomeProduto("João"));
		
		System.out.println(Product.pegarCpf("    10300022255"));
	}

}
