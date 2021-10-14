/***  this class active other class 
 * *  called stack.
 * *  
 * *  @ Project : AndresDucuara_Pila 
 * *  @ File Name : DemaStack.java
 * *  @author: Andres Ducuara V
 * *  @version1.0*/

import java.util.Scanner;

public class DemoStack {
	public static void main (String [] args) {
		boolean t= true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("digite el tamaño del stack");
		stack stack = new stack(input.nextInt());
		
		do {
			System.out.println("-----STACK-----");
			System.out.println("espacio ocupado: "+stack.percenter()+"%");
			System.out.println("1. ingresar");
			System.out.println("2. eliminar");
			System.out.println("3. imprimir");
			System.out.println("4. salir");
			
			switch(input.nextInt()){
			
			case(1):
				System.out.println("digite el elemento a ingresar");
				stack.load(input.next());
				break;
			case(2):
				stack.delete();
				break;
			case(3):
				stack.print();
				break;
			case(4):
				t=false;
				break;
			default:
				System.out.println("repita la seleccion");
				break;
			}
		}while(t=true);
	}
}
