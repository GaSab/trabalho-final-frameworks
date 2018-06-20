package app;

import framework.Produto;

public class Main {
	
	static private Lista listaClientes, estoque;

	public Main() {}

	public static void main(String[] args) {
		listaClientes = new Lista();

		Cliente jose = new Cliente("Jose", "jose@ufc.br", "123456");
		Cliente joao = new Cliente("Joao", "joao@ufc.br", "654321");
		jose.adicionarFundos(200.0);
		listaClientes.adicionar(1, jose);
		listaClientes.adicionar(2, joao);
		((Cliente) listaClientes.getRegistro().get(2)).adicionarFundos(100.0);
		System.out.println(listaClientes.toString());
		
		estoque = new Lista();
		Produto mouse = new Produto("Mouse óptico", "made by Multilaser", 18.0);
		Produto iphone = new Produto("iPhone 6", "made by Apple", 2000.0);
		estoque.adicionar(1, mouse);
		estoque.adicionar(2, iphone);
		System.out.println(estoque.toString());
		
		Negocio.venda(jose, estoque, 1);
		System.out.println(listaClientes.toString());
		System.out.println(estoque.toString());

		Negocio.venda(joao, estoque, 2);
		System.out.println(listaClientes.toString());
		System.out.println(estoque.toString());
	}

}
