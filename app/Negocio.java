package app;

import framework.Produto;
import framework.Transacao;

public class Negocio extends Transacao {

	public Negocio(Cliente data1, Cliente data2) {
		super(data1, data2);
	}
	
	public void venda(Cliente c, Produto p) {
		double d1 = c.getCarteira(), d2 = p.getPreco();
		if(d1 >= d2) {
			c.getListaCompras().adicionar(1, p);
			c.setCarteira(d1 - d2);
		}
	}

}
