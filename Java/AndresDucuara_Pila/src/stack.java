/***  this class create a Stack to save the data,
 * *  and show all His properties. 
 * *  
 * *  @ Project : AndresDucuara_Pila 
 * *  @ File Name : stack.java
 * *  @author: Andres Ducuara V
 * *  @version1.0*/

public class stack {
	private Object []pila;
	
	public stack(int size){
		this.pila= new Object[size];
	}
	
	public int quantity() {
		int count=0;
		for(int i=0;i<pila.length;i++) {
			if(pila[i]!=null){
				count++;
			}	
		}
		return count;
	}
	
	public void load(Object thing) {
		int k=0;
		boolean t=true;
		while(t==true) {
			if (pila[k]==null) {
				pila[k]= thing;
				t=false;
			}else{
				k++;
			}
			
		}
	}
	
	public void delete() {
		if(quantity()!=0) {
			pila[quantity()-1]=null;
		}else {
			System.out.println("parce no hay nada");
		}
	}
	
	public float percenter() {
		float x = (float)((quantity())*100)/pila.length;
		return x;
	}
	
	public void print() {
		for(int i=0; i<pila.length;i++){
			System.out.print(pila[i]+"||");	
		}
		System.out.println("");
	}
}
