import java.util.Scanner;

public class appArbol {
	private Arbol arbol;
	private int dato;
	private Scanner input;
	private Nodo nodo;
	
	public appArbol() {
		this.input = new Scanner(System.in);
		this.dato=0;
		this.arbol=new Arbol(dato);
		this.nodo = new Nodo();
	}
	
	public void menu() {
		int numero;
		nodo = arbol.obtenerRAiz();
		do {
			System.out.println(letras());
			numero = input.nextInt();
			switch(numero) {
			case 1:
				crearArbol();
				break;
			case 2: 
				arbol.imprimirInOrden(nodo);
				System.out.println(" ");
				break;
			case 3: 
				arbol.imprimirPreOrden(nodo);
				System.out.println(" ");
				break;
			case 4: 
				arbol.imprimirPostOrden(nodo);
				System.out.println(" ");
				break;
			case 5:
				buscarDato();
				break;
			}
		}while(numero!=6);
	}
	
	private String letras() {
		String option;
		option = "Arboles Binarios\n\n"+
				"1. crear Arbol\n"+
				"2. imprimir InOrden\n"+
				"3. imprimir PreOrden\n"+
				"4. imprimirPostOrden\n"+
				"5. Buscar elemento\n"+
				"6. Salir\n"+
				"seleccione: ";
		return option;
	}
	
	public void crearArbol() {
		do {
			System.out.println("digite numero: ");
			dato = input.nextInt();
			if(dato != 0)
				arbol.anexar(dato);
		}while(dato != 0);
	}
	
	public void buscarDato() {
		System.out.println("digite numero");
		dato=input.nextInt();
		arbol.buscar(dato, nodo);
	}
	
	public static void main(String [] args){
		appArbol a = new appArbol();
		a.menu();
	}
}
