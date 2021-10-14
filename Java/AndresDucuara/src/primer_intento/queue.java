package primer_intento;

public class queue {
	private Object[] cola;
	private int frente;
	private int fin;
	
	public queue(int size){
		cola = new Object[size];
		frente=fin=-1;
	}
	
	public boolean isVacio(){
	return frente == fin;
	}
	
	public boolean isLlena(){
		return (fin == cola.length-1);
	}
	
	public void entrar(Object cosa){
		if(isLlena()){
			System.out.println("is Full");
		}else{
			cola[++fin] = cosa;
		}
	}
	
	public Object quitar(){
		if(isVacio()){
			System.out.println("no hay que quitar");
			return "cola vacia";
		}else{
			return cola[++frente];
		}
	}
	
	public void imprimir(){
		if(isVacio()){
			System.out.println("no hay que mostrar");
		}else if(frente == -1){
			for(int i =0;i<=fin;i++){
				System.out.println(cola[i]);
				
				}
			}
		else{
			for(int j=frente; j<= fin;j++){
				System.out.println(cola[j]);
				}
			}
	}
	
			
}
