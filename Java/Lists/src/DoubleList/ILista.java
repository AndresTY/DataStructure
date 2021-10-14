package DoubleList;
public interface ILista {
	
	public void crearListaDoble(int dato);
	public void anexarNodoInicio();
	public void anexarNodoPosicion(int dato);
	public boolean esVacia ();
	public boolean buscarNodo(int dato);
	public boolean borrarNodoInicio();
	public boolean borrarNodoFinal();
	public boolean borrarNodoPosicion(int dato);
	public String listarDobleInicio();
	public String listarDobleFinal();
	
}