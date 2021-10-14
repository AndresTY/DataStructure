package segundo_intento;

public class DemoCola {
	public static void main(String[] args){
		cola tienda = new cola(4);
		
		tienda.imprimir();
		tienda.llenar("juan");
		tienda.llenar("andres");
		tienda.llenar("maria");
		tienda.imprimir();
		tienda.remover();
	}
}
