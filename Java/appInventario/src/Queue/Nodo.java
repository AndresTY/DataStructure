package Queue;

public class Nodo {
	private int x;
	private Nodo enlace;
	
	public Nodo(){
		this.x = 0;
		this.enlace = null;
	}

	public Nodo(int x) {
		this.x = x;
		this.enlace = null;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	
}
