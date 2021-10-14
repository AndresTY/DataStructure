package pilaLibro;
import java.util.Stack;
public class StackLibro {
	private Stack<Libro> pila;

	public StackLibro() {
		this.pila = new Stack<Libro>();
	}
	
	public void anexarLibro(Libro item) {
		pila.push(item);
	}
	
	public void borrarLibro() {
		pila.pop();
	}
	
	public void listar() {
		if(!pila.empty()) {
			System.out.println("la pila es:");
			for(Libro elemto : pila) {
				System.out.println(elemto.getTitulo()+"");
			}
		}
	}
	
	public void primerLibro() {
		System.out.println("primer elemento: "+pila.peek());
	}
	
	public int buscar(Libro item) {
		return pila.search(item);
	}
}
