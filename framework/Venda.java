package framework;

import app.Cliente;

public class Venda extends Transacao {
	
	private Produto p;
	private int valor;

	public Venda(Cliente vendedor, Cliente comprador, Produto prod) {
		super(vendedor,comprador);
		p = prod;
	}

}
