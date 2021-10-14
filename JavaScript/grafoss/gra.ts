/**
 * Andres Santiago Ducuara Velasquez
 * grafo de adyacencia no dirigido
 *
 * Salida
 * :!node gra.js
nodo {
  vert: 1,
  next: nodo { vert: 2, next: nodo { vert: 3, next: null } }
}
nodo {
  vert: 2,
  next: nodo { vert: 3, next: nodo { vert: 4, next: nodo { vert: 1, next nodo { vert: 5, next: null} } } }
}
nodo {
  vert: 3,
  next: nodo { vert: 1, next: nodo { vert: 2, next: null } }
}
nodo {
  vert: 4,
  next: nodo { vert: 5, next: nodo { vert: 2, next: null } }
}
nodo {
  vert: 5,
  next: nodo { vert: 2, next: nodo { vert: 4, next: null } }
}

 * */
class nodo{
	vert:number;
	next:nodo;
	
	constructor(data:number){
		this.vert=data;
		this.next=null;
	}
}

class grafo{
	arr: Array<nodo>;
	j:number=0;

	constructor(){
		this.arr=[new nodo(1),new nodo(2), new nodo(3),new nodo(4), new nodo(5)];
	}

	 agregar(i:number, dato:number):void{
		 var p = new nodo(dato);
		 if(this.isEmpty(i-1)){
			 this.arr[i-1]=p;
		 }else{
			 var aux = this.arr[i-1];
			 while(aux.next != null){
				 aux = aux.next;
			 }
			 aux.next = p;
		 }

	}

	isEmpty(i:number):boolean{
		return this.arr[i]==null;
	}

	listar(){
		this.arr.forEach((al)=>console.log(al))
	}
}

var a = new grafo();
a.agregar(1,2);
a.agregar(1,3);
a.agregar(2,3);
a.agregar(2,4);
a.agregar(2,1);
a.agregar(2,5);
a.agregar(3,1);
a.agregar(3,2);
a.agregar(4,5);
a.agregar(4,2);
a.agregar(5,2);
a.agregar(5,4);
a.listar();
