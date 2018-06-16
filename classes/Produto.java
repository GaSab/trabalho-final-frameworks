
abstract public class Produto extends Elemento {

	private protected String nome, descricao, preco;

	public Produto() {
		super();
	}

	public Produto(int i) {
		super(i);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String str) {
		nome = str;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String str) {
		descricao = str;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String str) {
		preco = str;
	}

}
