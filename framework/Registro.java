package framework;

import java.util.HashMap;
import java.util.Map;

public class Registro {
	
	protected Map<Integer, Elemento> reg;

	public Registro() {
		reg = new HashMap<Integer, Elemento>();
	}
	
	public Map<Integer, Elemento> getRegistro() {
		return reg;
	}

	public void setRegistro(Map<Integer, Elemento> m) {
		reg = m;
	}

	public void adicionar(Integer i, Elemento e) {
		if(reg.containsKey(i) == false)
			reg.put(i, e);
	} // adicionar um elemento a cadeia, se a chave nao tiver sido usada
	
	public void excluir(Integer i) {
		reg.remove(i);
	} // exclui o elemento cuja chave corresponde ao inteiro i

	public void atualizar(Integer i, Elemento e) {
	    if(reg.containsKey(i) == true) {
	    	// reg.put(i, e);
	        reg.replace(i, e);
	    } // atualiza o elemento correspondente a chave
	}

	public Elemento buscar(Integer i) {
	    if(reg.containsKey(i) == true) {
	        return reg.get(i);
	    }
	    return null;
	} // retorna o elemento correspondente a chave

	@Override
	public String toString() {
		return "Registro [reg=" + reg + "]";
	}

}
