package Queue;

public class ColaApp {
	public static void main(String [] args) {
		Cola a = new Cola();
		a.insertarNodoCola(1);
		a.insertarNodoCola(2);
		System.out.println(a.imprimirCola());
		System.out.println(a.isEmpty());
		a.eliminarNodoCola();
		System.out.println(a.imprimirCola());
		a.eliminarNodoCola();
		System.out.println(a.isEmpty());
	}
}
