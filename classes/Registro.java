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
	
	public void adicionar(Integer i, Elemento e) {
//		reg.putIfAbsent(i, e);
		if(reg.containsKey(i) == false)
			reg.put(i, e);
	} // adicionar um elemento à cadeia, se a chave não tiver sido usada
	
	public void excluir(Integer i) {
		reg.remove(i);
	} // exclui o elemento cuja chave corresponde ao inteiro i

	public void atualizar(Integer i, Elemento e) {
	    if(reg.containsKey(i) == true) {
	    	// reg.put(i, e);
	        reg.replace(i, e);
	    } // atualiza o elemento correspondente à chave
	}

	public Elemento buscar(Integer i) {
	    if(reg.containsKey(i) == true) {
	        return reg.get(i);
	    }
	    return null;
	} // retorna o elemento correspondente à chave

}
