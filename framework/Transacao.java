package framework;

import app.Cliente;

abstract public class Transacao {
	Cliente u1, u2;

	public Transacao(Cliente data1, Cliente data2) {
		u1 = data1;
		u2 = data2;
	}

}