class Estudiantes{
	private id:string;
	private name:string
	private lastname:string;
	
	constructor(_id:string, _name:string, _lastname:string){
		this.id=_id;
		this.name=_name;
		this.lastname=_lastname;
	}

	get Id():string{
		return this.id;
	}
	
	set Id(value:string){
		this.id=value;
	}

	get Name():string{
		return this.name;
	}

	set Name(value:string){
		this.name = value;
	}

	get Lastname():string{
		return this.lastname;
	}

	set Lastname(value:string){
		this.lastname=value;
	}
	toString(){
		return this.id +" "+ this.name + " "+ this.lastname;
	}
}

class Coleccion{
	coleccion: Array<Estudiantes> = [];
	
	insertStudent(student:Estudiantes){
		this.coleccion.push(student);
	}	

	insertFirst(student:Estudiantes){
		this.coleccion.unshift(student);
	}
	
	getFirst(){
		console.log(this.coleccion[0]);
	}

	getLast(){
		console.log((this.coleccion[this.coleccion.length-1]));
	}

	removeFirst(){
		this.coleccion.shift();
	}

	removeLast(){
		this.coleccion.pop();
	}

	removeInfo(index:number){
		this.coleccion.splice(index,1);
	}

	showInfo(){
		console.log(this.coleccion);
	}

	printInfo(){
		this.coleccion.forEach(element => console.log(element));
	}

	updateInfo(index:number, student:Estudiantes){
		this.coleccion.splice(index,0,student);
	}
	
}

class test{
	private mc: Coleccion;
	
	constructor(){
		this.mc = new Coleccion();
	}

	startInfo(){
		this.mc.insertFirst(new Estudiantes("123","Andres","Ducuara"));
		this.mc.insertFirst(new Estudiantes("456","Santigo","Velasquez"));
		this.mc.insertFirst(new Estudiantes("789","amarillo","azul"));
		this.mc.printInfo();
		this.mc.getFirst();
		this.mc.getLast();
		this.mc.removeInfo(2);
		this.mc.showInfo();
	}

}

var tc = new test(); 
tc.startInfo();

