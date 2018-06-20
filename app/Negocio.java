package app;

import framework.Produto;
import framework.Transacao;

public class Negocio extends Transacao {

	public Negocio(Cliente data) {
		super(data);
	}
	
//	public void venda(Cliente c, Produto p) {
//		double d1 = c.getCarteira(), d2 = p.getPreco();
//		if(d1 >= d2) {
//			c.getListaCompras().adicionar(1, p);
//			c.setCarteira(d1 - d2);
//		}
//	}

	static public void venda(Cliente c, Lista l, Integer i) {
		if(l.getRegistro().containsKey(i) == true) {
			double d1 = c.getCarteira();
			Produto p = (Produto) l.getRegistro().get(i);
			double d2 = p.getPreco();
			if(d1 >= d2) {
				c.getListaCompras().adicionar(i, p);
				c.setCarteira(d1 - d2);
				l.excluir(i);
			} else {
				System.out.println("Compra não concretizada. Saldo insuficiente.");
			}
		}
	}

}
