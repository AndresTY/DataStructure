package DoubleList;
public class AppListaDoble {
	private ListaDoble lst;
	private Lector input;
	private int dato;

	public AppListaDoble() {
		this.lst = new ListaDoble();
		this.input = new Lector();
		this.dato = 0;
	}

	public void leerMenu() {
		int numero = 0;
		do {
			input.imprimirMensaje(imprimirMenu());
			numero = input.leerNumero();
			switch(numero) {
			case 1:  crearLista(); break;
			case 2:  listarInicio(); break;
			case 3:  listarFinal(); break;
			case 4:  anexarInicio(); break;
			case 5:  anexarFinal(); break;
			case 6:  anexarPosicion(); break;
			case 7:  buscarNodo(); break;
			case 8:  borrarInicio(); break;
			case 9:  borrarFinal(); break;
			case 10: borrarPosicion(); break;
			}
		}while(numero != 11);
		System.exit(0);
	}
	
	public String imprimirMenu() {
		String menuOpciones =
				"\n1.crear lista\n2. impirmir lista inicio"
				+ "\n3. imprimir lista final"
				+ "\n4. anexar inicio"
				+ "\n5.anexar Final"
				+ "\n6. anexar Posicion"
				+ "\n7. buscar nodo"
				+ "\n8. borrar inicio"
				+ "\n9. borrar final"
				+ "\n10. borrar posicion"
				+ "\n11. salir"
				+ "\nSelecione opción";
		return menuOpciones;	
	}
	
	public void crearLista() {
		lst = new ListaDoble();
		for(int dato =1; dato <= 10; dato++) {
			lst.crearListaDoble(dato);
			this.dato = dato;
		}
		listarInicio();
	}
	
	public void anexarInicio() {
		lst.anexarNodoInicio();
		listarInicio();
	}
	
	public void anexarFinal() {
		lst.anexarNodoFinal();
		listarInicio();
	}
	
	public void anexarPosicion() {
		input.imprimirMensaje("digite la posicio");
		int pos = input.leerNumero();
		lst.anexarNodoPosicion(pos);
		listarInicio();
	}
	
	public void listarInicio() {
		String laLista = lst.listarDobleInicio();
		input.imprimirMensaje(laLista);
	}
	
	public void listarFinal() {
		String laList = lst.listarDobleFinal();
		input.imprimirMensaje(laList);
	}
	
	public void buscarNodo() {
		int n=0;
		input.imprimirMensaje("digite el numero a buscar");
		n = input.leerNumero();
		if(lst.buscarNodo(n)) {
			input.imprimirMensaje("valor encontrado");
		}else {
			input.imprimirMensaje("valor no encontrado");
		}
		listarInicio();
	}
	
	public void borrarInicio() {
		if(lst.borrarNodoInicio()) {
			input.imprimirMensaje("nodo borrado");
		}else {
			input.imprimirMensaje("problemos");
		}
		listarInicio();
	}
	
	public void borrarFinal() {
		if(lst.borrarNodoFinal()) {
			input.imprimirMensaje("nodo borrado");
		}else {
			input.imprimirMensaje("problemos");
		}
	}
	
	public void borrarPosicion() {
		input.imprimirMensaje("pos: ");
		int pos = input.leerNumero();
		if(lst.borrarNodoPosicion(pos)) {
			input.imprimirMensaje("nodo borrado");
		}else {
			input.imprimirMensaje("problemos");
		}
		
		listarInicio();
	}

	public static void main(String []args) {
		AppListaDoble list = new AppListaDoble();
		list.leerMenu();
	}
}
