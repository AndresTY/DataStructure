package Invetario1;

public class Nodo {
	private String name;
	private int idProduct;
	private double Precio;
	private int cantidad;
	private Nodo enlace;
	
	public Nodo(){
		this.idProduct=0;
		this.cantidad = 0;
		this.name = " ";
		this.Precio = 0.0;
		this.enlace=null;
	}

	public Nodo(String name, int idProduct, double precio, int cantidad) {
		this.name = name;
		this.idProduct = idProduct;
		Precio = precio;
		this.cantidad = cantidad;
		this.enlace = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	
	
}
