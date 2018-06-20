package app;

import framework.Usuario;

public class Cliente extends Usuario {

	private double carteira;
	private Lista listaCompras = new Lista();
	
	public Cliente() {
		super();
	}

	public Cliente(String str1, String str2, String str3) {
		super(str1, str2, str3);
	}

	public Cliente(String str) {
		super(str);
	}
	
	public Cliente(String str1, String str2, String str3, double d) {
		super(str1, str2, str3);
		carteira = d;
	}

	public double getCarteira() {
		return carteira;
	}

	public void setCarteira(double d) {
		carteira = d;
	}
	
	public void adicionarFundos(double d) {
		carteira += d;
	}

	public Lista getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(Lista reg) {
		listaCompras = reg;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", carteira=" + carteira + ", listaCompras=" + listaCompras + "]";
	}

}