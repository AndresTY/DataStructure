
public class vehiculo {
    private String placa;
    private String marca;
    private String color;
    private String modelo;
    private String fecha;
    private Object driver;
    private String hora;

    public vehiculo(String placa, String marca, String color, String modelo, String fecha, Object driver, String hora) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.fecha = fecha;
        this.driver = driver;
        this.hora=hora;
    }
    


	@Override
	public String toString() {
		return "[placa=" + placa + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", fecha="
				+ fecha + ", driver=" + driver + ", hora=" + hora + "]";
	}
    
    
    
}