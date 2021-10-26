package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {
	
	public static void main(String[] args) {
		
	try {
		
		//chama a classe e coloca ela no objetinho
		Object objetinho = Class.forName("br.com.pacote.Pessoa").newInstance();
		
		//chama o metodo e coloca ela no metodinho
		Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
		
		//metodinho pode ser visto
		metodinho.setAccessible(true);
		
		String nome = (String) metodinho.invoke(objetinho, "");
			System.out.println(nome);
			
		}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

}
