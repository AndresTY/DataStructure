package Invetario1;

import java.util.Scanner;

public class inventarioDemo {
	private inventario inv;
	private String menuOpciones;
	private Scanner input;
	
	public inventarioDemo() {
		this.inv = new inventario();
		this.menuOpciones = "Invenario\n"+"=====================\n"+"1.crear inventario\n"
		+"2.buscar producto\n"+"3.menor costo\n"+"4.mayor costo\n"+"5.promedio\n"+"6.cantidad total\n"+
				"7. print\n"+"8.actualizar informacion\n"+"9.borrar\n";
		this.input = new Scanner(System.in);
	}
	
	public void leerMenu() {
		int option;
		do {
			Menu(menuOpciones);
			option = input.nextInt();
			switch(option) {
				case 1: Crear(); break;
				case 2: buscarExistencias(); break;
				case 3: menor(); break;
				case 4: mayor(); break;
				case 5: promedio(); break;
				case 6: cantidad(); break;
				case 7: print(); break;
				case 8: actualizar(); break;
				case 9: borrar(); break;
			}
			
		}while(option != 10);
	}
	
	public void Menu(String main) {
		System.out.println(main);
	}
	public void Crear() {
		System.out.println("creando un nuevo producto");
		System.out.println("digite el id del producto");
		int idProduct = input.nextInt();
		System.out.println("digite el nombre del producto");
		String name = input.next();
		System.out.println("digite el precio");
		double precio = input.nextDouble();
		System.out.println("digite la cantidad");
		int cantidad = input.nextInt();
		inv.createNodos(idProduct, name, precio, cantidad);
	}
	
	public void actualizar(){
		System.out.println("digite el codigo");
		int cod =input.nextInt();
		System.out.println("digite que quere cambiar");
		String condi = input.next();
		System.out.println("digite el cambio");
		String cambio = input.next();
		inv.buscaCodigo(cod, condi, cambio);
	}
	
	public void menor() {
		inv.Barato();
	}
	
	public void mayor() {
		inv.Caro();
	}
	
	public void promedio() {
		System.out.println(inv.promedio());
	}
	
	public void cantidad() {
		inv.canti();
	}
	
	public void print() {
		System.out.println("////////////////////");
		inv.printListR();
		System.out.println("////////////////////");
	}
	
	public void buscarExistencias() {
		System.out.println("digite la id del producto");
		System.out.println(inv.existencias(input.nextInt()));
	}
	
	public void borrar(){
		System.out.println("digite el codigo del producto");
		int cod = input.nextInt();
		inv.deleteLastNodo(cod);
	}
	
	public static void main(String [] args) {
		inventarioDemo a = new inventarioDemo();
		a.leerMenu();
	}
	
}
