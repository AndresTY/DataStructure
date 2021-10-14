package segundo_intento;

public class cola {
	private Object[] queue;

	private int count;
	
	public cola(int size){
		queue = new Object[size];
		count = -1;
	}
	
	public boolean isVacio(){
		return queue[0] == null;
	}
		
	public boolean isLlena(){
		return (count == queue.length-1);
	}
	
	public void llenar(Object a) {
		for(int i=0; i<= queue.length;i++) {
			if(queue[i]==null) {
				queue[i] = a;
				count++;
				break;
			}
		}
	}
	
	public void remover() {
		Object temp;
		if(isVacio()) {
			System.out.println("esta vacio");
		}else {
			queue[0]= null;
			for(int i=0;i<=count;i++){
				int a = i-1;
				temp = queue[i];
				queue[a]=temp;
			}
		}
	}
	
	public void imprimir(){
		if(isVacio()){
			System.out.println("no hay que mostrar");
		}else if(count == -1){
			for(int i =0;i<=queue.length;i++){
				System.out.println(queue[i]);
				
				}
			}
		else{
			for(int j=0; j<= count;j++){
				System.out.println(queue[j]);
				}
			}
	}
}