package classes;

import app.Cliente;

public class Venda extends Transacao {
	Produto p;
	int valor;

	Venda (Cliente vendedor, Cliente comprador, Produto prod){
		super(vendedor,comprador);
		p = prod;
	}

}