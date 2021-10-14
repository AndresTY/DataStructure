package CircleList;

import java.util.Scanner;

public class demoLista {
	private int numero;
	private ListaCircuilar lst;
	private String options;
	private Scanner opc;
	private int dato;
	private int inicio;
	
	public demoLista() {
		this.numero = 0;
		this.lst = new ListaCircuilar();
		this.options = "\n1.crear lista\n2.anexar\n3.borrar\n4.imprimir\n5. buscar\n6.exit";
		this.dato = 0;
		this.inicio = 0;
		this.opc = new Scanner(System.in);
	}
	
	public void menuOpciones() {
		int opt;
		
		do {
			System.out.println(options);
			opt =opc.nextInt();
			switch(opt) {
			case 1: crearlista(); break;
			case 2: anexar(); break;
			case 3: borrar(); break;
			case 4: imprimir(); break;
			case 5: 
				System.out.println("digite la informacion a buscar");
				buscar(opc.nextInt());
				break;
			}
		}while(opt != 6);
		System.exit(0);
	}
	
	public void crearlista() {
		lst = new ListaCircuilar();
		for(int dato = inicio; dato <= 10; dato++) {
			lst.anexarNodoFinal(dato);
			this.dato = dato;
		}
		imprimir();
	}
	
	public void anexar() {
		if(lst.isvacia())
			dato=0;
		dato++;
		lst.anexarNodoFinal(dato);
		imprimir();
	}
	
	public void borrar() {
		lst.borrar();
		imprimir();
	}
	
	public void imprimir() {
		System.out.println(lst.imprimirLista());
	}
	
	public void buscar(int n) {
		System.out.println(lst.buscar(n));
	}
	public static void main(String []args) {
		demoLista pkm = new demoLista();
		pkm.menuOpciones();
	}
	
}
