
abstract public class Usuario extends Elemento {

	protected String login, senha;

	public Usuario() {
		super();
	}

	public Usuario(String str) {
		super(str);
	}

	public Usuario(String str1, String str2, String str3) {
		super(str1);
		login = str2;
		senha = str3;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String str) {
		login = str;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String str) {
		senha = str;
	}

}
