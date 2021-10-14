/**
 * no tiene inputs debido a que estas son pormedio de html
 **/

class Grafo{
	Num_vertices:number;
	grafo:Array<number | [number,number]>;

	constructor(Vertices:number){
		this.Num_vertices=Vertices;
		this.grafo=[];
	}

	insertA(v1:number,v2:number,peso:number){
		this.grafo.push(peso,[v1,v2]);
	}
	existA(v1:number,v2:number){
		this.grafo.some(a=>[v1,v2]==a? console.log(true) : console.log(false));
	}
	obtenerP(v1:number,v2:number){
		this.grafo.forEach(a=> a.valueOf() == [v1,v2]? console.log(a):null)
	}
	deleteA(v1:number,v2:number){
		this.grafo.splice(this.grafo.indexOf([v1,v2]),1);
	}
	liberarG(){
		this.grafo=null;
	}
	printG(){
		this.grafo.forEach(a=>console.log(a));
	}
	ady(v:number){
		this.grafo.forEach((a,b:number)=> a == [v,b]||[b,v] ? console.log(true) : console.log(false));		
	}
	primero(v:number){
		this.grafo.forEach((a,b:number)=> a==[v,b+1]||a==[b+1,v]?console.log(a): null); 
	}

	otros(v:number,v2:number){
		this.grafo.forEach((a)=> a==[v,v2+1]?console.log(a): null);
	}
}
class operaciones{
	graf:Grafo;

	constructor(){
		this.graf = new Grafo(20);
	}

	agregar(v1:number, v2:number, peso:number){
		this.graf.insertA(v1, v2, peso);
	}
	borra(v1:number,v2:number){
		this.graf.deleteA(v1, v2);
	}
	delgraf(){
		this.graf.liberarG();
	}
	printgraf(){
		this.graf.printG();
	}
}

class app{
	ope:operaciones;
	constructor(){
		this.ope = new operaciones();
	}
	procda(){
		/**
		 *procesar
		 */
	}
	imprmirmenu(){
		/**
		 *console.log("Menu");
		 *all options
		 **/
	}
	anexA(){
		/**
		 * a=input
		 * b=input
		 * this.ope.agregar(a,b);
		 **/
	}
	borrarA(){
		/**
		 * a=input
		 * b=input
		 * this.ope.borra(a,b);
		 **/
	}
	borrarGra(){
		this.ope.delgraf();
	}
	imprimirgra(){
		this.ope.printgraf();
	}
}
