/***  this file encrypted a word with
 * *  a key through  an array
 * *   
 * *  @ Project : Cryptography_Matriz 
 * *  @ File Name : try_one.java
 * *  @author: Andres Ducuara V*  @version1.0*/

public class try_one {
	
	private char cryp[][];
	private String abc="abcdefghijklmnopqrstuvwxyz ";
	private String crypto="";
	private String palabra;
	//array size is set
	public try_one(String palabra1){
		this.cryp = new char[27][27];
		this.palabra = palabra1;
	}
	//make an array 
	public void crear() {
		int k=0;
		String temp;
		String tempAbc;
		for(int i =0; i<27; i++) {           //use 'for' for move in the array
			for(int j=0; j<27;j++) {
					cryp[i][j]=abc.charAt(k);
					k++;
					
			}
			tempAbc=abc.substring(1);         //delete the first item of String
			temp= tempAbc+abc.charAt(0);      //create a new String 
			abc = temp;                       //upload the temp String in abc

			k=0;
		}

	}
	public void encryption(String clave) {
		
		String Key1="";
		String tempC="";
		
		for (int i=0; i<palabra.length();i++) {  
			if(i>=clave.length()) {              //find the Key1 of the word with a 
				i=0;                             //key.
			}                                    
			tempC = Key1 + clave.charAt(i);   
			Key1 = tempC;
			if(Key1.length()==palabra.length()) {
				i = palabra.length();
			}
		}
		System.out.println(Key1);
		System.out.println(palabra);
		imprimir(Key1);
		
	}
	
	public int posicionX(String clave, char letra) {
		int x=0;		
		for(int i=0; i<abc.length();i++) {          //Find key's position 
			if(letra == cryp[0][i]) {               
				x= i;                               
			}
		}
		return x;
	}
	public int posicionY(char letra) {
		int y=0;
		
		for(int i=0; i<abc.length();i++) {
			if(letra==cryp[i][0]) {                //Find word's position
				y= i;
				
			}
		}
		return y;
	}
	
	public void imprimir(String clave) {
		String tempL="";
		int x;
		int y;
		for(int i=0;i<palabra.length();i++) {
			x=posicionX(clave,clave.charAt(i));     //take the character and save
			y=posicionY(palabra.charAt(i));         //in array.
			tempL=crypto+cryp[x][y];                
			crypto=tempL;                           //and add all characters in a  
		}                                           //String
		System.out.println(crypto);
	}
}
