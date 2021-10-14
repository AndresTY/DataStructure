class prim{
	mPrim:Array<Array<number>>;
	marcados:Array<number>=[];
	mins:Array<number>=[];
	padres:Array<number>=[];
	suma:number;

	constructor(_nPrim:Array<Array<number>>){
		this.mPrim=_nPrim;
		this.suma=0
	}
	
	iniciar(){
		for( var _i=0, _n=this.mPrim; _i<_n.length;_i++){
			this.marcados[_i]=0;
			this.mins[_i]=_n[0][_i];
			this.padres[_i]=1;
		}
		console.log("******************************")
	}

	captura(){
		this.iniciar();
		this.mins[1]=0;
		this.padres[1]=0;
		this.marcados[1]=1;
		for(var k =0, _nPrim = this.mPrim; k< _nPrim.length;k++){
			var esc = this.buscar();
			this.marcados[esc]=1;
			for(var j=0;j<_nPrim.length;j++){
				if (this.marcados[j]==0 && this.mPrim[esc][j]<this.mins[j]){
					this.mins[j]=this.mPrim[esc][j];
					this.padres[j]=esc;
				}
				console.log(`j: ${j}`);
			}
			console.log(`k: ${k}`);
		}
		console.log(`la suma es ${this.suma}`);
	}

	buscar(){
		var min:number = 200;
		var esc:number = 0;
		for(var i =0, _nprim = this.mPrim;i<_nprim.length;i++){
			if(this.marcados[i] ==0 && this.mins[i]<min){
				min = this.mins[i];
				console.log(`min:  ${min}`);
				esc = i;
			}
		}
		this.mins.forEach((a)=> this.suma += a); 
		console.log(this.mins);
		console.log(`suma ${this.suma}`);
		console.log(`escogido: ${esc}`)
		return esc
	}

	listar(){
		console.log(this.mPrim);
		//this.mPrim.forEach((a)=> a.forEach((b)=> console.log(b)));
	}
}

var matrix: Array<Array<number>> = [[0,4,3,0,1],
	[4,0,0,7,0],
	[3,0,0,5,0],
	[0,7,5,0,0],
	[1,0,0,0,0]];
var temp = new prim(matrix);
temp.listar();
temp.captura();
