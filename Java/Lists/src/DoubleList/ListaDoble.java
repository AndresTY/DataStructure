package DoubleList;

public class ListaDoble implements ILista{
	private Nodo cabeza;
	private Nodo cola;
	
	public ListaDoble() {
		this.cabeza = null;
		this.cola = null;
	}
	
	public void crearListaDoble (int dato) {
		Nodo nuevo;
		nuevo = new Nodo (dato);
		if(cabeza == null) {
			cabeza = nuevo;
			cola = nuevo;
		}else {
			cola.setProximo(nuevo);
			nuevo.setAnterior(cola);
			cola = nuevo;
			cola.setProximo(null);
		}
	}
	
	public String listarDobleInicio() {
		String str ="";
		Nodo p = cabeza;
		while(p.getProximo()!= null) {
			str += p.getInfo()+" ";
			p = p.getProximo();
		}
		str += p.getInfo() +" ";
		return str;
	}
	
	public String listarDobleFinal() {
		String str = " ";
		Nodo p = cola;
		while(p.getAnterior()!=null) {
			str += p.getInfo() + " ";
			p = p.getAnterior();
		}
		str += p.getInfo()+" ";
		return str;
	}
	
	public boolean buscarNodo(int dato) {
		boolean encontro = false;
		Nodo p = cabeza;
		while(p.getProximo()!= null && encontro == false) {
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
			p.setAnterior(p);
			return true;
		}
	}
	
	public void anexarNodoInicio(){
		Nodo nuevo =new Nodo (cabeza.getInfo()-1);
		cabeza.setAnterior(nuevo);
		nuevo.setProximo(cabeza);
		cabeza=nuevo;
		cabeza.setAnterior(null);
		}
	
	public void anexarNodoFinal(){
		Nodo nuevo = new Nodo (cola.getInfo()+1);
		cola.setProximo(nuevo);
		nuevo.setAnterior(cola);
		cola=nuevo;
		cola.setProximo(null);
		}
	
	public void anexarNodoPosicion(int dato) {
		if(!esVacia()) {
			Nodo p = cabeza;
			Nodo q = cabeza;
			int count = 1;
			while(count < dato) {
				p = p.getProximo();
				count++;
			}
			q = p.getProximo();
			Nodo nuevo = new Nodo (dato);
			p.setProximo(nuevo);
			nuevo.setAnterior(p);
			q.setAnterior(nuevo);
			nuevo.setAnterior(q);
		}
	}
	
	public boolean esVacia() {
		if(cabeza == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean borrarNodoInicio() {
		if(!esVacia())
			return false;
		if(cabeza.getProximo()==null) {
			cabeza = null;
			cola = null;
			return false;
		}else {
			Nodo temp = cabeza;
			cabeza = cabeza.getProximo();
			cabeza.setAnterior(null);
			temp.setProximo(null);
			return true;
		}
	}

	public boolean borrarNodoFinal() {
		if (esVacia())
			return false;
		if(cabeza.getProximo()==null) {
			cabeza = null;
			cola = null;
			return false;
		}else {
			Nodo temp = cola;
			cola = cola.getAnterior();
			cola.setProximo(null);
			temp.setAnterior(null);
			return true;
		}
	}
}

