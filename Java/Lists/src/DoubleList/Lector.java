package DoubleList;
import java.util.Scanner;
public class Lector {
	private Scanner sc;

	public Lector() {
		this.sc = new Scanner(System.in);
	}
	
	public void imprimirMensaje(String mens) {
		System.out.println(mens);
	}
	public int leerNumero() {
		return sc.nextInt();
	}
	
}