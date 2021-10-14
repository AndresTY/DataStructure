
public class Arbol {
	private Nodo raiz;
	private Nodo p;
	private Nodo q;

	public Arbol(int x) {
		this.raiz = new Nodo();
		this.p = new Nodo();
		this.q = new Nodo();
		this.raiz.setDerNodo(null);
		this.raiz.setIzqNodo(null);
		this.raiz.setInfo(x);
	}
	
	public Nodo obtenerRAiz() {
		return raiz;
	}
	
	public void anexar(int x) {
		if(raiz.getInfo()==0) {
			raiz.setInfo(x);
		}
		else {
			p=raiz;
			q=p;
			while(q!=null&&p.getInfo() != x) {
				p=q;
				if(x<p.getInfo()) {
					q = q.getIzqNodo();
				}else {
					q = q.getDerNodo();
				}
				if(p.getInfo()==x) {
					System.out.println("dato repetido");
				}
			}
			if(x < p.getInfo()) {
				insertarIzq(p,x);
			}else {
				insertarDer(p,x);
			}
		}
	}
	
	public void insertarIzq(Nodo r, int n){
		Nodo nuevo = new Nodo();
		nuevo.setInfo(n);
		nuevo.setIzqNodo(null);
		nuevo.setDerNodo(null);
		r.setIzqNodo(nuevo);
	}
	
	public void insertarDer(Nodo r, int n){
		Nodo nuevo = new Nodo();
		nuevo.setInfo(n);
		nuevo.setIzqNodo(null);
		nuevo.setDerNodo(null);
		r.setDerNodo(nuevo);
	}
	
	public void buscar(int numero, Nodo r) {
		if(r==null) {
			System.out.println("no Hallado");
			return;
		}
		if(r.getInfo()==numero) {
			System.out.println("encontrado");
			return;
		}else {
			if(numero>r.getInfo())
				buscar(numero, r.getDerNodo());
			else
				buscar(numero, r.getIzqNodo());
		}
	}
	
	public void imprimirPreOrden(Nodo p) {
		if(p!=null) {
			System.out.println(" "+ p.getInfo());
			imprimirPreOrden(p.getIzqNodo());
			imprimirPreOrden(p.getDerNodo());
		}
	}
	
	public void imprimirPostOrden(Nodo p) {
		if(p!=null) {
			imprimirPostOrden(p.getIzqNodo());
			imprimirPostOrden(p.getDerNodo());
			System.out.println(" "+p.getInfo());
		}
	}
	
	public void imprimirInOrden(Nodo p) {
		if(p!=null) {
			imprimirInOrden(p.getIzqNodo());
			System.out.println(" "+ p.getInfo());
			imprimirInOrden(p.getDerNodo());
		}
	}
}
