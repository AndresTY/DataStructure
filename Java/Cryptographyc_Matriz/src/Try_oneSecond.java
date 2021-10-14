/***  this file decrypt a word with
 * *  a key through  an array
 * *   
 * *  @ Project : Cryptography_Matriz 
 * *  @ File Name : try_oneSecond.java
 * *  @author: Andres Ducuara V*  @version1.0*/

public class Try_oneSecond {
	private char cryp[][];
	private String abc="abcdefghijklmnopqrstuvwxyz ";
	private String decrypt="";
	private String codigo;
	private String clave;
	private int coordY;
	private int count = 0;
	private int i=0;
	//array size is set
	public Try_oneSecond(String palabra1, String palabra2 ){
		this.cryp = new char[27][27];
		this.codigo = palabra1;
		this.clave = palabra2;
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
	
	public void desencryp(int k, int b) {
		String temp="";
		int tempC=0;
		tempC=count+k;
		count=tempC;	
		if(count>=clave.length()) {
			count=0;
		}
		
		for(int i=0; i<abc.length();i++) {
			if(clave.charAt(count)==cryp[i][0]) {
				System.out.println(cryp[i][0]);
				System.out.println(clave.charAt(count));
				System.out.println(tempC);
				//System.out.println(i);
				//System.out.println(cryp[0][buscar(i,tempC)]);
				temp = decrypt+cryp[0][buscar(i,b)];
				decrypt=temp;
				System.out.println(decrypt);
			}
		}
	}
	public int buscar(int a, int b){
		for(int i=0; i<abc.length();i++) {
			if (codigo.charAt(b)==cryp[a][i]) {
				System.out.println(codigo.charAt(b));
				System.out.println(cryp[a][i]);
				coordY=i;
				
			}
		}
		return coordY;
	}
	public void repetir() {
		boolean t=false;
		int k=0;
		while(t==false) {
			desencryp(k,i);
			k=1;
			i++;
			if(decrypt.length()==codigo.length()) {
				t=true;
			}
		}
	}
}
