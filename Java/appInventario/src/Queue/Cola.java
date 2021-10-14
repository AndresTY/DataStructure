package Queue;

public class Cola {
	private Nodo primero;
	private Nodo Segundo;
	
	public Cola() {
		this.primero = null;
		this.Segundo = null;
	}
	
	public boolean isEmpty() {
		boolean r = false;
		if(primero==null)
			r = true;
		return r;
	}
	public void insertarNodoCola(int x) {
		Nodo p;
		p = new Nodo(x);
		if(isEmpty()) {
			primero = p;
			Segundo = primero;
		}else {
			Segundo.setEnlace(p);
			Segundo = p;
		}
	}
	public int eliminarNodoCola() {
		int aux = 0;
		if(!isEmpty()) {
			Nodo q = primero;
			aux = q.getX();
			primero = q.getEnlace();
		}
		return aux;
	}
	public String imprimirCola() {
		Nodo p = primero;
		String lst = "";
		if(!isEmpty()) {
			while(p!=null) {
				lst+=" "+p.getX();
				p=p.getEnlace();
			}
		}else {
			lst = "cola esta vacia";
		}
		return lst;
	}
}
