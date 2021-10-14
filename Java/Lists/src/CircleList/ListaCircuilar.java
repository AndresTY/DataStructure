package CircleList;

import DoubleList.Nodo;

public class ListaCircuilar {
	Nodo primerNodo;
	String nombre;
	
	public ListaCircuilar(String s) {
		primerNodo = null;
		nombre = s;
	}
	
	public ListaCircuilar() {
		 this("lista");
	}
	
	public boolean isvacia() {
		return primerNodo==null;
	}
	 
	public String imprimirLista() {
		String laLista =" ";
		if(isvacia()){
			laLista =""+"vacia"+nombre;
		}else {
			laLista += " la "+nombre+" es: ";
			Nodo actual = primerNodo.getProximo();
			laLista += " "+primerNodo.getInfo()+" ";
			while(actual != primerNodo) {
				laLista += ""+actual.getInfo()+" ";
				actual = actual.getProximo();
			}
		}
		return laLista;
	}
	
	public void anexarNodoFinal(int I) {
		if(isvacia()) {
			primerNodo = new Nodo(I);
			primerNodo.setProximo(primerNodo);
		}else {
			Nodo aux = primerNodo;
			while(aux.getProximo() != primerNodo)
				aux=aux.getProximo();
			Nodo temp = new Nodo (I);
			aux.setProximo(temp);
			temp.setProximo(primerNodo);
		}
	}
	
	public boolean borrar() {
		boolean borro = false;
		if(isvacia())
			System.out.println("no hay nada");
		else if(primerNodo.getProximo()==primerNodo) {
			primerNodo=null;
		}else {
			Nodo aux = primerNodo;
			while(aux.getProximo() != primerNodo) {
				aux = aux.getProximo();
			}
			primerNodo = primerNodo.getProximo();
			aux.setProximo(primerNodo);
			borro=true;
		}
		
		return borro;
	}
	
	public boolean buscar(int n) {
		Nodo q = primerNodo;
		boolean encontrado = false;
		while (q.getProximo() != primerNodo && encontrado == false) {
			if(n == q.getInfo()) {
				encontrado = true;
				System.out.println("se encuentra en "+q);
			}else {
				encontrado = false;
			}
			q=q.getProximo();
		}
		return encontrado;
	}
}
