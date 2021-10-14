package DoulbeCircle;

import java.util.Scanner;

public class demoListaCirD {
	private int numero;
	private ListaCirD lst;
	private String options;
	private Scanner input;
	private int dato;
	private int inicio;
	
	public demoListaCirD() {
		this.numero = 0;
		this.lst = new ListaCirD();
		this.options = "\n1.crear lista\n2.anexar\n3.borrar\n4.imprimir\n5. buscar\n6.exit";
		this.dato = 0;
		this.inicio = 0;
		this.input = new Scanner(System.in);
	}
	
	public void menuOpciones() {
		int opt;
		
		do {
			System.out.println(options);
			opt =input.nextInt();
			switch(opt) {
			case 1: crearlista(); break;
			case 2: anexar(); break;
			case 3: borrar(); break;
			case 4: imprimir(); break;
			case 5: 
				System.out.println("digite la informacion a buscar");
				buscar(input.nextInt());
				break;
			}
		}while(opt != 6);
		System.exit(0);
	}
	
	public void crearlista() {
		lst = new ListaCirD();
		for(int dato = inicio; dato <= 10; dato++) {
			lst.crearLista(dato);;
			this.dato = dato;
		}
		imprimir();
	}
	
	public void anexar() {
		lst.anexarNodo();
	}
	
	public void borrar() {
		System.out.print("digite la info: ");
		lst.borrarNodoPosicion(input.nextInt());
	}
	
	public void imprimir() {
		System.out.println(lst.listarDobleInicio());
		System.out.println(lst.listarDobleFinal());
	}
	
	public void buscar(int n) {
		System.out.println(lst.buscarNodo(n));
	}
	public static void main(String []args) {
		demoListaCirD pkm = new demoListaCirD();
		pkm.menuOpciones();
	}
	
}
