public class test{
	private miColeccion mc;
	
	public test() {
		this.mc= new miColeccion();
	}

	public void procesarDatos() {
		System.out.println("Mi Coleccion 1");
		mc.anexarRegistro(new Estudiante("120","Flor","Caceres"));
		mc.anexarRegistro(new Estudiante("121","Eduardo","Rey"));
	    	mc.anexarRegistro(new Estudiante("122","Martha","Rios"));
		mc.anexarRegistro(new Estudiante("123","Luis","Navas"));
		mc.anexarRegistro(new Estudiante("124","Oscar","Perez"));
		mc.anexarRegistro(new Estudiante("125","Carlos","Rodriguez"));
		mc.anexarRegistro(new Estudiante("126","Julieth","Hernandez"));
		mc.anexarRegistro(new Estudiante("125","Carlos","Rodriguez"));
		mc.anexarRegistro(new Estudiante("125","Carlos","Rodriguez"));
		mc.mostrarContenido();
		
		mc.print2();
		if(mc.evalua()) {
			System.out.println("Colección esta vacia");
		} else{
			System.out.println("Colección con datos");
		}
		
		mc.delete("123");
		System.out.println("borrar 123");
		mc.print();
		
		mc.rm();
		mc.print();
	}
	
	public static void main(String[] args) {
		test tm= new test();
		tm.procesarDatos();
	}
}
