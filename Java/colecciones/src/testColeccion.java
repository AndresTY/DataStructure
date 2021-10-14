// compilar javac archivo.java -d ~/bin
// ejecutar java archivo (es el .class)

import java.util.ArrayList;

public class testColeccion {
	public static void main(String[] args){
		MyCollection mc = new MyCollection();
		mc.insertToEnd(1);
		mc.insertToEnd(2);
		mc.printList();
		mc.insertToStart(3);
		mc.showCollection();
	}
}
