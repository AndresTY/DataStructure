package pilaLibro;

public class Libro {
	private String titulo;
	private String autor;
	private int numeroPagina;
	private double precio;
	private String isbn;
	private String editorial;
	
	public Libro(String titulo, String autor, int numeroPagina, double precio, String isbn, String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPagina = numeroPagina;
		this.precio = precio;
		this.isbn = isbn;
		this.editorial = editorial;
	}
	
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.numeroPagina = 0;
		this.precio = 0.0;
		this.isbn = "";
		this.editorial = "";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}
