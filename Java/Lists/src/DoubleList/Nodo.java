package DoubleList;

public class Nodo {
	private int  info;
	private Nodo anterior;
	private Nodo proximo;
	
	public Nodo() {
		this.info= 0;
		this.anterior= null;
		this.proximo= null;
		}
	
	public Nodo(int info){
		this.info= info;
		this.anterior= null;
		this.proximo= null;
		}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	
}