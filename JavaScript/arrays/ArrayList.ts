class ArrayList{
	list:Array<String>;

	constructor(){
		this.list = [];
	}
	
	addInfo(str:String){
		this.list.push(str);
	}

	printInfo(){
		console.log(this.list);
	}

	removeInfo(index:number){
		this.list.slice(index,1);
	}

	showList(){
		this.list.forEach(element => console.log(element));
	}

	modifyInfo(index:number, str:String){
		this.list.splice(index, 1,str);
	}
}

class test{
	tecnologia:String[];
	ej = new ArrayList();

	constructor(){
		this.tecnologia= ["IoT","Ciberseguridad","Big Data","Industria 4.0","IA","SDN"];
	}

	copyInfo(){
		this.tecnologia.forEach(element => this.ej.addInfo(element));
	}

	activity(){
		this.copyInfo();
		this.ej.printInfo();
		this.ej.removeInfo(5);
		this.ej.showList();
		this.ej.modifyInfo(4,"Inteligencia Artificial");
		this.ej.showList();
	}
}

const demo = new test();
demo.activity();
