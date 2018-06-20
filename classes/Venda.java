class Venda extends Transacao {
	Produto p;
	int valor;

	Venda (Usuario vendedor, Usuario comprador, Produto prod){
		super(vendedor,comprador);
		p = prod;
	}

}