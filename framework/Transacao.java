package framework;

abstract public class Transacao {
	
	protected Usuario user;

	public Transacao(Usuario u) {
		user = u;
	}
	
}
