
public class Nodo {
	private int info;
	private Nodo izqNodo;
	private Nodo derNodo;
	
	public Nodo() {
		this.info = 0;
		this.izqNodo = null;
		this.derNodo = null;
	}
	
	public Nodo(int info) {
		this.info = info;
		this.izqNodo = null;
		this.derNodo = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getIzqNodo() {
		return izqNodo;
	}

	public void setIzqNodo(Nodo izqNodo) {
		this.izqNodo = izqNodo;
	}

	public Nodo getDerNodo() {
		return derNodo;
	}

	public void setDerNodo(Nodo derNodo) {
		this.derNodo = derNodo;
	}
	
}
