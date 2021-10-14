package Invetario1;

public class inventario {
	private Nodo first;
	private Nodo second;
	
	public inventario() {
		this.first = null;
		this.second = null;
	}
	
	public void createNodos(int idProduct, String name, double precio, int cantidad) {
		Nodo nuevo = new Nodo(name, idProduct,precio,cantidad);
		if(isEmpty()) {
			first = nuevo;
			second = nuevo;
		}else {
			second.setEnlace(nuevo);
			second = nuevo;
			second.setEnlace(null);
		}
	}
	public boolean isEmpty() {
		return (first == null);
	}
	
	public boolean deleteLastNodo(int cod) {
		if(isEmpty()) 
			return false;
		if(first.getEnlace() == null) {
			first = null;
			second = null;
			return false;
		}else {
			Nodo temp = first;
			Nodo aux = second;
			while(temp.getEnlace() != null) {
				if(temp.getIdProduct() == cod) {
					System.out.println(temp);
					System.out.println(aux);
					aux = temp;
					temp = temp.getEnlace();
				}
			}
			second = aux;
			second.setEnlace(temp);
			System.out.println(aux);
			System.out.println(temp);
			return true;
		}
	}
	
	public String printList(Nodo b) {
		String str = "";
		Nodo p = b;
		if(p!= null) {
			System.out.println(printList(p.getEnlace()));
			str = p.getEnlace() +" | "+ p.getIdProduct()+" | "+p.getName()+" | "+p.getPrecio()+" | "+p.getCantidad();

		}else {
			str = " ";
		}
		return str;
	}
	public void printListR() {
		System.out.println(printList(first));
	}
	public void Caro() {
		Nodo p = first;
		double aux = p.getPrecio();
		while(p != null) {
			if(p.getPrecio() <= aux) {
				aux = p.getPrecio();
			}
			p = p.getEnlace();
		}
		System.out.println(aux);
	}
	public void Barato() {
		Nodo p = first;
		double aux = 0;
		while(p != null) {
			if(p.getPrecio() >= aux) {
				aux = p.getPrecio();
			}
			p = p.getEnlace();
		}
		System.out.println(aux);
	}
	
	public int existencias(int conexion) {
		boolean find = false;
		Nodo p = first;
		int aux = 0;
		while(p != null && find == false) {
			if(p.getIdProduct() == conexion) {
				aux = p.getCantidad();
			}
			p = p.getEnlace();
		}
		return aux;
	}
	
	public int sumaCantidad (int a , Nodo b) {
		int suma = a;
		Nodo q = b;
		if(q != null) {
			suma += sumaCantidad(q.getCantidad(), q.getEnlace());
		}else {
			suma = a;
		}
		return suma;
	}
	
	public void canti() {
		System.out.println(sumaCantidad(0, first));
	}
	
	public double sumaPrecio(double a, Nodo b) {
		double promedio = a;
		Nodo p = b;
		if(p != null) {
			promedio += sumaPrecio(p.getPrecio(), p.getEnlace());
		}else {
			promedio = a;
		}
		return promedio;
	}
	
	public double promedio() {
		double prome;
		prome = sumaPrecio(0, first)/ count();
		return prome;
	}
	
	public void buscaCodigo(int cod,String condi, String cambio) {
		Nodo c = first;
		while(c!= null) {
			if(c.getIdProduct()==cod) {
				cambiar(c, condi , cambio);
			}
			c=c.getEnlace();
		}
	}
	
	public void cambiar(Nodo a , String condi, String cambio) {
		boolean t = true;
		
		if(condi.equals(condi)) {
			a.setName(cambio);
			t = false;
		}
		if(condi == "precio") {
			a.setPrecio(Double.parseDouble(cambio));
			t = false;
		}
		if(condi == "cantidad") {
			a.setCantidad(Integer.parseInt(cambio));
			t = false;
		}
		if(t == true){
			System.err.println("no se registro nada a cambiar");
		}
	}
	
	public int count() {
		int count = 0;
		Nodo q = first;
		while(q.getEnlace() != null) {
			count ++;
			q = q.getEnlace();
		}
		System.out.println(count);
		return count;
	}
	
	//falta eliminar por codigo, pida el codigo busque el nodo y guarde los valores que lo redean
}
