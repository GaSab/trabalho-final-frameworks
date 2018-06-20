package app;

import framework.Produto;

public class Main {
	
	static private Lista listaClientes, estoque;

	public Main() {}

	public static void main(String[] args) {
		listaClientes = new Lista();

		Cliente c1 = new Cliente("Jose", "jose@ufc.br", "123456");
		Cliente c2 = new Cliente("Joao", "joao@ufc.br", "654321");
		listaClientes.adicionar(1, c1);
		listaClientes.adicionar(2, c2);
		
		estoque = new Lista();
		Produto p1 = new Produto("Mouse óptico", "made by Multilaser", 18.0);
		Produto p2 = new Produto("iPhone 6", "made by Apple", 2000.0);
		estoque.adicionar(1, p1);
		estoque.adicionar(2, p2);
	}

}
