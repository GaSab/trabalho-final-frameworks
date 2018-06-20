package framework;


public class Produto extends Elemento {

	protected String descricao;
	protected double preco;

	public Produto() {
		super();
	}

	public Produto(String str) {
		super(str);
	}

	public Produto(String str1, String str2, double d) {
		super(str1);
		descricao = str2;
		preco = d;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String str) {
		descricao = str;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		preco = d;
	}

}
