package com.crud;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;



@Service
public class ProdutoServiceImpl implements ProdutoService {

	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		Produto chcocolate = new Produto();
		chcocolate.setId("1");
		chcocolate.setNome("Chocolate");
		produtoRepository.put(chcocolate.getId(), chcocolate);

		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(chcocolate.getId(), trufa);
}
	
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
		
	}

	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
		
	}

	@Override
	public Collection<Produto> getProduto() {
		return produtoRepository.values();
	}

	}
