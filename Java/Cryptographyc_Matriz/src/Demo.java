/***  this file active a encrypt or decrypt
 * *  @ Project : Cryptography_Matriz 
 * *  @ File Name : Demo.java
 * *  @author: Andres Ducuara V
 * *  @version1.0*/

public class Demo {
	public static void main(String []args) {
		try_one encryp = new try_one("hola mundo");
		Try_oneSecond descryp = new Try_oneSecond("zsbgh lruu","sergio");
		

		//encryp.crear();
		//encryp.encryption("sergio");
		descryp.crear();
		descryp.repetir();
	}
}
