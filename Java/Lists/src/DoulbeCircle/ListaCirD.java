package DoulbeCircle;

import DoubleList.Nodo;

public class ListaCirD {
	private Nodo cabeza;
	private Nodo cola;
	
	public ListaCirD() {
		this.cabeza = null;
		this.cola = null;
	}
	
	public void crearLista (int dato) {
		Nodo nuevo;
		nuevo = new Nodo (dato);
		if(esVacia()) {
			cabeza = nuevo;
			cola = nuevo;
		}else {
			cola.setProximo(nuevo);
			nuevo.setAnterior(cola);
			cola = nuevo;
			cola.setProximo(cabeza);
			cabeza.setAnterior(cola);
		}
	}
	
	public String listarDobleInicio() {
		String str ="";
		Nodo p = cabeza;
		while(p.getProximo()!= cabeza) {
			str += p.getInfo()+" ";
			p = p.getProximo();
		}
		str += p.getInfo() +" ";
		return str;
	}
	
	public String listarDobleFinal() {
		String str = " ";
		Nodo p = cola;
		while(p.getAnterior()!= cola) {
			str += p.getInfo() + " ";
			p = p.getAnterior();
		}
		str += p.getInfo()+" ";
		return str;
	}
	
	public boolean buscarNodo(int dato) {
		boolean encontro = false;
		Nodo p = cabeza;
		while(p.getProximo()!= cabeza && encontro == false) {
			if(p.getInfo()== dato)
				encontro = true;
			p = p.getProximo();
		}
		return encontro;
	}
	
	public boolean borrarNodoPosicion(int dato) {
		if(esVacia())
			return false;
		if(cabeza.getProximo() == null) {
			cabeza = null;
			cola = null;
			return false;
		}else {
			Nodo p = cabeza;
			Nodo q = cola;
			int count = 1;
			while(count <dato) {
				p = p.getProximo();
				count++;
			}
			q = p.getProximo();
			p = p.getAnterior();
			p.setProximo(q);
			q.setAnterior(p);
			return true;
		}
	}
	
	public void anexarNodo(){
		Nodo nuevo =new Nodo (cola.getInfo()+1);
		cola.setProximo(nuevo);
		nuevo.setAnterior(cola);
		cola=nuevo;
		cola.setProximo(cabeza);
		cabeza.setAnterior(cola);;
		}
	
	public boolean esVacia() {
		if(cabeza == null) {
			return true;
		}else {
			return false;
		}
	}
}
