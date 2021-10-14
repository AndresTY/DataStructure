class nodo{
	info:number;
	name:string;
	conect: nodo;

	constructor( _name:string, _info:number){
		this.name=_name;
		this.info=_info;
	}

	toString(){
		return `[${this.name}|${this.info}]`;
	}
}

class grafo{
	arr:Array<nodo>;
	j:number=0;

	constructor(){
		this.arr=[new nodo("a",1),new nodo("b",2), new nodo("c",3), new nodo("d",4), new nodo("e",5)];
	}

	agregar(i:number, dato:number, name: string):void{
		var p = new nodo(name,dato);
                if(this.isEmpty(i-1)){
			this.arr[i-1]=p;
                }else{
			var aux = this.arr[i-1];
                        while(aux.conect != null){
				aux = aux.conect;
			}
			aux.conect = p;
		}
	}

	isEmpty(i:number):boolean{
		return this.arr[i]==null;
	}

	imprimir(a:nodo):string{
		if(a.conect==null){
			return `${a}`;
		}else{
			return `${a} -> ${this.imprimir(a.conect)}`;
		}
	}

	listar():void{
		this.arr.forEach((a)=>console.log(this.imprimir(a)));
	}

}

var a = new grafo();
for(var i=1; i<6;i++){
	let x:number = Math.floor(Math.random() * (6-1)) + 1;
	a.agregar(x,i,"");
}
a.listar();
