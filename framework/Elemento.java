package framework;


abstract public class Elemento {
	protected String nome;
	
	public Elemento() {
	}
	
	public Elemento (String str) {
		nome = str;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String str) {
		nome = str;
	}
}
