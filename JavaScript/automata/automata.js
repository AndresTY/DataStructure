//como solo se manejan dos "caminos" ntos los casos son 1 y 0.
const columna = (c)=>{

  switch(c){
    case '1': return 1;
              break;
    case '0': return 0;
              break;
  }

}

//Matriz de transiciones definida segun el ejemplo en el lab.
const transiciones = [
  [1,0],
  [2,1],
  [3,2],
  [4,3]
];

const reconocedor = (cadena)=>{
	let estadoActual = 0;
	for (let i=0;i<=cadena.length-1;i++){
		caracter     = cadena[i];
		estadoActual = transiciones[estadoActual][columna(caracter)];
		estadoActual == 4 | estadoActual == undefined ? i=cadena.length:null; //se toma 4 como el error.
	}
	if (estadoActual==3)
    		return 1;
  	else
    		return 0;
}


console.log('000',reconocedor('000')==1?"reconocida":"no reconocida"); 
console.log('101010',reconocedor('101010')==1?"reconocida":"no reconocida"); 
console.log('11101101110',reconocedor('11101101110')==1?"reconocida":"no reconocida"); 
console.log('00',reconocedor('00')==1?"reconocida":"no reconocida"); 
console.log('1010100',reconocedor('1010100')==1?"reconocida":"no reconocida"); 
console.log('1212',reconocedor('1212')==1?"reconocida":"no reconocida"); 
