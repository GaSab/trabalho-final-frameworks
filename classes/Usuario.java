
public class Usuario extends Elemento {

	protected String nome, login, senha;

	public Usuario() {
		super();
	}

	public Usuario(int i) {
		super(i);
	}

	public Usuario(String str1, String str2, String str3) {
		super();
		nome = str1;
		login = str2;
		senha = str3;
	}

}
