
public class conductor {
    private String Id;
    private String nombre;
    private String apellido;

    public conductor(String Id, String nombre, String apellido) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

	@Override
	public String toString() {
		return "[Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
    
    
     
}
