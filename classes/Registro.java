import java.util.HashMap;
import java.util.Map;

public class Registro {
	
	protected Map<Integer, Elemento> reg = new HashMap<Integer, Elemento>();

	public Registro() {
		// exemplo
		reg.put(1, new Elemento());
		reg.put(2, new Usuario("José da Silva", "jose@gmail.com", "123456"));
		reg.put(3, new Produto("Mouse óptico", "made by Multilaser", 18.0));
	}
	
	public void adicionar() {}
	
	public void excluir() {}

}
