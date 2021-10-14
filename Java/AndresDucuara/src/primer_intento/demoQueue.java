package primer_intento;

public class demoQueue {
	public static void main(String[] args) {
		queue queue = new queue(4);
		queue.entrar(3);
		queue.entrar("hola");
		queue.imprimir();
		queue.quitar();
		queue.imprimir();
		
	}
}
