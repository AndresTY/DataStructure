package pilaLibro;
import java.util.Scanner;
public class appLibro {
	StackLibro pila;
	Libro a;
	Scanner input;
	public appLibro() {
		this.pila = new StackLibro();
		this.a = new Libro();
		this.input=new Scanner(System.in);
	}
	
	public void datos() {
		for(char titulo='a';titulo<='z';titulo++) {
			a = new Libro(Character.toString(titulo), "juan", 200, 123.32, "colombia", "planeta"); 
			pila.anexarLibro(a);
		}
		
		pila.listar();
		
		System.out.println("que libro buscar");
		String busc = input.next();
		Libro b = new Libro(busc, "juan", 200, 123.32, "colombia", "planeta");
		
		pila.borrarLibro();
		pila.buscar(b);
		pila.primerLibro();
		pila.listar();
		
	}

	public static void main(String []args) {
		appLibro t = new appLibro();
		t.datos();
	}
}
